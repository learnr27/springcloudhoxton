package com.cbb.springcloudhoxton.service;

import com.cbb.springcloudhoxton.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author chengbb
 * @date 2020.6.29
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
