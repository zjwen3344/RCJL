package com.buoyantec.Utils;

import com.buoyantec.error.BusinessException;
import com.buoyantec.error.EmBusinessError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import java.util.Set;

/**
 * @program: RCJL
 * @description: JedisUtil工具类
 * @author: zjwen3344@gmail.com
 * @create: 2019-11-28 15:03
 **/
@Component
public class JedisUtil {

    /**
     * Logger
     */
    private static Logger logger = LoggerFactory.getLogger(JedisUtil.class);

    /**
     * Status-OK
     */
    public final static String OK = "OK";

    /**
     * 静态注入JedisPool连接池
     * 本来是正常注入JedisUtil，可以在Controller和Service层使用，但是重写Shiro的CustomCache无法注入JedisUtil
     * 现在改为静态注入JedisPool连接池，JedisUtil直接调用静态方法即可
     * https://blog.csdn.net/W_Z_W_888/article/details/79979103
     */
    private static JedisPool jedisPool;

    @Autowired
    public void setJedisPool(JedisPool jedisPool) {
        JedisUtil.jedisPool = jedisPool;
    }

    /**
     * 获取Jedis实例
     * @param
     * @return redis.clients.jedis.Jedis
     * @author Wang926454
     * @date 2018/9/4 15:47
     */
    public static synchronized Jedis getJedis() throws BusinessException {
        try {
            if (jedisPool != null) {
                Jedis resource = jedisPool.getResource();
                return resource;
            } else {
                return null;
            }
        } catch (Exception e) {
            throw new BusinessException(EmBusinessError.USER_NOT_EXIST,"获取Jedis资源异常:" + e.getMessage());
        }
    }

    /**
     * 释放Jedis资源
     * @param
     * @return void
     * @author Wang926454
     * @date 2018/9/5 9:16
     */
    public static void closePool() throws BusinessException {
        try {
            jedisPool.close();
        }catch (Exception e){
            throw new BusinessException(EmBusinessError.USER_NOT_EXIST,"释放Jedis资源异常:" + e.getMessage());
        }
    }

