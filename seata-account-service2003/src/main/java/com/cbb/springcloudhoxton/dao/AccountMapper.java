package com.cbb.springcloudhoxton.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cbb.springcloudhoxton.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author chengbb
 * @date 2020.7.5
 */
@Mapper
public interface AccountMapper extends BaseMapper<Account> {

    /**
     * 扣减账户余额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
