package com.hust26.wishbottle.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class TreeReply {
    /**
     * 回复id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 树洞id
     */
    @Column
    @NotNull
    private Integer treeHoleId;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTreeHoleId() {
        return treeHoleId;
    }

    public void setTreeHoleId(Integer treeHoleId) {
        this.treeHoleId = treeHoleId;
    }

    public Integer getReplyerId() {
        return replyerId;
    }

    public void setReplyerId(Integer replyerId) {
        this.replyerId = replyerId;
    }

    public Integer getAnsweredId() {
        return answeredId;
    }

    public void setAnsweredId(Integer answeredId) {
        this.answeredId = answeredId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
