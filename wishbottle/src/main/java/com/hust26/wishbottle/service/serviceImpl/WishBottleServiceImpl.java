package com.hust26.wishbottle.service.serviceImpl;

import com.hust26.wishbottle.entity.WishBottle;
import com.hust26.wishbottle.repository.WishBottleRepository;
import com.hust26.wishbottle.service.WishBottleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishBottleServiceImpl implements WishBottleService {

    @Autowired
    WishBottleRepository wishBottleRepository;

    //查找
    @Override
    public List findAll() {
         return wishBottleRepository.findAll();
    }

    //保存
    @Override
    public void save(String writeId,String content) {
        WishBottle wishBottle = new WishBottle();
        wishBottle.setWriterId(writeId);
        wishBottle.setContent(content);
        wishBottleRepository.save(wishBottle);
    }

    //删除
    @Override
    public void delete(Integer id) {
        wishBottleRepository.deleteById(id);
    }
}
