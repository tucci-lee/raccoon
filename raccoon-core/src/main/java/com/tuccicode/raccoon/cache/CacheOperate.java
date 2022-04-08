package com.tuccicode.raccoon.cache;

import java.util.concurrent.TimeUnit;

/**
 * @author tucci.lee
 */
public interface CacheOperate {
    /**
     * 添加缓存
     *
     * @param key   – 缓存key
     * @param value – 缓存value
     */
    <T> void set(String key, T value);

    /**
     * 添加缓存，有过期时间
     *
     * @param key     缓存key
     * @param value   缓存value
     * @param timeout 过期时间
     * @param unit    过期时间单位
     */
    <T> void set(String key, T value, long timeout, TimeUnit unit);

    /**
     * 获取缓存
     *
     * @param key 缓存key
     * @return 缓存value
     */
    <T> T get(String key);

    /**
     * 删除缓存
     *
     * @param key 缓存key
     */
    void delete(String key);

    /**
     * 获取过期时间
     *
     * @param key 缓存key
     * @return 过期时间/秒
     */
    long getExpire(String key);
}
