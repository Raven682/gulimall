package com.atguigu.gulimall.product.service.impl;

import com.atguigu.common.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.product.dao.CategoryDao;
import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.atguigu.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    // 传统写调用categoryDao的方式，由于Dao继承了Basemapper，因此
    // Basemapper中存储了CategoryDao因此可以直接调用
    //    @Autowired
    //    CategoryDao categoryDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //1、查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);
        //2、组装成父子的树形结构
        //2.1 找到所有的一级分类
        //初级写法，只有一条语句可以省略括号和return
//        entities.stream().filter((categoryEntity)->{
//            return categoryEntity.getParentCid() == 0;
//        }).collect(Collectors.toList());
        List<CategoryEntity> level1menus = entities.stream().filter(categoryEntity ->
                categoryEntity.getParentCid() == 0
        ).collect(Collectors.toList());
        return level1menus;
    }

}