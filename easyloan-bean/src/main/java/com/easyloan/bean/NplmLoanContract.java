package com.easyloan.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * <p>
 * 合同_贷款合同表
 * </p>
 *
 * @author lc
 * @since 2018-08-18
 */
public class NplmLoanContract implements Serializable {


    /**
     * id
     */
    @Id
    @Column
    private String id;
    /**
     * 合同编号
     */
    @Column
    private String loanContractNum;
    /**
     * 借款人id
     */
    @Column
    private String borrowerId;
    /**
     * ECIF客户号
     */
    @Column
    private String ecifId;
    /**
     * 产品分类代码
     */
    @Column
    private String proCategoryCode;
    /**
     * 产品分类名称
     */
    @Column
    private String proCategoryName;
    /**
     * 产品信息id
     */
    @Column
    private Integer productInfoId;
    /**
     * 贷款分期数
     */
    @Column
    private Integer loanInstalments;
    /**
     * 贷款分期单位
     */
    @Column
    private String loanInstalmentUnit;
    /**
     * 贷款金额
     */
    @Column
    private Integer loanAmount;
    /**
     * 前期费用
     */
    @Column
    private Integer preFee;
    /**
     * 放款金额
     */
    @Column
    private Integer putAmount;
    /**
     * 贷款形式 1为信用，2为担保，3为抵押，4为其他
     */
    @Column
    private String creditType;
    /**
     * 支付方式 THIRD:第三方渠道  BANK:银行渠道
     */
    @Column
    private String payMod;
    /**
     * 还款方式
     * 01-等额本息
     * 02-等额本金
     * 03-等本等息
     * 04-付息通
     * 05-一次性还本付息
     * 06-等比累进
     * 07-等额累进
     * 08-0+N
     * 09-分阶段还款
     */
    @Column
    private String repayWay;
    /**
     * 放款模式：1:差额放款 3:先放款后收费 3:先收费后放款 4:先放款后收费（线下收取前期费用）
     */
    @Column
    private String loanType;
    /**
     * 销售部门id
     */
    @Column
    private Integer saleDepartmentId;
    /**
     * 还款账户姓名
     */
    @Column
    private String repayAccountName;
    /**
     * 还款账户证件类型
     */
    @Column
    private String repayAcctIdenType;
    /**
     * 还款账户证件号
     */
    @Column
    private String repayAcctIdenNum;
    /**
     * 还款账户
     */
    @Column
    private String repayAccount;
    /**
     * 还款账户卡折标识
     */
    @Column
    private String repayAccountType;
    /**
     * 还款账户银行行别代码
     */
    @Column
    private String repayAccountBankid;
    /**
     * 还款账户开户行行号(支付行号)
     */
    @Column
    private String repayActBranchNo;
    /**
     * 还款账户开户行名称
     */
    @Column
    private String repayAccountBankName;
    /**
     * 还款账户对公对私标识
     */
    @Column
    private String publicPrivate;
    /**
     * 还款账户开户省
     */
    @Column
    private String repayActProvince;
    /**
     * 还款账户开户市
     */
    @Column
    private String repayAccountCity;
    /**
     * POS验证状态 未验证 0014 已验证为空
     */
    @Column
    private String posStatus;
    /**
     * 放款日
     */
    @Column
    private Date repayDate;
    /**
     * 首期还款日
     */
    @Column
    private Date startDate;
    /**
     * 末期还款日
     */
    @Column
    private Date endDate;
    /**
     * 合同来源：
     * NPLM_ICMP	综合信贷
     * NPLM_RZZL	融资租赁
     * NPLM_CDXT	车贷系统
     * NPLM_FDXT	房贷系统
     */
    @Column
    private String contractSource;
    /**
     * 未分配还款额
     */
    @Column
    private Integer repayBalance;
    /**
     * 合同状态:
     * -1：合同废止
     * 0：未放款，1：还款中，2：逾期，
     * 9：正常还清，10：合同终止，11：合同核销，12：减免结清，13：特殊减免结清，14：提前结清，15：放款退回结清
     */
    @Column
    private String contractType;
    /**
     * 创建者
     */
    @Column
    private String creator;
    /**
     * 末次修改者
     */
    @Column
    private String updater;
    /**
     * 创建时间
     */
    @Column
    private Date createTime;
    /**
     * 末次修改时间
     */
    @Column
    private Date updateTime;
    /**
     * 备注
     */
    @Column
    private String remark;
    /**
     * 循环授信编号
     */
    @Column
    private String cycleCreditId;
    /**
     * 修改类型
     */
    @Column
    private String updateType;

