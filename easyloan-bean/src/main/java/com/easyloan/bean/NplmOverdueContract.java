package com.easyloan.bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * <p>
 * 还款_逾期合同表
 * </p>
 *
 * @author lc
 * @since 2018-08-18
 */
public class NplmOverdueContract implements  Serializable{


    @Id
    @Column
    private String id;
    /**
     * 合同编号
     */
    @Column
    private String loanContractNum;
    /**
     * 逾期状态
            2：逾期，
            9：正常还清
     */
    @Column
    private String overdueStatus;
    /**
     * 现存逾期天数
     */
    @Column
    private Integer overdueDays;
    /**
     * 现存逾期期数
     */
    @Column
    private Integer instalmentCnt;
    /**
     * 累积逾期天数
     */
    @Column
    private Integer allDays;
    /**
     * 累积逾期期数
     */
    @Column
    private Integer allInstalmentCnt;
    /**
     * 累积逾期次数
     */
    @Column
    private Integer allNumber;
    /**
     * 尚欠本息
     */
    @Column
    private Integer principalInterest;
    /**
     * 滞纳金总额
     */
    @Column
    private Integer allForfeit;
    /**
     * 罚息总额
     */
    @Column
    private Integer allAmerce;
    /**
     * 累计应收款
     */
    @Column
    private Integer allShould;
    /**
     * 累计实收款
     */
    @Column
    private Integer allIndeed;
    /**
     * 当期应还总金额
     */
    @Column
    private Integer currentRepay;
    /**
     * 一次性结清金额
     */
    @Column
    private Integer allRepaymentAmount;
    /**
     * 首次逾期日期
     */
    @Column
    private String firstDate;
    /**
     * 现存逾期开始日期
     */
    @Column
    private String startDate;
    /**
     * 首次出现连续逾期的开始日期
     */
    @Column
    private String serialStartDate;
    /**
     * 过去18个月逾期历史
     */
    @Column
    private String overdueHistory;
    /**
     * 计算违约日期
     */
    @Column
    private String computeDate;
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

    public String getOverdueStatus() {
        return overdueStatus;
    }

    public void setOverdueStatus(String overdueStatus) {
        this.overdueStatus = overdueStatus;
    }

    public Integer getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
    }

    public Integer getInstalmentCnt() {
        return instalmentCnt;
    }

    public void setInstalmentCnt(Integer instalmentCnt) {
        this.instalmentCnt = instalmentCnt;
    }

    public Integer getAllDays() {
        return allDays;
    }

    public void setAllDays(Integer allDays) {
        this.allDays = allDays;
    }

    public Integer getAllInstalmentCnt() {
        return allInstalmentCnt;
    }

    public void setAllInstalmentCnt(Integer allInstalmentCnt) {
        this.allInstalmentCnt = allInstalmentCnt;
    }

    public Integer getAllNumber() {
        return allNumber;
    }

    public void setAllNumber(Integer allNumber) {
        this.allNumber = allNumber;
    }

    public Integer getPrincipalInterest() {
        return principalInterest;
    }

    public void setPrincipalInterest(Integer principalInterest) {
        this.principalInterest = principalInterest;
    }

    public Integer getAllForfeit() {
        return allForfeit;
    }

    public void setAllForfeit(Integer allForfeit) {
        this.allForfeit = allForfeit;
    }

    public Integer getAllAmerce() {
        return allAmerce;
    }

    public void setAllAmerce(Integer allAmerce) {
        this.allAmerce = allAmerce;
    }

    public Integer getAllShould() {
        return allShould;
    }

    public void setAllShould(Integer allShould) {
        this.allShould = allShould;
    }

    public Integer getAllIndeed() {
        return allIndeed;
    }

    public void setAllIndeed(Integer allIndeed) {
        this.allIndeed = allIndeed;
    }

    public Integer getCurrentRepay() {
        return currentRepay;
    }

    public void setCurrentRepay(Integer currentRepay) {
        this.currentRepay = currentRepay;
    }

    public Integer getAllRepaymentAmount() {
        return allRepaymentAmount;
    }

    public void setAllRepaymentAmount(Integer allRepaymentAmount) {
        this.allRepaymentAmount = allRepaymentAmount;
    }

    public String getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(String firstDate) {
        this.firstDate = firstDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getSerialStartDate() {
        return serialStartDate;
    }

    public void setSerialStartDate(String serialStartDate) {
        this.serialStartDate = serialStartDate;
    }

    public String getOverdueHistory() {
        return overdueHistory;
    }

    public void setOverdueHistory(String overdueHistory) {
        this.overdueHistory = overdueHistory;
    }

    public String getComputeDate() {
        return computeDate;
    }

    public void setComputeDate(String computeDate) {
        this.computeDate = computeDate;
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
        return "NplmOverdueContract{" +
        "id=" + id +
        ", loanContractNum=" + loanContractNum +
        ", overdueStatus=" + overdueStatus +
        ", overdueDays=" + overdueDays +
        ", instalmentCnt=" + instalmentCnt +
        ", allDays=" + allDays +
        ", allInstalmentCnt=" + allInstalmentCnt +
        ", allNumber=" + allNumber +
        ", principalInterest=" + principalInterest +
        ", allForfeit=" + allForfeit +
        ", allAmerce=" + allAmerce +
        ", allShould=" + allShould +
        ", allIndeed=" + allIndeed +
        ", currentRepay=" + currentRepay +
        ", allRepaymentAmount=" + allRepaymentAmount +
        ", firstDate=" + firstDate +
        ", startDate=" + startDate +
        ", serialStartDate=" + serialStartDate +
        ", overdueHistory=" + overdueHistory +
        ", computeDate=" + computeDate +
        ", creator=" + creator +
        ", createTime=" + createTime +
        ", updater=" + updater +
        ", updateTime=" + updateTime +
        ", updateType=" + updateType +
        "}";
    }
}
