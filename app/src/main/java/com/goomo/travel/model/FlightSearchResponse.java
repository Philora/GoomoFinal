package com.goomo.travel.model;

import java.util.List;

public class FlightSearchResponse {
    FlightSearchMetadata meta;
    private List<SearchResult> results;

    public FlightSearchMetadata getMeta() {
        return meta;
    }

    public FlightSearchResponse setMeta(FlightSearchMetadata meta) {
        this.meta = meta;
        return this;
    }

    public List<SearchResult> getResults() {
        return results;
    }

    public FlightSearchResponse setResults(List<SearchResult> results) {
        this.results = results;
        return this;
    }
}
