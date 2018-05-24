package com.itoystergold.pojo;

public class DeployCardbins extends DeployCardbinsKey {
    private String bankId;

    private String cardbin;

    private String cardLength;

    private String memo;

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId == null ? null : bankId.trim();
    }

    public String getCardbin() {
        return cardbin;
    }

    public void setCardbin(String cardbin) {
        this.cardbin = cardbin == null ? null : cardbin.trim();
    }

    public String getCardLength() {
        return cardLength;
    }

    public void setCardLength(String cardLength) {
        this.cardLength = cardLength == null ? null : cardLength.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}