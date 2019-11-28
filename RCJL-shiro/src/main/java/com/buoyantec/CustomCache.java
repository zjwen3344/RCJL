package com.buoyantec;

import com.buoyantec.Utils.JWTUtil;
import com.buoyantec.Utils.JedisUtil;
import com.buoyantec.Utils.SerializableUtil;
import com.buoyantec.error.BusinessException;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * @program: RCJL
 * @description:
 * @author: zjwen3344@gmail.com
 * @create: 2019-11-28 15:33
 **/
public class CustomCache <K,V> implements Cache<K,V> {

    //打印错误日志
    private  static Logger logger= LoggerFactory.getLogger(CustomCache.class);

    /**
     * redis-key-前缀-shiro:cache:
     */
    public final static String PREFIX_SHIRO_CACHE = "shiro:cache:";

    /**
     * 过期时间-5分钟
     */
    private static final Integer EXPIRE_TIME = 5 * 60 * 1000;

    /**
     * 缓存的key名称获取为shiro:cache:account
     * @param key
     * @return java.lang.String
     * @author Wang926454
     * @date 2018/9/4 18:33
     */
    private String getKey(Object key){
        return PREFIX_SHIRO_CACHE + JWTUtil.GetUserName(key.toString());
    }

    /**
     * 获取缓存
     */
    @Override
    public Object get(Object key) throws CacheException {
        try {
            if(!JedisUtil.exists(this.getKey(key))){
                return null;
            }
        } catch (BusinessException e) {
            logger.error("通过Key:"+key+"||获取数据时失败，错误原因是："+e.toString());
        }
        try {
            return JedisUtil.getObject(this.getKey(key));
        } catch (BusinessException e) {
            e.printStackTrace();
            logger.error("通过Key:"+key+"||获取数据时失败，错误原因是："+e.toString());
            return null;
        }
    }

    /**
     * 保存缓存
     */
    @Override
    public Object put(Object key, Object value) throws CacheException {
        // 设置Redis的Shiro缓存
        try {
            return JedisUtil.setObject(this.getKey(key), value, EXPIRE_TIME);
        } catch (BusinessException e) {
            e.printStackTrace();
            logger.error("保存缓存时失败KEY:"+key+"||获取数据时失败，错误原因是："+e.toString());
            return null;
        }
    }

    /**
     * 移除缓存
     */
    @Override
    public Object remove(Object key) throws CacheException {
        try {
            if(!JedisUtil.exists(this.getKey(key))){
                return null;
            }
        } catch (BusinessException e) {
            e.printStackTrace();
        }
        try {
            JedisUtil.delKey(this.getKey(key));
        } catch (BusinessException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 清空所有缓存
     */
    @Override
    public void clear() throws CacheException {
        try {
            JedisUtil.getJedis().flushDB();
        } catch (BusinessException e) {
            e.printStackTrace();
        }
    }

    /**
     * 缓存的个数
     */
    @Override
    public int size() {
        Long size = null;
        try {
            size = JedisUtil.getJedis().dbSize();
        } catch (BusinessException e) {
            e.printStackTrace();
        }
        return size.intValue();
    }

    /**
     * 获取所有的key
     */
    @Override
    public Set keys() {
        Set<byte[]> keys = null;
        try {
            keys = JedisUtil.getJedis().keys(new String("*").getBytes());
        } catch (BusinessException e) {
            e.printStackTrace();
        }
        Set<Object> set = new HashSet<Object>();
        for (byte[] bs : keys) {
            try {
                set.add(SerializableUtil.unserializable(bs));
            } catch (BusinessException e) {
                e.printStackTrace();
            }
        }
        return set;
    }

    /**
     * 获取所有的value
     */
    @Override
    public Collection values() {
        Set keys = this.keys();
        List<Object> values = new ArrayList<Object>();
        for (Object key : keys) {
            try {
                values.add(JedisUtil.getObject(this.getKey(key)));
            } catch (BusinessException e) {
                e.printStackTrace();
            }
        }
        return values;
    }

}
