package com.cbb.springcloudhoxton.service;

import com.cbb.springcloudhoxton.entities.CommonResult;
import com.cbb.springcloudhoxton.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author chengbb
 * @date 2020.7.5
 */
@Component
public class PaymentFallbackService implements PaymentService {

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444, "服务降级返回,---PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}

