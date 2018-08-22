package com.easyloan.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * <p>
 * 还款_还款记录详情表
 * </p>
 *
 * @author lc
 * @since 2018-08-18
 */
public class NplmRepaymentDetail implements Serializable {


    /**
     * id
     */
    @Id
    @Column
    private Integer id;
    /**
     * 还款计划id
     */
    @Column
    private Integer repaymentPlanId;
    /**
     * 还款记录id
     */
    @Column
    private Integer repaymentRecordId;
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
     * 所属分期
     */
    @Column
    private Integer instalment;
    /**
     * 应收本金
     */
    @Column
    private Integer shouldCapital;
    /**
     * 应收利息
     */
    @Column
    private Integer shouldInterest;
    /**
     * 应收分期费用
     */
    @Column
    private Integer shouldInstFee;
    /**
     * 应收罚息
     */
    @Column
    private Integer shouldAmerce;
    /**
     * 应收滞纳金
     */
    @Column
    private Integer shouldForfeit;
    /**
     * 应收违约金
     */
    @Column
    private Integer shouldPenalty;
    /**
     * 应收变更手续费
     */
    @Column
    private Integer shouldChangeFee;
    /**
     * 应收其他费用
     */
    @Column
    private Integer shouldOtherFee;
    /**
     * 应收总额
     */
    @Column
    private Integer shouldAmount;
    /**
     * 实收本金
     */
    @Column
    private Integer indeedCapital;
    /**
     * 实收利息
     */
    @Column
    private Integer indeedInterest;
    /**
     * 实收分期费用
     */
    @Column
    private Integer indeedInstFee;
    /**
     * 实收罚息
     */
    @Column
    private Integer indeedAmerce;
    /**
     * 实收滞纳金
     */
    @Column
    private Integer indeedForfeit;
    /**
     * 实收违约金
     */
    @Column
    private Integer indeedPenalty;
    /**
     * 实收变更手续费
     */
    @Column
    private Integer indeedChangeFee;
    /**
     * 实收其他费用
     */
    @Column
    private Integer indeedOtherFee;
    /**
     * 实收总额
     */
    @Column
    private Integer indeedAmount;
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
     * 减免本金
     */
    @Column
    private Integer reduceCapital;
    /**
     * 减免利息
     */
    @Column
    private Integer reduceInterest;
    /**
     * 减免罚息
     */
    @Column
    private Integer reduceAmerce;
    /**
     * 减免滞纳金
     */
    @Column
    private Integer reduceForfeit;
    /**
     * 减免违约金
     */
    @Column
    private Integer reducePenalty;
    /**
     * 减免分期费用
     */

    @Column
    private Integer reduceInstFee;
    /**
     * 减免前期费用
     */
    @Column
    private Integer reducePreFee;
    /**
     * 减免其他费用
     */
    @Column
    private Integer reduceOtherFee;
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

    public Integer getRepaymentPlanId() {
        return repaymentPlanId;
    }

    public void setRepaymentPlanId(Integer repaymentPlanId) {
        this.repaymentPlanId = repaymentPlanId;
    }

    public Integer getRepaymentRecordId() {
        return repaymentRecordId;
    }

