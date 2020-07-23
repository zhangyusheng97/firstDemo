package com.hust26.wishbottle.controller;

import com.hust26.wishbottle.entity.TreeHole;
import com.hust26.wishbottle.service.TreeHoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/treehole")
public class TreeHoleController {
    @Autowired
    TreeHoleService treeHoleService;

    @RequestMapping("/list")
    public String treeHoleList(Model model){
        List<TreeHole> treeList = treeHoleService.findAll();
        model.addAttribute("treeList",treeList);
        return "treehole/list";
    }

    //接收数据从小程序中传入,小程序中链接的url /wishbottle/treeHole/gettree
    @RequestMapping("/sendtree")
    @ResponseBody
    public List gettree(){
        List<TreeHole> treeList = treeHoleService.findAll();
        return treeList;
    }

    //接收数据
    @RequestMapping("/gettree")
    public void gettree(@RequestParam("content") String content){

        treeHoleService.save("zys",content,1);
    }

    //删除操作
    @RequestMapping("/delete")
    public String deleteTree(@RequestParam("id") Integer id,
                             ModelMap map){
        treeHoleService.delete(id);
        map.put("msg","删除成功");
        map.put("url","/wishbottle/treehole/list");
        return "zujian/success";
    }

    //置顶操作
    @RequestMapping("/top")
    public  String topTreeHole(@RequestParam("id") Integer id,
                               ModelMap map){
        treeHoleService.getTop(id);
        map.put("msg","置顶成功");
        map.put("url","/wishbottle/treehole/list");
        return "zujian/success";
    }


}