    @Transient
    private NplmBorrowerInfo nplmBorrowerInfo;
    @Transient
    private NplmContractAttribute nplmContractAttribute;

    @Transient
    private NplmOverdueContract nplmOverdueContract;

    public NplmOverdueContract getNplmOverdueContract() {
        return nplmOverdueContract;
    }

    public void setNplmOverdueContract(NplmOverdueContract nplmOverdueContract) {
        this.nplmOverdueContract = nplmOverdueContract;
    }

    public NplmBorrowerInfo getNplmBorrowerInfo() {
        return nplmBorrowerInfo;
    }

    public void setNplmBorrowerInfo(NplmBorrowerInfo nplmBorrowerInfo) {
        this.nplmBorrowerInfo = nplmBorrowerInfo;
    }

    public NplmContractAttribute getNplmContractAttribute() {
        return nplmContractAttribute;
    }

    public void setNplmContractAttribute(NplmContractAttribute nplmContractAttribute) {
        this.nplmContractAttribute = nplmContractAttribute;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoanContractNum() {
        return loanContractNum;
    }

    public void setLoanContractNum(String loanContractNum) {
        this.loanContractNum = loanContractNum;
    }

    public String getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId;
    }

    public String getEcifId() {
        return ecifId;
    }

    public void setEcifId(String ecifId) {
        this.ecifId = ecifId;
    }

    public String getProCategoryCode() {
        return proCategoryCode;
    }

    public void setProCategoryCode(String proCategoryCode) {
        this.proCategoryCode = proCategoryCode;
    }

    public String getProCategoryName() {
        return proCategoryName;
    }

    public void setProCategoryName(String proCategoryName) {
        this.proCategoryName = proCategoryName;
    }

    public Integer getProductInfoId() {
        return productInfoId;
    }

    public void setProductInfoId(Integer productInfoId) {
        this.productInfoId = productInfoId;
    }

    public Integer getLoanInstalments() {
        return loanInstalments;
    }

    public void setLoanInstalments(Integer loanInstalments) {
        this.loanInstalments = loanInstalments;
    }

    public String getLoanInstalmentUnit() {
        return loanInstalmentUnit;
    }

    public void setLoanInstalmentUnit(String loanInstalmentUnit) {
        this.loanInstalmentUnit = loanInstalmentUnit;
    }

    public Integer getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Integer loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Integer getPreFee() {
        return preFee;
    }

    public void setPreFee(Integer preFee) {
        this.preFee = preFee;
    }

    public Integer getPutAmount() {
        return putAmount;
    }

    public void setPutAmount(Integer putAmount) {
        this.putAmount = putAmount;
    }

    public String getCreditType() {
        return creditType;
    }

    public void setCreditType(String creditType) {
        this.creditType = creditType;
    }

    public String getPayMod() {
        return payMod;
    }

    public void setPayMod(String payMod) {
        this.payMod = payMod;
    }

    public String getRepayWay() {
        return repayWay;
    }

