package com.goomo.travel.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Flight {

    @SerializedName("flight_id")
    private String flightId;
    @SerializedName("flight_code")

    private String flightCode;
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

    private Integer travelDurationInMinutes;
    @SerializedName("aircraft_type")

    private String aircraftType;
    @SerializedName("origin_terminal")

    private String originTerminal;
    @SerializedName("destination_terminal")

    private Object destinationTerminal;
    @SerializedName("pricing")

    private List<Pricing> pricing = null;

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

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

    public Integer getTravelDurationInMinutes() {
        return travelDurationInMinutes;
    }

    public void setTravelDurationInMinutes(Integer travelDurationInMinutes) {
        this.travelDurationInMinutes = travelDurationInMinutes;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getOriginTerminal() {
        return originTerminal;
    }

    public void setOriginTerminal(String originTerminal) {
        this.originTerminal = originTerminal;
    }

    public Object getDestinationTerminal() {
        return destinationTerminal;
    }

    public void setDestinationTerminal(Object destinationTerminal) {
        this.destinationTerminal = destinationTerminal;
    }

    public List<Pricing> getPricing() {
        return pricing;
    }

    public void setPricing(List<Pricing> pricing) {
        this.pricing = pricing;
    }

}
