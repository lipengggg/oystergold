package com.itoystergold.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class DeployLevelSalaryRule {
    private String rid;

    private String levelid;

    private BigDecimal introduceRate;

    private BigDecimal manageRate;

    private BigDecimal serviceAmt;

    private BigDecimal subsidyAmt;

    private BigDecimal shareRate;

    private Date createtime;

    private Date updatetime;

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid == null ? null : rid.trim();
    }

    public String getLevelid() {
        return levelid;
    }

    public void setLevelid(String levelid) {
        this.levelid = levelid == null ? null : levelid.trim();
    }

    public BigDecimal getIntroduceRate() {
        return introduceRate;
    }

    public void setIntroduceRate(BigDecimal introduceRate) {
        this.introduceRate = introduceRate;
    }

    public BigDecimal getManageRate() {
        return manageRate;
    }

    public void setManageRate(BigDecimal manageRate) {
        this.manageRate = manageRate;
    }

    public BigDecimal getServiceAmt() {
        return serviceAmt;
    }

    public void setServiceAmt(BigDecimal serviceAmt) {
        this.serviceAmt = serviceAmt;
    }

    public BigDecimal getSubsidyAmt() {
        return subsidyAmt;
    }

    public void setSubsidyAmt(BigDecimal subsidyAmt) {
        this.subsidyAmt = subsidyAmt;
    }

    public BigDecimal getShareRate() {
        return shareRate;
    }

    public void setShareRate(BigDecimal shareRate) {
        this.shareRate = shareRate;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}