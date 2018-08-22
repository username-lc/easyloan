package com.easyloan.manage.mapper;


import com.easyloan.bean.NplmLoanContract;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 合同_贷款合同表 Mapper 接口
 * </p>
 *
 * @author lc
 * @since 2018-08-18
 */
public interface NplmLoanContractMapper extends Mapper<NplmLoanContract> {

    List<NplmLoanContract> getNplmLoanContractList(Map<String,Object> paramMap);

    int count();

    NplmLoanContract getPaymentOptions(@Param("id")String id);
}
