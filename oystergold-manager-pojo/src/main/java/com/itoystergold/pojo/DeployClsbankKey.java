package com.itoystergold.pojo;

public class DeployClsbankKey {
    private String clsbankNo;

    private String tenantId;

    public String getClsbankNo() {
        return clsbankNo;
    }

    public void setClsbankNo(String clsbankNo) {
        this.clsbankNo = clsbankNo == null ? null : clsbankNo.trim();
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }
}