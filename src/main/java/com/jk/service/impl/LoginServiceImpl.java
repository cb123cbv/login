package com.jk.service.impl;

import com.jk.bean.Users;
import com.jk.mapper.LoginsMapper;
import com.jk.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private LoginsMapper loginMapper;


    @Override
    public Users getLogin(Users users) {

        return loginMapper.getLogin(users);
    }

    @Override
    public void toRegist(Users users) {
        loginMapper.toRegist(users);
    }

    @Override
    public Users getloginAcct(Users users) {
        return loginMapper.getloginAcct(users);
    }
}
