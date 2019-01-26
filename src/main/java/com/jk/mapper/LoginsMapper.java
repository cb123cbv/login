package com.jk.mapper;

import com.jk.bean.Users;

public interface LoginsMapper {

    Users getLogin(Users users);


    void toRegist(Users users);

    Users getloginAcct(Users users);
}
