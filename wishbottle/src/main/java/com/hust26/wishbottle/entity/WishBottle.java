package com.hust26.wishbottle.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class WishBottle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    //心愿瓶作者
    @Column
    @NotNull
    private String writerId;
    //捡瓶子人的ID

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWriterId() {
        return writerId;
    }

    public void setWriterId(String writerId) {
        this.writerId = writerId;
    }



    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //瓶子的状态 0-未被捞 1-已被捞取 2-发布者删除 3-被删除
    @Column
    @NotNull
    private Integer status = 0;

    //心愿瓶内容
    @Column
    private String content = "";
}
