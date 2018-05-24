package com.itoystergold.pojo;

public class DeployCardbinsKey {
    private String binId;

    private String tenantId;

    public String getBinId() {
        return binId;
    }

    public void setBinId(String binId) {
        this.binId = binId == null ? null : binId.trim();
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }
}