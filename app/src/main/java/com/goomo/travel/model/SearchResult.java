package com.goomo.travel.model;

import java.util.List;

public class SearchResult {

    private String origin;
    private String destination;
    private String arrival;
    private String departure;
    private String airline_code;
    private int price;
    private String travel_duration_in_minutes;

    private List<Flight> flights;

    private List<Pricing> pricings;

    public String getOrigin() {
        return origin;
    }

    public SearchResult setOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    public String getDestination() {
        return destination;
    }

    public SearchResult setDestination(String destination) {
        this.destination = destination;
        return this;
    }

    public String getTravel_duration_in_minutes() {
        return travel_duration_in_minutes;
    }

    public SearchResult setTravel_duration_in_minutes(String travel_duration_in_minutes) {
        this.travel_duration_in_minutes = travel_duration_in_minutes;
        return this;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public SearchResult setFlights(List<Flight> flights) {
        this.flights = flights;
        return this;
    }

    public List<Pricing> getPricings() {
        return pricings;
    }

    public SearchResult setPricings(List<Pricing> pricings) {
        this.pricings = pricings;
        return this;
    }

    public String getArrival() {
        return arrival;
    }

    public SearchResult setArrival(String arrival) {
        this.arrival = arrival;
        return this;
    }

    public String getDeparture() {
        return departure;
    }

    public SearchResult setDeparture(String departure) {
        this.departure = departure;
        return this;
    }

    public String getAirline_code() {
        return airline_code;
    }

    public SearchResult setAirline_code(String airline_code) {
        this.airline_code = airline_code;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public SearchResult setPrice(int price) {
        this.price = price;
        return this;
    }
}
