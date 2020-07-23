package com.hust26.wishbottle.service.serviceImpl;

import com.hust26.wishbottle.entity.Manager;
import com.hust26.wishbottle.repository.ManagerRepository;
import com.hust26.wishbottle.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    ManagerRepository managerRepository;

    //添加管理员
    @Override
    public Manager addManager(Manager manager) {
        return managerRepository.save(manager);
    }

    //删除管理员
    @Override
    public void deleteManager(Integer Id) {
        managerRepository.deleteById(Id);
    }

    @Override
    public Manager findById(Integer Id) {
        return managerRepository.findById(Id).get();
    }

    @Override
    public List findAllManager() {

        return managerRepository.findAll();
    }

    @Override
    public Manager findManager(String account) {
        return managerRepository.findByAccount(account);
    }

    @Override
    public void saveManager(String account, String psd) {
        Manager manager = new Manager();
        manager.setAccount(account);
        manager.setPsd(psd);
        managerRepository.save(manager);
    }

    @Override
    public void save(Manager manager) {
        managerRepository.save(manager);
    }


}
