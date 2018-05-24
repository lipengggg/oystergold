package com.itoystergold.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class AssetPersonSalary {
    private String sid;

    private String vid;

    private String oid;

    private BigDecimal salary;

    private String salaryCategery;

    private Date pldate;

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

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getSalaryCategery() {
        return salaryCategery;
    }

    public void setSalaryCategery(String salaryCategery) {
        this.salaryCategery = salaryCategery == null ? null : salaryCategery.trim();
    }

    public Date getPldate() {
        return pldate;
    }

    public void setPldate(Date pldate) {
        this.pldate = pldate;
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