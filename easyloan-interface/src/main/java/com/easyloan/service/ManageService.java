package com.easyloan.service;

import com.easyloan.bean.NplmBorrowerInfo;
import com.easyloan.bean.NplmLoanContract;

import java.util.List;
import java.util.Map;


public interface ManageService {
    //查询合同列表
    List<NplmLoanContract> getNplmLoanContract(Map<String,Object> paramMap);

    int getTotal();



     //查询还款方案信息
     NplmLoanContract getPaymentOptions(String id);


}
