package com.jk.controller;

import com.jk.bean.Users;
import com.jk.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
  @Resource
  private LoginService loginService;

  @ResponseBody
  @RequestMapping("login")
  public Users getLogin(@RequestBody Users users, HttpSession session){
    Users  usersFromdb = loginService.getLogin(users);
    session.setAttribute("user",usersFromdb);

    return usersFromdb;
  }
  @ResponseBody
  @RequestMapping("getloginAcct")
  public Users getloginAcct(@RequestBody Users users){
    Users  usersFromdb = loginService.getloginAcct(users);
    return usersFromdb;
  }
  @ResponseBody
  @RequestMapping("addUsers")
  public String toRegist(@RequestBody Users users) {

    loginService.toRegist(users);
    return "1";
  }

}
