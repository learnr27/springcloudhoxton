package com.cbb.springcloudhoxton.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author chengbb
 * @date 2020.7.5
 */
@Mapper
public interface StorageMapper {

    /**
     * 扣减库存
     *
     * @param productId
     * @param count
     */
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
