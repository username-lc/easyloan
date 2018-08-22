package com.easyloan.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * <p>
 * 还款_还款计划表
 * </p>
 *
 * @author lc
 * @since 2018-08-18
 */

public class NplmRepaymentPlan implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @Id
    @Column
    private Integer id;
    /**
     * 合同编号
     */
    @Column
    private Integer loanContractNum;
    /**
     * 所属分期
     */
    @Column
    private Integer instalment;
    /**
     * 上一还款日期
     */
    @Column
    private Date preRepaymentDate;
    /**
     * 还款日期
     */
    @Column
    private Date repaymentDate;
    /**
     * 应收本金
     */
    @Column
    private Integer capital;
    /**
     * 应收利息
     */
    @Column
    private Integer interest;
    /**
     * 应收分期费用
     */
    @Column
    private Integer installmentFee;
    /**
     * 应收罚息
     */
    @Column
    private Integer amerce;
    /**
     * 应收滞纳金
     */
    @Column
    private Integer forfeit;
    /**
     * 应收滞纳金
     */
    @Column
    private Integer penalty;
    /**
     * 应收变更手续费
     */
    @Column
    private Integer changeFee;
    /**
     * 应收其他费用
     */
    @Column
    private Integer otherFee;
    /**
     * 应收还款总额
     */
    @Column
    private Integer repaymentAmount;
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
     * 减免分期费用
     */
    @Column
    private Integer reduceInstFee;
    /**
     * 减免违约金
     */
    @Column
    private Integer reducePenalty;
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
     * 剩余本金
     */
    @Column
    private Integer remainCapital;
    /**
     * NPV剩余本金
     */
    @Column
    private Integer npvRemainCapital;
    /**
     * 一次性全部提前还款金额
     */
    @Column
    private Integer allRepaymentAmount;
    /**
     * 还款状态：
            0	未还款
            1	已还款
            2	部分还款
            3	逾期
            4	未满足收款条件（前期费用收取用）
            
     */
    @Column
    private String repaymentState;
    /**
     * 备注
     */
    @Column
    private String remark;
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
     * Y:是  N：否
     */
    @Column
    private String isOperating;
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

    public Integer getLoanContractNum() {
        return loanContractNum;
    }

    public void setLoanContractNum(Integer loanContractNum) {
        this.loanContractNum = loanContractNum;
    }

    public Integer getInstalment() {
        return instalment;
    }

    public void setInstalment(Integer instalment) {
        this.instalment = instalment;
    }

    public Date getPreRepaymentDate() {
        return preRepaymentDate;
    }

    public void setPreRepaymentDate(Date preRepaymentDate) {
        this.preRepaymentDate = preRepaymentDate;
    }

    public Date getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(Date repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    public Integer getCapital() {
        return capital;
    }

    public void setCapital(Integer capital) {
        this.capital = capital;
    }

    public Integer getInterest() {
        return interest;
    }

    public void setInterest(Integer interest) {
        this.interest = interest;
    }

    public Integer getInstallmentFee() {
        return installmentFee;
    }

    public void setInstallmentFee(Integer installmentFee) {
        this.installmentFee = installmentFee;
    }

    public Integer getAmerce() {
        return amerce;
    }

    public void setAmerce(Integer amerce) {
        this.amerce = amerce;
    }

    public Integer getForfeit() {
        return forfeit;
    }

    public void setForfeit(Integer forfeit) {
        this.forfeit = forfeit;
    }

    public Integer getPenalty() {
        return penalty;
    }

    public void setPenalty(Integer penalty) {
        this.penalty = penalty;
    }

    public Integer getChangeFee() {
        return changeFee;
    }

    public void setChangeFee(Integer changeFee) {
        this.changeFee = changeFee;
    }

    public Integer getOtherFee() {
        return otherFee;
    }

    public void setOtherFee(Integer otherFee) {
        this.otherFee = otherFee;
    }

    public Integer getRepaymentAmount() {
        return repaymentAmount;
    }

    public void setRepaymentAmount(Integer repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
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

    public Integer getReduceInstFee() {
        return reduceInstFee;
    }

    public void setReduceInstFee(Integer reduceInstFee) {
        this.reduceInstFee = reduceInstFee;
    }

    public Integer getReducePenalty() {
        return reducePenalty;
    }

    public void setReducePenalty(Integer reducePenalty) {
        this.reducePenalty = reducePenalty;
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

    public Integer getRemainCapital() {
        return remainCapital;
    }

    public void setRemainCapital(Integer remainCapital) {
        this.remainCapital = remainCapital;
    }

    public Integer getNpvRemainCapital() {
        return npvRemainCapital;
    }

    public void setNpvRemainCapital(Integer npvRemainCapital) {
        this.npvRemainCapital = npvRemainCapital;
    }

    public Integer getAllRepaymentAmount() {
        return allRepaymentAmount;
    }

    public void setAllRepaymentAmount(Integer allRepaymentAmount) {
        this.allRepaymentAmount = allRepaymentAmount;
    }

    public String getRepaymentState() {
        return repaymentState;
    }

    public void setRepaymentState(String repaymentState) {
        this.repaymentState = repaymentState;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getIsOperating() {
        return isOperating;
    }

    public void setIsOperating(String isOperating) {
        this.isOperating = isOperating;
    }

    public String getUpdateType() {
        return updateType;
    }

    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }



    @Override
    public String toString() {
        return "NplmRepaymentPlan{" +
        "id=" + id +
        ", loanContractNum=" + loanContractNum +
        ", instalment=" + instalment +
        ", preRepaymentDate=" + preRepaymentDate +
        ", repaymentDate=" + repaymentDate +
        ", capital=" + capital +
        ", interest=" + interest +
        ", installmentFee=" + installmentFee +
        ", amerce=" + amerce +
        ", forfeit=" + forfeit +
        ", penalty=" + penalty +
        ", changeFee=" + changeFee +
        ", otherFee=" + otherFee +
        ", repaymentAmount=" + repaymentAmount +
        ", indeedCapital=" + indeedCapital +
        ", indeedInterest=" + indeedInterest +
        ", indeedInstFee=" + indeedInstFee +
        ", indeedAmerce=" + indeedAmerce +
        ", indeedForfeit=" + indeedForfeit +
        ", indeedPenalty=" + indeedPenalty +
        ", indeedChangeFee=" + indeedChangeFee +
        ", indeedOtherFee=" + indeedOtherFee +
        ", indeedAmount=" + indeedAmount +
        ", reduceCapital=" + reduceCapital +
        ", reduceInterest=" + reduceInterest +
        ", reduceAmerce=" + reduceAmerce +
        ", reduceForfeit=" + reduceForfeit +
        ", reduceInstFee=" + reduceInstFee +
        ", reducePenalty=" + reducePenalty +
        ", reducePreFee=" + reducePreFee +
        ", reduceOtherFee=" + reduceOtherFee +
        ", remainCapital=" + remainCapital +
        ", npvRemainCapital=" + npvRemainCapital +
        ", allRepaymentAmount=" + allRepaymentAmount +
        ", repaymentState=" + repaymentState +
        ", remark=" + remark +
        ", creator=" + creator +
        ", createTime=" + createTime +
        ", updater=" + updater +
        ", updateTime=" + updateTime +
        ", isOperating=" + isOperating +
        ", updateType=" + updateType +
        "}";
    }
}
