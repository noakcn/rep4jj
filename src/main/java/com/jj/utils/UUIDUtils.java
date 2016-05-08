package com.jj.utils;

import java.util.UUID;

/**
 * Created by yewangwang on 2016/5/5.
 */
public class UUIDUtils {
    public static String generateId() {
        return generateAccessToken().substring(0, 8);
    }

    public static String generateAccessToken() {
        String accessToken = UUID.randomUUID().toString();
        accessToken.replace("-", "");
        return accessToken;
    }
}
