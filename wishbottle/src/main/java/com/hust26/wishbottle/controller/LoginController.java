package com.hust26.wishbottle.controller;

import com.hust26.wishbottle.entity.Manager;
import com.hust26.wishbottle.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@Controller
public class LoginController {

    @Autowired
    ManagerService managerService;

    @RequestMapping("/login")
    public String login() {
        return "zujian/loginView";
    }

    @RequestMapping("/loginAdmin")
    public String loginAdmin(@RequestParam("account") String account,
                             @RequestParam("psd") String psd,
                             Model model) {
        Manager manager = managerService.findManager(account);
        if (manager != null && manager.getPsd().equals(psd)) {
            return "first/list";
        } else {
            model.addAttribute("msg","用户名或密码错误");
            return "zujian/loginView";
        }
    }

    @RequestMapping("/logoutAdmin")
    public String logoutAdmin(){
        return "zujian/loginView";
    }

}