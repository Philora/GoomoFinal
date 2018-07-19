package com.goomo.travel.model;

public class FlightSearchData {

    String mDeparture;
    String mArrival;
    String mOrigin;
    String mDestination;
    int mDuration;
    int mPrice;
    String mAirlineCode;

    public String getmDeparture() {
        return mDeparture;
    }

    public FlightSearchData setmDeparture(String mDeparture) {
        this.mDeparture = mDeparture;
        return this;
    }

    public String getmArrival() {
        return mArrival;
    }

    public FlightSearchData setmArrival(String mArrival) {
        this.mArrival = mArrival;
        return this;
    }

    public String getmOrigin() {
        return mOrigin;
    }

    public FlightSearchData setmOrigin(String mOrigin) {
        this.mOrigin = mOrigin;
        return this;
    }

    public String getmDestination() {
        return mDestination;
    }

    public FlightSearchData setmDestination(String mDestination) {
        this.mDestination = mDestination;
        return this;
    }

    public int getmDuration() {
        return mDuration;
    }

    public FlightSearchData setmDuration(int mDuration) {
        this.mDuration = mDuration;
        return this;
    }

    public int getmPrice() {
        return mPrice;
    }

    public FlightSearchData setmPrice(int mPrice) {
        this.mPrice = mPrice;
        return this;
    }

    public String getmAirlineCode() {
        return mAirlineCode;
    }

    public FlightSearchData setmAirlineCode(String mAirlineCode) {
        this.mAirlineCode = mAirlineCode;
        return this;
    }
}
