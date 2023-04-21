package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author naiyuanliu
 * @email 422795717@qq.com
 * @date 2023-04-18 21:16:32
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
