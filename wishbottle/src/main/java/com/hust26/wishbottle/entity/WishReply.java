package com.hust26.wishbottle.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class WishReply {
    /**
     * 回复id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 心愿瓶id
     */
    @Column
    @NotNull
    private Integer wishBottleId;

    /**
     * 回复者id
     */
    @Column
    @NotNull
    private Integer replyerId;

    /**
     * 被回复者id，默认值为1，表示该回复没有被回复。
     */
    @Column
    @NotNull
    private Integer answeredId = 1;

    /**
     * 回复的内容 默认为空字符 不能为null
     */
    @Column
    private String content;

}
