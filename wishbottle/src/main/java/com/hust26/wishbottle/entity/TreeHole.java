package com.hust26.wishbottle.entity;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class TreeHole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    //作者ID
    @Column
    @NotNull
    private String writerId;



    //树洞内容
    private String content;

    //点赞数目
    private Integer goods;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getGoods() {
        return goods;
    }

    public void setGoods(Integer goods) {
        this.goods = goods;
    }
}
