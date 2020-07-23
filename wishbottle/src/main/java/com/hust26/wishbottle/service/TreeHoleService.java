package com.hust26.wishbottle.service;

import java.util.List;

public interface TreeHoleService {


    //查找树洞内容
    public List findAll();

    //保存树洞内容
    public void save(String writeId,String content,Integer goods);

    //删除树洞内容
    public void delete(Integer id);

    //置顶操作
    public void getTop(Integer id);
}
