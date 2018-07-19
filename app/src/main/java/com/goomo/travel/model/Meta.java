package com.goomo.travel.model;

public class Meta {
    String search_track_id;
    String flight_type;

    public String getSearch_track_id() {
        return search_track_id;
    }

    public Meta setSearch_track_id(String search_track_id) {
        this.search_track_id = search_track_id;
        return this;
    }

    public String getFlight_type() {
        return flight_type;
    }

    public Meta setFlight_type(String flight_type) {
        this.flight_type = flight_type;
        return this;
    }
}
