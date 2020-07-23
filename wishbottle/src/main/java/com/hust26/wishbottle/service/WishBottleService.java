package com.hust26.wishbottle.service;


import java.util.List;


public interface WishBottleService {
    //查找心愿瓶内容
    public List findAll();

    //保存心愿瓶内容
    public void save(String writeId,String content);

    //删除心愿瓶内容
    public void delete(Integer id);
}
