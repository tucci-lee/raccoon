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

}
