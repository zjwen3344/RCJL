package com.buoyantec;

/**
 * @program: RCJL
 * @description: 缓存(Cache)管理器
 * @author: zjwen3344@gmail.com
 * @create: 2019-11-28 15:53
 **/
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.apache.shiro.cache.CacheManager;

/**
 * 重写Shiro缓存管理器
 * @author Wang926454
 * @date 2018/9/4 17:41
 */
public class CustomCacheManager implements CacheManager {
    @Override
    public <K, V> Cache<K, V> getCache(String s) throws CacheException {
        return new CustomCache<K,V>();
    }
}
