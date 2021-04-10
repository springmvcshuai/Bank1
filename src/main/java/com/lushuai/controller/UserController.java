package com.lushuai.controller;

import com.lushuai.common.JsonResult;
import com.lushuai.entity.User;
import com.lushuai.utils.StrUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/query.do")
    @ResponseBody
    public JsonResult getLoginInfo(HttpSession session){
        User user = (User) session.getAttribute(StrUtils.LOGIN_USER);
        JsonResult result = null;
        if (user != null){
             result = new JsonResult(1, user);
        }else {
            result = new JsonResult(0,"用户未登录");
        }
        return result;
    }
}
