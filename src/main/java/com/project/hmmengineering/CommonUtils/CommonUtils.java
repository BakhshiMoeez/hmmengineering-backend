package com.project.hmmengineering.CommonUtils;

import org.springframework.stereotype.Component;

@Component
public class CommonUtils {
    public static boolean isNullOrEmpty(String str) {
        return null == str || str.isEmpty();
    }
}
