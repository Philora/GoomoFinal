package com.goomo.travel.model;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FlightSearchMetadata {

    @SerializedName("origin")
    private String origin;
    @SerializedName("destination")
    private String destination;



    public String getOrigin() {
        return origin;
    }

    public FlightSearchMetadata setOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    public String getDestination() {
        return destination;
    }

    public FlightSearchMetadata setDestination(String destination) {
        this.destination = destination;
        return this;
    }

}
