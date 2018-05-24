package com.itoystergold.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class AssetTransSerail {
    private String tid;

    private String serailid;

    private String fpid;

    private String fname;

    private String spid;

    private String sname;

    private BigDecimal amt;

    private String requestParam;

    private String remark;

    private String status;

    private Date createtime;

    private Date updatetime;

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    public String getSerailid() {
        return serailid;
    }

    public void setSerailid(String serailid) {
        this.serailid = serailid == null ? null : serailid.trim();
    }

    public String getFpid() {
        return fpid;
    }

    public void setFpid(String fpid) {
        this.fpid = fpid == null ? null : fpid.trim();
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public String getSpid() {
        return spid;
    }

    public void setSpid(String spid) {
        this.spid = spid == null ? null : spid.trim();
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public String getRequestParam() {
        return requestParam;
    }

    public void setRequestParam(String requestParam) {
        this.requestParam = requestParam == null ? null : requestParam.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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