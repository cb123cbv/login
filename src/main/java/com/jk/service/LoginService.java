package com.jk.service;

import com.jk.bean.Users;

public interface LoginService {

    Users getLogin(Users users);

    void toRegist(Users users);

    Users getloginAcct(Users users);
}
