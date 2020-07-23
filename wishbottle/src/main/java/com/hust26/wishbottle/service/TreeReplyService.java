package com.hust26.wishbottle.service;

import com.hust26.wishbottle.entity.TreeReply;

import java.util.List;

public interface TreeReplyService {
    public TreeReply findReplyByTreeHoleId(Integer treeholeid);


    public TreeReply addTreeReply(TreeReply treeReply);   //添加树洞回复

    //删除树洞回复
    public void delete(Integer treerplyId);
}
