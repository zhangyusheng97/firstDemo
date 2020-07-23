package com.hust26.wishbottle.repository;

import com.hust26.wishbottle.entity.TreeReply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreeReplyRepository extends JpaRepository<TreeReply,Integer> {
    public void deleteTreeReplyByReplyerId(Integer replyId);
}
