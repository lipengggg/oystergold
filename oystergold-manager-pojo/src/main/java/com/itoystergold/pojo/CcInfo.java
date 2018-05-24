package com.itoystergold.pojo;

import java.util.Date;

public class CcInfo {
    private String cid;

    private String ctelephone;

    private String cname;

    private String cvid;

    private String cparam;

    private Date createtime;

    private Date updatetime;

    private String type;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public String getCtelephone() {
        return ctelephone;
    }

    public void setCtelephone(String ctelephone) {
        this.ctelephone = ctelephone == null ? null : ctelephone.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCvid() {
        return cvid;
    }

    public void setCvid(String cvid) {
        this.cvid = cvid == null ? null : cvid.trim();
    }

    public String getCparam() {
        return cparam;
    }

    public void setCparam(String cparam) {
        this.cparam = cparam == null ? null : cparam.trim();
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}