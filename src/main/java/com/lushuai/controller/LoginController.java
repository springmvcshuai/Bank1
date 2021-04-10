package com.lushuai.controller;

import com.lushuai.common.JsonResult;
import com.lushuai.entity.User;
import com.lushuai.service.UserService;
import com.lushuai.utils.StrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login.do")
    @ResponseBody
    public JsonResult login(String username, String password, HttpSession session){
        User user = userService.login(username, password);
        session.setAttribute(StrUtils.LOGIN_USER,user);

        JsonResult result = new JsonResult(1,null);
        return result;
    }
}
