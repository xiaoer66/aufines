package com.aufine.util;

import java.util.regex.Matcher;

public class CharacterUtils {
    /**
     * 在Json中
     *
     * [ ... ] 代表数组
     *
     * { ... }  代表对象
     *
     * 由于某些转义json数据的特殊性，首先得去除 $ 符号，接着还需要去除符号
     * @param json
     * @return
     */
    public static String disposeJson(String json){
        String result1 = json.replaceAll("\\\\", "");
        String result2 = result1.replaceAll(Matcher.quoteReplacement("$"), "");
        String result3 = result2.substring(1, result2.length()-1);
        return result3;
    }
}
