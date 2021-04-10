package com.lushuai.dao;


import com.lushuai.entity.User;

public interface UserDao {
    public User findByCode(String code);
}
