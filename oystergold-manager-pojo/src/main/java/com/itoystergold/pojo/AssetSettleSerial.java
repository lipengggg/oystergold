package com.itoystergold.pojo;

import java.util.Date;

public class AssetSettleSerial {
    private String sid;

    private String serialid;

    private String requestParam;

    private String handlerStatus;

    private String errcode;

    private String errmsg;

    private Date createtime;

    private Date updatetime;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getSerialid() {
        return serialid;
    }

    public void setSerialid(String serialid) {
        this.serialid = serialid == null ? null : serialid.trim();
    }

    public String getRequestParam() {
        return requestParam;
    }

    public void setRequestParam(String requestParam) {
        this.requestParam = requestParam == null ? null : requestParam.trim();
    }

    public String getHandlerStatus() {
        return handlerStatus;
    }

    public void setHandlerStatus(String handlerStatus) {
        this.handlerStatus = handlerStatus == null ? null : handlerStatus.trim();
    }

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode == null ? null : errcode.trim();
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg == null ? null : errmsg.trim();
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