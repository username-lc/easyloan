package com.easyloan.manage.serviceImpl;

import com.easyloan.bean.NplmLoanContract;
import com.easyloan.manage.mapper.NplmLoanContractMapper;
import com.easyloan.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ManageServiceImpl implements ManageService{

    @Autowired
    NplmLoanContractMapper nplmLoanContractMapper;
    @Override
    public List<NplmLoanContract> getNplmLoanContract(Map<String,Object> paramMap) {
        List<NplmLoanContract> nplmLoanContract = nplmLoanContractMapper.getNplmLoanContractList(paramMap);
        return nplmLoanContract;
    }

    @Override
    public int getTotal() {
        int count = nplmLoanContractMapper.count();
        return count;
    }

    @Override
    public NplmLoanContract getPaymentOptions(String id) {
        NplmLoanContract nplmLoanContract = nplmLoanContractMapper.getPaymentOptions(id);
        return nplmLoanContract;
    }


}
