package com.hust26.wishbottle.service.serviceImpl;

import com.hust26.wishbottle.entity.TreeReply;
import com.hust26.wishbottle.entity.WishReply;
import com.hust26.wishbottle.repository.WishReplyRepository;
import com.hust26.wishbottle.service.WishReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WishReplyServiceImpl implements WishReplyService {
    @Autowired
    WishReplyRepository wishReplyRepository;


    @Override
    public void delete(Integer Id) {
        wishReplyRepository.deleteById(Id);
    }
}
