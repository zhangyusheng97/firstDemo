package com.hust26.wishbottle.controller;

import com.hust26.wishbottle.model.DataModel;
import com.hust26.wishbottle.entity.Manager;
import com.hust26.wishbottle.repository.ManagerRepository;
import com.hust26.wishbottle.service.ManagerService;
import com.sun.javafx.sg.prism.NGShape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class ManagerController {
    @Autowired
    ManagerService managerService;

    @RequestMapping("/list")
    public String list(Model model) {
        List<Manager> managerList = managerService.findAllManager();
        model.addAttribute("managerList",managerList);
        return "admin/list";
    }

    //跳转至添加管理员页面
    @RequestMapping("/index")
    public String index(){

        return "admin/index";
    }

    //保存操作，添加操作
    @RequestMapping("/save")
    public String save(@RequestParam("account") String account,
                       @RequestParam("psd") String psd,
                       ModelMap map){
            Manager manager = managerService.findManager(account);
            if (manager == null) {
                managerService.saveManager(account, psd);
                map.put("msg", "操作成功");
                map.put("url", "/wishbottle/admin/list");
                return "zujian/success";
            } else {
                map.put("msg", "用户名已存在");
                map.put("url", "/wishbottle/admin/index");
                return "zujian/error";
            }
    }

    //修改操作
    @RequestMapping("/change")
    public String change(@RequestParam("id") Integer id,
                         Model model){
        Manager manager = managerService.findById(id);
        model.addAttribute("manager",manager);
        return "admin/change";
    }

    //保存修改操作
    @RequestMapping("/changeManager")
    public String changeManager(@RequestParam("id") Integer id,
                                @RequestParam("account") String account,
                                @RequestParam("psd") String psd,
                                ModelMap map){
        Manager manager = managerService.findById(id);
        manager.setAccount(account);
        manager.setPsd(psd);
        managerService.save(manager);
        map.put("msg", "操作成功");
        map.put("url", "/wishbottle/admin/list");
        return "zujian/success";
    }



    //删除操作
    @RequestMapping("/delete")
    public String deleteManager(@RequestParam("id") Integer id,
                              ModelMap map) {
        managerService.deleteManager(id);
        map.put("msg","删除成功");
        map.put("url","/wishbottle/admin/list");
        return "zujian/success";
    }
}