    /**
     * 获取redis键值-object
     * @param key
     * @return java.lang.Object
     * @author Wang926454
     * @date 2018/9/4 15:47
     */
    public static Object getObject(String key) throws BusinessException {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            byte[] bytes = jedis.get(key.getBytes());
            if(StringUtil.isNotNull(bytes)) {
                return SerializableUtil.unserializable(bytes);
            }
        } catch (Exception e) {
            throw new BusinessException(EmBusinessError.USER_NOT_EXIST,"获取Redis键值getObject方法异常:key=" + key + " cause=" + e.getMessage());
        } finally {
            if(jedis != null) {
                jedis.close();
            }
        }
        return null;
    }

    /**
     * 设置redis键值-object
     * @param key
     * @param value
     * @return java.lang.String
     * @author Wang926454
     * @date 2018/9/4 15:49
     */
    public static String setObject(String key, Object value) throws BusinessException {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            return jedis.set(key.getBytes(), SerializableUtil.serializable(value));
        } catch (Exception e) {
            throw new BusinessException(EmBusinessError.USER_NOT_EXIST,"设置Redis键值setObject方法异常:key=" + key + " value=" + value + " cause=" + e.getMessage());
        } finally {
            if(jedis != null) {
                jedis.close();
            }
        }
    }

    /**
     * 设置redis键值-object-expiretime
     * @param key
     * @param value
     * @param expiretime
     * @return java.lang.String
     * @author Wang926454
     * @date 2018/9/4 15:50
     */
    public static String setObject(String key, Object value, int expiretime) throws BusinessException {
        String result = "";
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            result = jedis.set(key.getBytes(), SerializableUtil.serializable(value));
            if(OK.equals(result)) {
                jedis.expire(key.getBytes(), expiretime);
            }
            return result;
        } catch (Exception e) {
            throw new BusinessException(EmBusinessError.USER_NOT_EXIST,"设置Redis键值setObject方法异常:key=" + key + " value=" + value + " cause=" + e.getMessage());
        } finally {
            if(jedis != null) {
                jedis.close();
            }
        }
    }

    /**
     * 获取redis键值-Json
     * @param key
     * @return java.lang.Object
     * @author Wang926454
     * @date 2018/9/4 15:47
     */
    public static String getJson(String key) throws BusinessException {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            return jedis.get(key);
        } catch (Exception e) {
            throw new BusinessException(EmBusinessError.USER_NOT_EXIST,"获取Redis键值getJson方法异常:key=" + key + " cause=" + e.getMessage());
        } finally {
            if(jedis != null) {
                jedis.close();
            }
        }
    }

    /**
     * 设置redis键值-Json
     * @param key
     * @param value
     * @return java.lang.String
     * @author Wang926454
     * @date 2018/9/4 15:49
     */
    public static String setJson(String key, String value) throws BusinessException {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            return jedis.set(key, value);
        } catch (Exception e) {
            throw new BusinessException(EmBusinessError.USER_NOT_EXIST,"设置Redis键值setJson方法异常:key=" + key + " value=" + value + " cause=" + e.getMessage());
        } finally {
            if(jedis != null) {
                jedis.close();
            }
        }
    }

    /**
     * 设置redis键值-Json-expiretime
     * @param key
     * @param value
     * @param expiretime
     * @return java.lang.String
     * @author Wang926454
     * @date 2018/9/4 15:50
     */
    public static String setJson(String key, String value, int expiretime) throws BusinessException {
        String result = "";
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            result = jedis.set(key, value);
            if(OK.equals(result)) {
                jedis.expire(key, expiretime);
            }
            return result;
        } catch (Exception e) {
            throw new BusinessException(EmBusinessError.USER_NOT_EXIST,"设置Redis键值setJson方法异常:key=" + key + " value=" + value + " cause=" + e.getMessage());
        } finally {
            if(jedis != null) {
                jedis.close();
            }
        }
    }

    /**
     * 删除key
     * @param key
     * @return java.lang.Long
     * @author Wang926454
     * @date 2018/9/4 15:50
     */
    public static Long delKey(String key) throws BusinessException {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            return jedis.del(key.getBytes());
        }catch(Exception e) {
            throw new BusinessException(EmBusinessError.USER_NOT_EXIST,"删除Redis的键delKey方法异常:key=" + key + " cause=" + e.getMessage());
        }finally{
            if(jedis != null) {
                jedis.close();
            }
        }
    }

    /**
     * key是否存在
     * @param key
     * @return java.lang.Boolean
     * @author Wang926454
     * @date 2018/9/4 15:51
     */
    public static Boolean exists(String key) throws BusinessException {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            return jedis.exists(key.getBytes());
        }catch(Exception e) {
            throw new BusinessException(EmBusinessError.USER_NOT_EXIST,"查询Redis的键是否存在exists方法异常:key=" + key + " cause=" + e.getMessage());
        }finally{
            if(jedis != null) {
                jedis.close();
            }
        }
    }

    /**
     * 模糊查询获取key集合
     * @param key
     * @return java.util.Set<java.lang.String>
     * @author Wang926454
     * @date 2018/9/6 9:43
     */
    public static Set<String> keysS(String key) throws BusinessException {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            return jedis.keys(key);
        }catch(Exception e) {
            throw new BusinessException(EmBusinessError.USER_NOT_EXIST,"模糊查询Redis的键集合keysS方法异常:key=" + key + " cause=" + e.getMessage());
        }finally{
            if(jedis != null) {
                jedis.close();
            }
        }
    }

    /**
     * 模糊查询获取key集合
     * @param key
     * @return java.util.Set<java.lang.String>
     * @author Wang926454
     * @date 2018/9/6 9:43
     */
    public static Set<byte[]> keysB(String key) throws BusinessException {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            return jedis.keys(key.getBytes());
        }catch(Exception e) {
            throw new BusinessException(EmBusinessError.USER_NOT_EXIST,"模糊查询Redis的键集合keysB方法异常:key=" + key + " cause=" + e.getMessage());
        }finally{
            if(jedis != null) {
                jedis.close();
            }
        }
    }

    /**
     * 获取过期剩余时间
     * @param key
     * @return java.lang.String
     * @author Wang926454
     * @date 2018/9/11 16:26
     */
    public static Long getExpireTime(String key) throws BusinessException {
        Long result = -2L;
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            result = jedis.ttl(key);
            return result;
        } catch (Exception e) {
            throw new BusinessException(EmBusinessError.USER_NOT_EXIST,"获取Redis键过期剩余时间getExpireTime方法异常:key=" + key + " cause=" + e.getMessage());
        } finally {
            if(jedis != null) {
                jedis.close();
            }
        }
    }
}
