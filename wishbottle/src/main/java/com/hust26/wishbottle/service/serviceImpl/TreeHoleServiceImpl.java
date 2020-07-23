package com.hust26.wishbottle.service.serviceImpl;

import com.hust26.wishbottle.entity.TreeHole;
import com.hust26.wishbottle.repository.TreeHoleRepository;
import com.hust26.wishbottle.service.TreeHoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.reflect.generics.tree.Tree;

import java.util.List;

@Service
public class TreeHoleServiceImpl implements TreeHoleService {

    @Autowired
    TreeHoleRepository treeHoleRepository;

    @Override
    public List findAll() {
        return treeHoleRepository.findAll();
    }

    @Override
    public void save(String writeId, String content, Integer goods) {
        TreeHole  treeHole = new TreeHole();
        treeHole.setWriterId(writeId);
        treeHole.setContent(content);
        treeHole.setGoods(goods);
        treeHoleRepository.save(treeHole);
    }

    @Override
    public void delete(Integer id) {
        treeHoleRepository.deleteById(id);
    }

    @Override
    public void getTop(Integer id) {
        TreeHole treeHole = new TreeHole();
        treeHole = treeHoleRepository.findById(0).get();
        TreeHole tree1 = new TreeHole();
        tree1 = treeHoleRepository.findById(id).get();
        TreeHole tree2 = new TreeHole();
        //将置顶数据转至tree2中
        tree2.setGoods(treeHole.getGoods());
        tree2.setWriterId(treeHole.getWriterId());
        tree2.setContent(treeHole.getContent());
        //将tree1置顶（设置为主键id为0）
        treeHole.setWriterId(tree1.getWriterId());
        treeHole.setContent(tree1.getContent());
        treeHole.setGoods(tree1.getGoods());
        tree2.setId(id);
        treeHoleRepository.delete(tree1);
        treeHoleRepository.save(treeHole);
        treeHoleRepository.save(tree2);


    }
}
