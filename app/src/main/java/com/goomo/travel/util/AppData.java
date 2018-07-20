package com.goomo.travel.util;

import com.goomo.travel.model.FlightSearchResponse;

public class AppData {

    private static FlightSearchResponse data;

    private static String traveldate;
    private static String adultCount;

    public static FlightSearchResponse getData() {
        return data;
    }

    public static void setData(FlightSearchResponse searchdata) {
        data = searchdata;
    }

    public static String getTraveldate() {
        return traveldate;
    }

    public static void setTraveldate(String traveldate) {
        AppData.traveldate = traveldate;
    }

    public static String getAdultCount() {
        return adultCount;
    }

    public static void setAdultCount(String adultCount) {
        AppData.adultCount = adultCount;
    }
}
