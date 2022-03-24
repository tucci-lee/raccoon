package com.tuccicode.raccoon.cache;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author tucci.lee
 */
public interface RedisCacheOperate extends CacheOperate {

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
     * 获取匹配的key
     *
     * @param pattern 匹配格式
     * @return 所有匹配的key
     */
    Set<String> keys(String pattern);

    /**
     * 清除匹配的缓存
     *
     * @param pattern 匹配格式
     */
    void clean(String pattern);
}
