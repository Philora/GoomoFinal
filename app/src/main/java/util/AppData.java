package util;

import com.goomo.travel.model.FlightSearchResponse;

public class AppData {

    private static FlightSearchResponse data;

    public static FlightSearchResponse getData() {
        return data;
    }

    public static void setData(FlightSearchResponse searchdata) {
        data = searchdata;
    }
}
