package com.itoystergold.pojo;

public class DeploySubbank extends DeploySubbankKey {
    private String clsbankNo;

    private String subName;

    private String subShortname;

    private String cityCode;

    private String status;

    public String getClsbankNo() {
        return clsbankNo;
    }

    public void setClsbankNo(String clsbankNo) {
        this.clsbankNo = clsbankNo == null ? null : clsbankNo.trim();
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName == null ? null : subName.trim();
    }

    public String getSubShortname() {
        return subShortname;
    }

    public void setSubShortname(String subShortname) {
        this.subShortname = subShortname == null ? null : subShortname.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}