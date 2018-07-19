package com.goomo.travel.model;

import com.google.gson.annotations.SerializedName;

public class Adult {

    @SerializedName("price")
    private Price price;

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

}