    public void setRepayWay(String repayWay) {
        this.repayWay = repayWay;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public Integer getSaleDepartmentId() {
        return saleDepartmentId;
    }

    public void setSaleDepartmentId(Integer saleDepartmentId) {
        this.saleDepartmentId = saleDepartmentId;
    }

    public String getRepayAccountName() {
        return repayAccountName;
    }

    public void setRepayAccountName(String repayAccountName) {
        this.repayAccountName = repayAccountName;
    }

    public String getRepayAcctIdenType() {
        return repayAcctIdenType;
    }

    public void setRepayAcctIdenType(String repayAcctIdenType) {
        this.repayAcctIdenType = repayAcctIdenType;
    }

    public String getRepayAcctIdenNum() {
        return repayAcctIdenNum;
    }

    public void setRepayAcctIdenNum(String repayAcctIdenNum) {
        this.repayAcctIdenNum = repayAcctIdenNum;
    }

    public String getRepayAccount() {
        return repayAccount;
    }

    public void setRepayAccount(String repayAccount) {
        this.repayAccount = repayAccount;
    }

    public String getRepayAccountType() {
        return repayAccountType;
    }

    public void setRepayAccountType(String repayAccountType) {
        this.repayAccountType = repayAccountType;
    }

    public String getRepayAccountBankid() {
        return repayAccountBankid;
    }

    public void setRepayAccountBankid(String repayAccountBankid) {
        this.repayAccountBankid = repayAccountBankid;
    }

    public String getRepayActBranchNo() {
        return repayActBranchNo;
    }

    public void setRepayActBranchNo(String repayActBranchNo) {
        this.repayActBranchNo = repayActBranchNo;
    }

    public String getRepayAccountBankName() {
        return repayAccountBankName;
    }

    public void setRepayAccountBankName(String repayAccountBankName) {
        this.repayAccountBankName = repayAccountBankName;
    }

    public String getPublicPrivate() {
        return publicPrivate;
    }

    public void setPublicPrivate(String publicPrivate) {
        this.publicPrivate = publicPrivate;
    }

    public String getRepayActProvince() {
        return repayActProvince;
    }

    public void setRepayActProvince(String repayActProvince) {
        this.repayActProvince = repayActProvince;
    }

    public String getRepayAccountCity() {
        return repayAccountCity;
    }

    public void setRepayAccountCity(String repayAccountCity) {
        this.repayAccountCity = repayAccountCity;
    }

    public String getPosStatus() {
        return posStatus;
    }

    public void setPosStatus(String posStatus) {
        this.posStatus = posStatus;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getContractSource() {
        return contractSource;
    }

    public void setContractSource(String contractSource) {
        this.contractSource = contractSource;
    }

    public Integer getRepayBalance() {
        return repayBalance;
    }

    public void setRepayBalance(Integer repayBalance) {
        this.repayBalance = repayBalance;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCycleCreditId() {
        return cycleCreditId;
    }

    public void setCycleCreditId(String cycleCreditId) {
        this.cycleCreditId = cycleCreditId;
    }

    public String getUpdateType() {
        return updateType;
    }

    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }

    public Date getRepayDate() {
        return repayDate;
    }

    public void setRepayDate(Date repayDate) {
        this.repayDate = repayDate;
    }

    @Override
    public String toString() {
        return "NplmLoanContract{" +
                "id='" + id + '\'' +
                ", loanContractNum='" + loanContractNum + '\'' +
                ", borrowerId='" + borrowerId + '\'' +
                ", ecifId='" + ecifId + '\'' +
                ", proCategoryCode='" + proCategoryCode + '\'' +
                ", proCategoryName='" + proCategoryName + '\'' +
                ", productInfoId=" + productInfoId +
                ", loanInstalments=" + loanInstalments +
                ", loanInstalmentUnit='" + loanInstalmentUnit + '\'' +
                ", loanAmount=" + loanAmount +
                ", preFee=" + preFee +
                ", putAmount=" + putAmount +
                ", creditType='" + creditType + '\'' +
                ", payMod='" + payMod + '\'' +
                ", repayWay='" + repayWay + '\'' +
                ", loanType='" + loanType + '\'' +
                ", saleDepartmentId=" + saleDepartmentId +
                ", repayAccountName='" + repayAccountName + '\'' +
                ", repayAcctIdenType='" + repayAcctIdenType + '\'' +
                ", repayAcctIdenNum='" + repayAcctIdenNum + '\'' +
                ", repayAccount='" + repayAccount + '\'' +
                ", repayAccountType='" + repayAccountType + '\'' +
                ", repayAccountBankid='" + repayAccountBankid + '\'' +
                ", repayActBranchNo='" + repayActBranchNo + '\'' +
                ", repayAccountBankName='" + repayAccountBankName + '\'' +
                ", publicPrivate='" + publicPrivate + '\'' +
                ", repayActProvince='" + repayActProvince + '\'' +
                ", repayAccountCity='" + repayAccountCity + '\'' +
                ", posStatus='" + posStatus + '\'' +
                ", repayDate=" + repayDate +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", contractSource='" + contractSource + '\'' +
                ", repayBalance=" + repayBalance +
                ", contractType='" + contractType + '\'' +
                ", creator='" + creator + '\'' +
                ", updater='" + updater + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", remark='" + remark + '\'' +
                ", cycleCreditId='" + cycleCreditId + '\'' +
                ", updateType='" + updateType + '\'' +
                ", nplmBorrowerInfo=" + nplmBorrowerInfo +
                ", nplmContractAttribute=" + nplmContractAttribute +
                '}';
    }
}
