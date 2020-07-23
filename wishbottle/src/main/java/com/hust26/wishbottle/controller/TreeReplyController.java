package com.hust26.wishbottle.controller;

import com.hust26.wishbottle.entity.TreeReply;
import com.hust26.wishbottle.model.DataModel;
import com.hust26.wishbottle.service.TreeReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/treereply")
public class TreeReplyController {
    @Autowired
    TreeReplyService treeReplyService;

    /**
     * 获取某个树洞所有回复列表
     * url为“/wishbottle/treereply/getreplybytreeholeid”  下同，
     * @param treeholeid
     * @return
     */
    @GetMapping("/getreplybytreeholeid")
    private DataModel findReplyByTreeHoleId(Integer treeholeid) {
        DataModel model = new DataModel();
        try {
            model.setData(treeReplyService.findReplyByTreeHoleId(treeholeid));
        } catch (Exception e) {
            model.setCode(1);
            model.setErrorMsg("调用接口失败");
        }
        return model;
    }

    /**
     * 新增树洞回复
     *
     * @param treeReply
     * @return
     */
    @RequestMapping("/addtreeholereply")
    public DataModel addTreeReply(TreeReply treeReply) {
        DataModel model = new DataModel();
        try {
            model.setData(treeReplyService.addTreeReply(treeReply));
        } catch (Exception e) {
            model.setCode(1);
            model.setErrorMsg("调用接口失败");
        }
        return model;
    }

    /**
     * 实际上是删除树洞回复
     *
     * @param treeReplyId
     * @return
     */
    @RequestMapping("/updateTreeReply")
    public DataModel updateTreeReply(Integer treeReplyId) {
        DataModel model = new DataModel();
        try {
            treeReplyService.delete(treeReplyId);
        } catch (Exception e) {
            model.setCode(1);
            model.setErrorMsg("调用接口失败");
        }
        return model;
    }

}
