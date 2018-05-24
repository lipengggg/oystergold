package com.itoystergold.pojo;

public class DeployClsbank extends DeployClsbankKey {
    private String bankType;

    private String bankName;

    private String bankStatus;

    private String bankSeq;

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType == null ? null : bankType.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankStatus() {
        return bankStatus;
    }

    public void setBankStatus(String bankStatus) {
        this.bankStatus = bankStatus == null ? null : bankStatus.trim();
    }

    public String getBankSeq() {
        return bankSeq;
    }

    public void setBankSeq(String bankSeq) {
        this.bankSeq = bankSeq == null ? null : bankSeq.trim();
    }
}