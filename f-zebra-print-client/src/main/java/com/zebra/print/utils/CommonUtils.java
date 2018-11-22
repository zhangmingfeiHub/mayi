package com.zebra.print.utils;

import java.util.regex.Pattern;

import org.springframework.util.StringUtils;

public class CommonUtils {

    /**
     * 判断字符串中是否都为数字
     * @param str
     * @return
     * @author mingfei.z
     */
    public static boolean isNumber(String str) {

        if (StringUtils.hasText(str)) {

            Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
            return pattern.matcher(str).matches();
        }

        return false;
    }

}
