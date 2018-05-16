package com.demo.common.controller;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.demo.common.model.User;
import com.jfinal.core.Controller;

public class UserController extends Controller{
    public void index() {
        /*setAttr("users", User.me.find("select * from user"));
        System.out.println("user的用户信息...");
        System.out.println(User.me.find("select * from user"));*/
        List<User> users = User.me.find("select * from user");
        System.out.println(users);
        JSONObject json = new JSONObject();
        /*for(int i = 0; i < users.size(); i++){
            json.put(i, users[i]);
        }*/
        json.put("data", users);
        json.put("status", "200");
        /*renderText("user");*/
        renderJson(json);
    }
}
