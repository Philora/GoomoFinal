package com.goomo.travel.model;

import com.google.gson.annotations.SerializedName;

public class Price {

    @SerializedName("amount")
    private Integer amount;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

}
