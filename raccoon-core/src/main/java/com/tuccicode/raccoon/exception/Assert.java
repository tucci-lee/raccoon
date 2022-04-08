package com.tuccicode.raccoon.exception;

import java.util.Collection;
import java.util.Map;

/**
 * assert
 *
 * @author tucci.lee
 */
public abstract class Assert {

    public static void isNull(Object obj, int code, String msg) {
        if (obj != null) {
            throw new BizException(code, msg);
        }
    }

    public static void isNull(Object obj, BizCode errorCode) {
        isNull(obj, errorCode.getCode(), errorCode.getMessage());
    }

    public static void notNull(Object obj, int code, String message) {
        if (obj == null) {
            throw new BizException(code, message);
        }
    }

    public static void notNull(Object obj, BizCode errorCode) {
        notNull(obj, errorCode.getCode(), errorCode.getMessage());
    }

    public static void isTrue(boolean expression, int code, String message) {
        if (!expression) {
            throw new BizException(code, message);
        }
    }

    public static void isTrue(boolean expression, BizCode errorCode) {
        isTrue(expression, errorCode.getCode(), errorCode.getMessage());
    }

    public static void notEmpty(CharSequence obj, int code, String message) {
        if (obj == null || obj.length() == 0) {
            throw new BizException(code, message);
        }
    }

    public static void notEmpty(CharSequence obj, BizCode errorCode) {
        notEmpty(obj, errorCode.getCode(), errorCode.getMessage());
    }

    public static void notEmpty(Collection<?> collection, int code, String message) {
        if (collection == null || collection.isEmpty()) {
            throw new BizException(code, message);
        }
    }

    public static void notEmpty(Collection<?> collection, BizCode errorCode) {
        notEmpty(collection, errorCode.getCode(), errorCode.getMessage());
    }

    public static void notEmpty(Map<?, ?> map, int code, String message) {
        if (map == null || map.isEmpty()) {
            throw new BizException(code, message);
        }
    }

    public static void notEmpty(Map<?, ?> map, BizCode errorCode) {
        notEmpty(map, errorCode.getCode(), errorCode.getMessage());
    }

    public static void notEmpty(Object[] array, int code, String message) {
        if (array == null || array.length == 0) {
            throw new BizException(code, message);
        }
    }

    public static void notEmpty(Object[] array, BizCode errorCode) {
        notEmpty(array, errorCode.getCode(), errorCode.getMessage());
    }
}
