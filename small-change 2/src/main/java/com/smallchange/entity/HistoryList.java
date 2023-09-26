package com.smallchange.entity;


public class HistoryList {

    private int id;
    private String account;
    private String type;
    private  double amount;
    private String side;
    private String description;

    public HistoryList(int id, String account, String type, double amount, String side, String description) {
        this.id = id;
        this.account = account;
        this.type = type;
        this.amount = amount;
        this.side = side;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
