package com.aufine.util;

import com.google.gson.Gson;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 让文本输出流打印变得简单点....
 */
public class PrintWriterUtil {
    /**
     * 返回字符串统一打印，object
     * @param response
     * @param o
     */
    public static void returnStr(HttpServletResponse response, Object o){
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        PrintWriter out;
        try {
            out = response.getWriter();
            Gson gson=new Gson();
            out.print(gson.toJson(o));
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
