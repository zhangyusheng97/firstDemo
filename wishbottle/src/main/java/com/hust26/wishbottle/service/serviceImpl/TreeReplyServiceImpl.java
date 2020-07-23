package com.hust26.wishbottle.service.serviceImpl;

import com.hust26.wishbottle.entity.TreeReply;
import com.hust26.wishbottle.repository.TreeReplyRepository;
import com.hust26.wishbottle.service.TreeReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreeReplyServiceImpl implements TreeReplyService {
    @Autowired
    TreeReplyRepository treeReplyRepository;


    @Override
    public TreeReply findReplyByTreeHoleId(Integer treeholeid) {
        return treeReplyRepository.findById(treeholeid).get();
    }

    @Override
    public TreeReply addTreeReply(TreeReply treeReply) {
         return treeReplyRepository.save(treeReply);
    }

    @Override
    public void delete(Integer treerplyId) {
        treeReplyRepository.deleteTreeReplyByReplyerId(treerplyId);
    }
}