    public void setRepaymentRecordId(Integer repaymentRecordId) {
        this.repaymentRecordId = repaymentRecordId;
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

    public Integer getInstalment() {
        return instalment;
    }

    public void setInstalment(Integer instalment) {
        this.instalment = instalment;
    }

    public Integer getShouldCapital() {
        return shouldCapital;
    }

    public void setShouldCapital(Integer shouldCapital) {
        this.shouldCapital = shouldCapital;
    }

    public Integer getShouldInterest() {
        return shouldInterest;
    }

    public void setShouldInterest(Integer shouldInterest) {
        this.shouldInterest = shouldInterest;
    }

    public Integer getShouldInstFee() {
        return shouldInstFee;
    }

    public void setShouldInstFee(Integer shouldInstFee) {
        this.shouldInstFee = shouldInstFee;
    }

    public Integer getShouldAmerce() {
        return shouldAmerce;
    }

    public void setShouldAmerce(Integer shouldAmerce) {
        this.shouldAmerce = shouldAmerce;
    }

    public Integer getShouldForfeit() {
        return shouldForfeit;
    }

    public void setShouldForfeit(Integer shouldForfeit) {
        this.shouldForfeit = shouldForfeit;
    }

    public Integer getShouldPenalty() {
        return shouldPenalty;
    }

    public void setShouldPenalty(Integer shouldPenalty) {
        this.shouldPenalty = shouldPenalty;
    }

    public Integer getShouldChangeFee() {
        return shouldChangeFee;
    }

    public void setShouldChangeFee(Integer shouldChangeFee) {
        this.shouldChangeFee = shouldChangeFee;
    }

    public Integer getShouldOtherFee() {
        return shouldOtherFee;
    }

    public void setShouldOtherFee(Integer shouldOtherFee) {
        this.shouldOtherFee = shouldOtherFee;
    }

    public Integer getShouldAmount() {
        return shouldAmount;
    }

    public void setShouldAmount(Integer shouldAmount) {
        this.shouldAmount = shouldAmount;
    }

    public Integer getIndeedCapital() {
        return indeedCapital;
    }

    public void setIndeedCapital(Integer indeedCapital) {
        this.indeedCapital = indeedCapital;
    }

    public Integer getIndeedInterest() {
        return indeedInterest;
    }

    public void setIndeedInterest(Integer indeedInterest) {
        this.indeedInterest = indeedInterest;
    }

    public Integer getIndeedInstFee() {
        return indeedInstFee;
    }

    public void setIndeedInstFee(Integer indeedInstFee) {
        this.indeedInstFee = indeedInstFee;
    }

    public Integer getIndeedAmerce() {
        return indeedAmerce;
    }

    public void setIndeedAmerce(Integer indeedAmerce) {
        this.indeedAmerce = indeedAmerce;
    }

    public Integer getIndeedForfeit() {
        return indeedForfeit;
    }

    public void setIndeedForfeit(Integer indeedForfeit) {
        this.indeedForfeit = indeedForfeit;
    }

    public Integer getIndeedPenalty() {
        return indeedPenalty;
    }

    public void setIndeedPenalty(Integer indeedPenalty) {
        this.indeedPenalty = indeedPenalty;
    }

    public Integer getIndeedChangeFee() {
        return indeedChangeFee;
    }

    public void setIndeedChangeFee(Integer indeedChangeFee) {
        this.indeedChangeFee = indeedChangeFee;
    }

    public Integer getIndeedOtherFee() {
        return indeedOtherFee;
    }

    public void setIndeedOtherFee(Integer indeedOtherFee) {
        this.indeedOtherFee = indeedOtherFee;
    }

    public Integer getIndeedAmount() {
        return indeedAmount;
    }

    public void setIndeedAmount(Integer indeedAmount) {
        this.indeedAmount = indeedAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getReduceCapital() {
        return reduceCapital;
    }

    public void setReduceCapital(Integer reduceCapital) {
        this.reduceCapital = reduceCapital;
    }

    public Integer getReduceInterest() {
        return reduceInterest;
    }

    public void setReduceInterest(Integer reduceInterest) {
        this.reduceInterest = reduceInterest;
    }

    public Integer getReduceAmerce() {
        return reduceAmerce;
    }

    public void setReduceAmerce(Integer reduceAmerce) {
        this.reduceAmerce = reduceAmerce;
    }

    public Integer getReduceForfeit() {
        return reduceForfeit;
    }

    public void setReduceForfeit(Integer reduceForfeit) {
        this.reduceForfeit = reduceForfeit;
    }

    public Integer getReducePenalty() {
        return reducePenalty;
    }

    public void setReducePenalty(Integer reducePenalty) {
        this.reducePenalty = reducePenalty;
    }

    public Integer getReduceInstFee() {
        return reduceInstFee;
    }

    public void setReduceInstFee(Integer reduceInstFee) {
        this.reduceInstFee = reduceInstFee;
    }

    public Integer getReducePreFee() {
        return reducePreFee;
    }

    public void setReducePreFee(Integer reducePreFee) {
        this.reducePreFee = reducePreFee;
    }

    public Integer getReduceOtherFee() {
        return reduceOtherFee;
    }

    public void setReduceOtherFee(Integer reduceOtherFee) {
        this.reduceOtherFee = reduceOtherFee;
    }

    public String getDataCreateType() {
        return dataCreateType;
    }

    public void setDataCreateType(String dataCreateType) {
        this.dataCreateType = dataCreateType;
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

    public String getUpdateType() {
        return updateType;
    }

    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }


    @Override
    public String toString() {
        return "NplmRepaymentDetail{" +
        "id=" + id +
        ", repaymentPlanId=" + repaymentPlanId +
        ", repaymentRecordId=" + repaymentRecordId +
        ", businessRequestId=" + businessRequestId +
        ", loanContractNum=" + loanContractNum +
        ", repaymentDate=" + repaymentDate +
        ", instalment=" + instalment +
        ", shouldCapital=" + shouldCapital +
        ", shouldInterest=" + shouldInterest +
        ", shouldInstFee=" + shouldInstFee +
        ", shouldAmerce=" + shouldAmerce +
        ", shouldForfeit=" + shouldForfeit +
        ", shouldPenalty=" + shouldPenalty +
        ", shouldChangeFee=" + shouldChangeFee +
        ", shouldOtherFee=" + shouldOtherFee +
        ", shouldAmount=" + shouldAmount +
        ", indeedCapital=" + indeedCapital +
        ", indeedInterest=" + indeedInterest +
        ", indeedInstFee=" + indeedInstFee +
        ", indeedAmerce=" + indeedAmerce +
        ", indeedForfeit=" + indeedForfeit +
        ", indeedPenalty=" + indeedPenalty +
        ", indeedChangeFee=" + indeedChangeFee +
        ", indeedOtherFee=" + indeedOtherFee +
        ", indeedAmount=" + indeedAmount +
        ", status=" + status +
        ", reduceCapital=" + reduceCapital +
        ", reduceInterest=" + reduceInterest +
        ", reduceAmerce=" + reduceAmerce +
        ", reduceForfeit=" + reduceForfeit +
        ", reducePenalty=" + reducePenalty +
        ", reduceInstFee=" + reduceInstFee +
        ", reducePreFee=" + reducePreFee +
        ", reduceOtherFee=" + reduceOtherFee +
        ", dataCreateType=" + dataCreateType +
        ", remark=" + remark +
        ", specialCode=" + specialCode +
        ", sort=" + sort +
        ", creator=" + creator +
        ", createTime=" + createTime +
        ", updater=" + updater +
        ", updateTime=" + updateTime +
        ", updateType=" + updateType +
        "}";
    }
}
