package com.lushuai.service;

import com.lushuai.entity.User;

public interface UserService {
    public User login(String code,String  password);
}
