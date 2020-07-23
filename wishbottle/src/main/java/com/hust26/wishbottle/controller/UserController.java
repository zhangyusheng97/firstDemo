package com.hust26.wishbottle.controller;

import com.hust26.wishbottle.entity.User;
import com.hust26.wishbottle.model.DataModel;
import com.hust26.wishbottle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 添加用户的接口
     * 和小程序相连接传入用户信息
     * @param user 其中id name avatar gender age不能为空
     * @return model
     */
    @GetMapping("/adduser")
    private DataModel addUser(User user) {
        DataModel model = new DataModel();
        try {
            model.setData(userService.addUser(user));
        } catch (Exception e) {
            model.setCode(1);
            model.setErrorMsg("调用接口失败");
        }
        return model;
    }

    @RequestMapping("/list")
    public String list(Model model) {
        List<User> userList = userService.findAllUser();
        model.addAttribute("userList",userList);
        return "user" +
                "/list";
    }
//获取性别信息
    @RequestMapping("/getGender")
    @ResponseBody
    public List<User> getAge(Model model){
        List<User> userList = userService.findAllUser();
        return userList;
    }

    @RequestMapping("/gender")
    public String gender(){
        return "user/gender";
    }

//获取年龄信息
@RequestMapping("/age")
    public String age(){
        return "user/age";
}

//获取地域信息
    @RequestMapping("/city")
    public String city(){
        return "user/city";
    }
}
