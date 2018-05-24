package com.itoystergold.pojo;

import java.util.Date;

public class Vipuser {
    private String vid;

    private String parentid;

    private String vname;

    private String vusername;

    private String vtelephone;

    private String vlevel;

    private String vpassword;

    private String vcode;

    private String vstatus;

    private Date createtime;

    private Date updatetime;

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid == null ? null : vid.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname == null ? null : vname.trim();
    }

    public String getVusername() {
        return vusername;
    }

    public void setVusername(String vusername) {
        this.vusername = vusername == null ? null : vusername.trim();
    }

    public String getVtelephone() {
        return vtelephone;
    }

    public void setVtelephone(String vtelephone) {
        this.vtelephone = vtelephone == null ? null : vtelephone.trim();
    }

    public String getVlevel() {
        return vlevel;
    }

    public void setVlevel(String vlevel) {
        this.vlevel = vlevel == null ? null : vlevel.trim();
    }

    public String getVpassword() {
        return vpassword;
    }

    public void setVpassword(String vpassword) {
        this.vpassword = vpassword == null ? null : vpassword.trim();
    }

    public String getVcode() {
        return vcode;
    }

    public void setVcode(String vcode) {
        this.vcode = vcode == null ? null : vcode.trim();
    }

    public String getVstatus() {
        return vstatus;
    }

    public void setVstatus(String vstatus) {
        this.vstatus = vstatus == null ? null : vstatus.trim();
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