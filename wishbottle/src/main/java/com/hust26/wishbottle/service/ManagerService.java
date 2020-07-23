package com.hust26.wishbottle.service;

import com.hust26.wishbottle.entity.Manager;

import java.util.List;
import java.util.Optional;

public interface ManagerService {
    public Manager addManager(Manager manager);

    public void deleteManager(Integer Id);

    public Manager findById(Integer Id);

    //查找所有管理员
    public List<Manager> findAllManager();

    //根据账号查找管理员账号
    public Manager findManager(String account);

    //保存
    public void saveManager(String account,String psd);
    public void save(Manager manager);
}
