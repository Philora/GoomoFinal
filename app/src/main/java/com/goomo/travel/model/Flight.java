package com.goomo.travel.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Flight {


    @SerializedName("airline_code")
    private String airlineCode;

    @SerializedName("origin")
    private String origin;

    @SerializedName("destination")
    private String destination;

    @SerializedName("departure_datetime")
    private String departureDatetime;

    @SerializedName("arrival_datetime")
    private String arrivalDatetime;

    @SerializedName("travel_duration_in_minutes")
    private String travelDurationInMinutes;

    @SerializedName("pricing")
    private List<Pricing> pricing = null;

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureDatetime() {
        return departureDatetime;
    }

    public void setDepartureDatetime(String departureDatetime) {
        this.departureDatetime = departureDatetime;
    }

    public String getArrivalDatetime() {
        return arrivalDatetime;
    }

    public void setArrivalDatetime(String arrivalDatetime) {
        this.arrivalDatetime = arrivalDatetime;
    }

    public String getTravelDurationInMinutes() {
        return travelDurationInMinutes;
    }

    public void setTravelDurationInMinutes(String travelDurationInMinutes) {
        this.travelDurationInMinutes = travelDurationInMinutes;
    }

    public List<Pricing> getPricing() {
        return pricing;
    }

    public void setPricing(List<Pricing> pricing) {
        this.pricing = pricing;
    }

}
