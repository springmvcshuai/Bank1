package com.lushuai.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lushuai.common.JsonResult;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class JsonUtils {

    public static void writeJsonInfo(int code, Object info, HttpServletResponse response){
        JsonResult r = new JsonResult(code, info);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String jsonInfo = objectMapper.writeValueAsString(r);
            PrintWriter writer = response.getWriter();
            writer.write(jsonInfo);
            writer.flush(); // 刷新缓存
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
