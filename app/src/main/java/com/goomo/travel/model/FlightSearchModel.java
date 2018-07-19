package com.goomo.travel.model;


public class FlightSearchModel {


    String mSource;
    String mDestination;
    String mTraveldate;
    int mAdultCount;
    int mChildCount;
    int mInfantCount;
    String mTravelClass;
    boolean isIndianResient;

    public FlightSearchModel setmSource(String mSource) {
        this.mSource = mSource;
        return this;
    }

    public FlightSearchModel setmDestination(String mDestination) {
        this.mDestination = mDestination;
        return this;
    }

    public FlightSearchModel setmTraveldate(String mTraveldate) {
        this.mTraveldate = mTraveldate;
        return this;
    }

    public FlightSearchModel setmAdultCount(int mAdultCount) {
        this.mAdultCount = mAdultCount;
        return this;
    }

    public FlightSearchModel setmChildCount(int mChildCount) {
        this.mChildCount = mChildCount;
        return this;
    }

    public FlightSearchModel setmTravelClass(String mTravelClass) {
        this.mTravelClass = mTravelClass;
        return this;
    }

    public FlightSearchModel setIndianResient(boolean indianResient) {
        isIndianResient = indianResient;
        return this;
    }

    public String getmSource() {
        return mSource;
    }

    public String getmDestination() {
        return mDestination;
    }

    public String getmTraveldate() {
        return mTraveldate;
    }

    public int getmAdultCount() {
        return mAdultCount;
    }

    public int getmChildCount() {
        return mChildCount;
    }

    public String getmTravelClass() {
        return mTravelClass;
    }

    public boolean isIndianResient() {
        return isIndianResient;
    }

    public int getmInfantCount() {
        return mInfantCount;
    }

    public FlightSearchModel setmInfantCount(int mInfantCount) {
        this.mInfantCount = mInfantCount;
        return this;
    }
}
