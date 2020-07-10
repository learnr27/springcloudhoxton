package com.cbb.springcloudhoxton.service;


/**
 * @author chengbb
 * @date 2020.7.5
 */
public interface StorageService {

    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
