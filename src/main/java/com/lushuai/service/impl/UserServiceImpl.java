package com.lushuai.service.impl;

import com.lushuai.dao.UserDao;
import com.lushuai.entity.User;
import com.lushuai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
   @Autowired
    private UserDao userDao;


    @Override
    public User login(String code, String password) {
        User user = userDao.findByCode(code);
        if (user == null){
            throw new RuntimeException("账号不存在");
        }
        if (!user.getPassword().equals(password)){
            throw new RuntimeException("密码错误");
        }
        return user;
    }
}
