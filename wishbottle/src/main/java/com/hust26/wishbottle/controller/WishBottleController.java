package com.hust26.wishbottle.controller;

import com.hust26.wishbottle.entity.WishBottle;
import com.hust26.wishbottle.service.WishBottleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/wishbottle")
public class WishBottleController {
    @Autowired
    WishBottleService wishBottleService;

    @RequestMapping("/list")
    public String wishList(Model model){
        List<WishBottle> wishList =wishBottleService.findAll();
        model.addAttribute("wishList",wishList);
        return "/wishbottle/list";
    }

    //与小程序界面链接传送数据 /wishbottle/wishbottle/getwish
    @RequestMapping("/getwish")
    public void getwish(@RequestParam("writeID") String writeId,
                        @RequestParam("content") String content){
        wishBottleService.save(writeId,content);
    }

    //删除操作
    @RequestMapping("/delete")
    public String deleteTree(@RequestParam("id") Integer id,
                             ModelMap map){
        wishBottleService.delete(id);
        map.put("msg","删除成功");
        map.put("url","/wishbottle/wishbottle/list");
        return "zujian/success";
    }
}
