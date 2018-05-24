package com.itoystergold.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class AssetStock {
    private String sid;

    private String vid;

    private BigDecimal stockAmt;

    private BigDecimal stockScale;

    private Date createtime;

    private Date updatetime;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid == null ? null : vid.trim();
    }

    public BigDecimal getStockAmt() {
        return stockAmt;
    }

    public void setStockAmt(BigDecimal stockAmt) {
        this.stockAmt = stockAmt;
    }

    public BigDecimal getStockScale() {
        return stockScale;
    }

    public void setStockScale(BigDecimal stockScale) {
        this.stockScale = stockScale;
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