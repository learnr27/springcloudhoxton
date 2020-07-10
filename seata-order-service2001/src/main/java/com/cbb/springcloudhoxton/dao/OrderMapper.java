package com.cbb.springcloudhoxton.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cbb.springcloudhoxton.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author chengbb
 * @date 2020.7.5
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

    /**
     * 2 修改订单状态，从零改为1
     *
     * @param userId
     * @param status
     */
    void updateStatus(@Param("userId") Long userId, @Param("status") Integer status);
}