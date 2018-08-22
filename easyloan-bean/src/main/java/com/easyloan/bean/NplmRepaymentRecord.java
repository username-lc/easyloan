package com.easyloan.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;
import java.io.Serializable;

/**
 * <p>
 * 还款_还款记录表
 * </p>
 *
 * @author lc
 * @since 2018-08-18
 */

public class NplmRepaymentRecord implements Serializable {


    /**
     * id
     */
    @Id
    @Column
    private Integer id;
    /**
     * 业务请求ID
     */
    @Column
    private Integer businessRequestId;
    /**
     * 合同编号
     */
    @Column
    private Integer loanContractNum;
    /**
     * 还款请求日期
     */
    @Column
    private Date repaymentDate;
    /**
     * 逾期天数
     */
    @Column
    private Integer overdueDays;
    /**
     * 逾期总金额
     */
    @Column
    private Integer overdueAmount;
    /**
     * 扣款金额
     */
    @Column
    private Integer repaymentAmount;
    /**
     * 成功金额
     */
    @Column
    private Integer successAmount;
    /**
     * 还款状态
            0	处理中
            1	成功
            2	失败
            3	部分成功
            4	已撤销
            5              不执行
            
     */
    @Column
    private String status;
    /**
     * 备注
     */
    @Column
    private String remark;
    /**
     * 划扣特殊标识
     */
    @Column
    private String specialCode;
    /**
     * 扣款顺序
     */
    @Column
    private Integer sort;
    /**
     * 数据创建类型：
            0	前期费用(先放后收模式)
            1	正常
            2	逾期
            3	预约-逾期
            4	预约-正常
            5	预约-一次性提前还款
            6	预约-部分提前还款
            7	预约-前期费用
            8	展期
            9	转产品
            10	部分提前还款
            11	循环贷结清
            12	退款-保证金
            13	退款-还款
            14	退款-前期费用
            15	减免
            16	减免结清
            17	线下-正常
            18	保证金抵偿
            19	前期费用(先收后放模式)
            20	线下-提前还款
            21	晚确认提前还款结清
            22	前期费用（差额放款模式）
            23	线下-前期费用
            24	线下-展期费用
            25	逾期-晚回盘补算逾期
            26	逾期-前期费用
     */
    @Column
    private String dataCreateType;
    /**
     * 预约时间
     */
    @Column
    private Date reserveTime;
    /**
     * 创建者
     */
    @Column
    private String creator;
    /**
     * 创建时间
     */
    @Column
    private Date createTime;
    /**
     * 末次修改者
     */
    @Column
    private String updater;
    /**
     * 末次修改时间
     */
    @Column
    private Date updateTime;
    /**
     * 账户姓名
     */
    @Column
    private String accountName;
    /**
     * 账户证件类型
     */
    @Column
    private String acctIdenType;
    /**
     * 账户证件号
     */
    @Column
    private String acctIdenNum;
    /**
     * 账户
     */
    @Column
    private String accountNo;
    /**
     * 账户卡折标识
     */
    @Column
    private String accountType;
    /**
     * 账户银行行别代码
     */
    @Column
    private String accountBankid;
    /**
     * 账户开户行行号(支付行号)
     */
    @Column
    private String accountBranchNo;
    /**
     * 账户开户行名称
     */
    @Column
    private String accountBankName;
    /**
     * 账户对公对私标识
     */
    @Column
    private String publicPrivate;
    /**
     * 账户开户省
     */
    @Column
    private String actProvince;
    /**
     * 账户开户市
     */
    @Column
    private String accountCity;
    /**
     * 修改类型
     */
    @Column
    private String updateType;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBusinessRequestId() {
        return businessRequestId;
    }

    public void setBusinessRequestId(Integer businessRequestId) {
        this.businessRequestId = businessRequestId;
    }

    public Integer getLoanContractNum() {
        return loanContractNum;
    }

    public void setLoanContractNum(Integer loanContractNum) {
        this.loanContractNum = loanContractNum;
    }

    public Date getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(Date repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    public Integer getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
    }

    public Integer getOverdueAmount() {
        return overdueAmount;
    }

    public void setOverdueAmount(Integer overdueAmount) {
        this.overdueAmount = overdueAmount;
    }

    public Integer getRepaymentAmount() {
        return repaymentAmount;
    }

    public void setRepaymentAmount(Integer repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }

    public Integer getSuccessAmount() {
        return successAmount;
    }

    public void setSuccessAmount(Integer successAmount) {
        this.successAmount = successAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSpecialCode() {
        return specialCode;
    }

    public void setSpecialCode(String specialCode) {
        this.specialCode = specialCode;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getDataCreateType() {
        return dataCreateType;
    }

    public void setDataCreateType(String dataCreateType) {
        this.dataCreateType = dataCreateType;
    }

    public Date getReserveTime() {
        return reserveTime;
    }

    public void setReserveTime(Date reserveTime) {
        this.reserveTime = reserveTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAcctIdenType() {
        return acctIdenType;
    }

    public void setAcctIdenType(String acctIdenType) {
        this.acctIdenType = acctIdenType;
    }

    public String getAcctIdenNum() {
        return acctIdenNum;
    }

    public void setAcctIdenNum(String acctIdenNum) {
        this.acctIdenNum = acctIdenNum;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountBankid() {
        return accountBankid;
    }

    public void setAccountBankid(String accountBankid) {
        this.accountBankid = accountBankid;
    }

    public String getAccountBranchNo() {
        return accountBranchNo;
    }

    public void setAccountBranchNo(String accountBranchNo) {
        this.accountBranchNo = accountBranchNo;
    }

    public String getAccountBankName() {
        return accountBankName;
    }

    public void setAccountBankName(String accountBankName) {
        this.accountBankName = accountBankName;
    }

    public String getPublicPrivate() {
        return publicPrivate;
    }

    public void setPublicPrivate(String publicPrivate) {
        this.publicPrivate = publicPrivate;
    }

    public String getActProvince() {
        return actProvince;
    }

    public void setActProvince(String actProvince) {
        this.actProvince = actProvince;
    }

    public String getAccountCity() {
        return accountCity;
    }

    public void setAccountCity(String accountCity) {
        this.accountCity = accountCity;
    }

    public String getUpdateType() {
        return updateType;
    }

    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }


    @Override
    public String toString() {
        return "NplmRepaymentRecord{" +
        "id=" + id +
        ", businessRequestId=" + businessRequestId +
        ", loanContractNum=" + loanContractNum +
        ", repaymentDate=" + repaymentDate +
        ", overdueDays=" + overdueDays +
        ", overdueAmount=" + overdueAmount +
        ", repaymentAmount=" + repaymentAmount +
        ", successAmount=" + successAmount +
        ", status=" + status +
        ", remark=" + remark +
        ", specialCode=" + specialCode +
        ", sort=" + sort +
        ", dataCreateType=" + dataCreateType +
        ", reserveTime=" + reserveTime +
        ", creator=" + creator +
        ", createTime=" + createTime +
        ", updater=" + updater +
        ", updateTime=" + updateTime +
        ", accountName=" + accountName +
        ", acctIdenType=" + acctIdenType +
        ", acctIdenNum=" + acctIdenNum +
        ", accountNo=" + accountNo +
        ", accountType=" + accountType +
        ", accountBankid=" + accountBankid +
        ", accountBranchNo=" + accountBranchNo +
        ", accountBankName=" + accountBankName +
        ", publicPrivate=" + publicPrivate +
        ", actProvince=" + actProvince +
        ", accountCity=" + accountCity +
        ", updateType=" + updateType +
        "}";
    }
}
