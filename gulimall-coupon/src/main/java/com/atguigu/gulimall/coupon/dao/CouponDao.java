package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author naiyuanliu
 * @email 422795717@qq.com
 * @date 2023-04-18 20:58:25
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
