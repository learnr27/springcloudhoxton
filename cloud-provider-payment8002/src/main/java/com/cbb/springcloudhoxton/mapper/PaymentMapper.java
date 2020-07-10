package com.cbb.springcloudhoxton.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cbb.springcloudhoxton.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author chengbb
 * @date 2020.6.29
 */
@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {

    /**
     * 根据id获取数据
     *
     * @param id
     * @return
     */
    Payment getPaymentById(Long id);


}
