package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author naiyuanliu
 * @email 422795717@qq.com
 * @date 2023-04-17 20:53:58
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
