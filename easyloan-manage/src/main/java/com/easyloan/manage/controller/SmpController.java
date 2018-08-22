package com.easyloan.manage.controller;

import com.alibaba.fastjson.JSON;
import com.easyloan.bean.NplmLoanContract;
import com.easyloan.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SmpController {
    @Autowired
    ManageService manageService;
    @RequestMapping("/index")
    public String index(){
        return "smp";
    }
    @RequestMapping("/contractList")
    public String contractList(){

        return "contractList";
    }
    @RequestMapping(value = "queryLoanContractList",method = RequestMethod.POST , produces = "application/json; charset=utf-8")
    @ResponseBody
    public String queryLoanContractList(@RequestParam Map<String,Object> paramMap){
        //System.out.println("paramMap==="+paramMap);

        int page = Integer.parseInt((String) paramMap.get("page"));
        int pageSize = Integer.parseInt((String) paramMap.get("rows"));
        int pageno=(page-1)*pageSize;
        paramMap.put("pageNo",pageno);
        paramMap.put("pageSize",pageSize);


        Map<String, Object> map = new HashMap<>();
        int total = manageService.getTotal();
        map.put("total",total);
        List<NplmLoanContract> nplmLoanContractList = manageService.getNplmLoanContract(paramMap);
        map.put("rows",nplmLoanContractList);
        String nplmLoanContractListJson = JSON.toJSONString(map);
        return  nplmLoanContractListJson;
    }
    @RequestMapping("selectRepayment")
    public String selectRepayment(@RequestParam String id,HttpServletRequest request){
        System.out.println("id========================"+id);
        NplmLoanContract nplmLoanContract = manageService.getPaymentOptions(id);
        request.setAttribute("nplmLoanContract",nplmLoanContract);
        return "common/selectRepayment";
    }
    @RequestMapping("updataRepayment")
    public String updataRepayment(){
        return "common/updataRepayment";
    }
}
