package com.cbb.springcloudhoxton.service.impl;

import com.cbb.springcloudhoxton.entities.Payment;
import com.cbb.springcloudhoxton.mapper.PaymentMapper;
import com.cbb.springcloudhoxton.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author chengbb
 * @date 2020.6.29
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.insert(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return this.paymentMapper.getPaymentById(id);
    }
}
