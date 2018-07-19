
package com.goomo.travel.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pricing {

    @SerializedName("child")
    @Expose
    private Object child;
    @SerializedName("infant")
    @Expose
    private Object infant;
    @SerializedName("adult")
    @Expose
    private Adult adult;

    public Object getChild() {
        return child;
    }

    public void setChild(Object child) {
        this.child = child;
    }

    public Object getInfant() {
        return infant;
    }

    public void setInfant(Object infant) {
        this.infant = infant;
    }

    public Adult getAdult() {
        return adult;
    }

    public void setAdult(Adult adult) {
        this.adult = adult;
    }

    private class Adult {

        @SerializedName("price")
        @Expose
        private Price price;

        public Price getPrice() {
            return price;
        }

        public void setPrice(Price price) {
            this.price = price;
        }

    }

    private class Price {

        @SerializedName("amount")
        @Expose
        private Integer amount;

        public Integer getAmount() {
            return amount;
        }

        public void setAmount(Integer amount) {
            this.amount = amount;
        }

    }
}
