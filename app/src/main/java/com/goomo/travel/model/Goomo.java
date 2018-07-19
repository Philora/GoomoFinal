
package com.goomo.travel.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Goomo {

    @SerializedName("travel_plan_id")
    @Expose
    private String travelPlanId;
    @SerializedName("origin")
    @Expose
    private String origin;
    @SerializedName("destination")
    @Expose
    private String destination;
    @SerializedName("travel_duration_in_minutes")
    @Expose
    private Integer travelDurationInMinutes;
    @SerializedName("flights")
    @Expose
    private List<Flight> flights;
    @SerializedName("pricing")
    @Expose
    private Pricing pricing;

    public String getTravelPlanId() {
        return travelPlanId;
    }

    public void setTravelPlanId(String travelPlanId) {
        this.travelPlanId = travelPlanId;
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

    public Integer getTravelDurationInMinutes() {
        return travelDurationInMinutes;
    }

    public void setTravelDurationInMinutes(Integer travelDurationInMinutes) {
        this.travelDurationInMinutes = travelDurationInMinutes;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public Pricing getPricing() {
        return pricing;
    }

    public void setPricing(Pricing pricing) {
        this.pricing = pricing;
    }

}
