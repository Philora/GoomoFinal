package com.goomo.travel.view;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;

import com.goomo.travel.model.FlightSearchData;
import com.goomo.travel.R;
import com.goomo.travel.adapter.RecyclerAdapter;
import com.goomo.travel.model.FlightSearchResponse;
import com.goomo.travel.model.SearchResult;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import util.AppData;

public class FlightResultsActivity extends AppCompatActivity {
    private static final String TAG = "FlightResultsActivity";
    private RecyclerAdapter adapter;
    private RecyclerView recyclerView;
    private List<FlightSearchData> pojosList;
    private ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flight_results);
        setUpActionBar();
        recyclerView = (RecyclerView) findViewById(R.id.recFlight);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        pojosList = buildFlightSearchData(AppData.getData());
        adapter = new RecyclerAdapter(pojosList);
        recyclerView.setAdapter(adapter);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        TextView title = toolbar.findViewById(R.id.textView);
//        ImageView image = toolbar.findViewById(R.id.imageView);
    }

    private void setUpActionBar() {
        actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    private List<FlightSearchData> buildFlightSearchData(FlightSearchResponse responseData) {
        List<FlightSearchData> dataList = new ArrayList<>();

        if (dataList != null) {
            for (SearchResult result : responseData.getResults()) {
                actionBar.setTitle(result.getOrigin() + " ➨ " + result.getDestination());
                actionBar.setSubtitle(AppData.getTraveldate() + " ♟ " + AppData.getAdultCount());
                if (result != null) {
                    FlightSearchData data = new FlightSearchData();
                    if (result.getFlights()!=null&&!result.getFlights().isEmpty()) {
                        if(result.getFlights().size()>1){
                            data.setmNoOfStops(result.getFlights().size()-1+" Stop");
                        }else{
                            data.setmNoOfStops("Non Stop");
                        }
                        data.setmOrigin(result.getFlights().get(0).getOrigin());
                        if (result.getFlights().get(0).getDestination() != null) {
                            data.setmDestination(result.getFlights().get(0).getDestination());
                            data.setmArrival(parseDateString(result.getFlights().get(0).getArrivalDatetime()));
                            data.setmDeparture(parseDateString(result.getFlights().get(0).getDepartureDatetime()));
                            if (result.getFlights().get(0).getAirlineCode() != null) {
                                data.setmAirlineCode(result.getFlights().get(0).getAirlineCode());
                                data.setmDuration(parseTime(result.getFlights().get(0).getTravelDurationInMinutes()));
                            }
                        }
                    }
                    if(result.getPricing()!=null){
                        data.setmPrice("Rs." + result.getPricing().getAdult().getPrice().getAmount());
                    }
                    dataList.add(data);
                }
            }

        }
        return dataList;
    }

    private String parseDateString(String dateTimeText){
        if(!TextUtils.isEmpty(dateTimeText)) {
            String arrTime[] = dateTimeText.split("T", 2);
            String arrivalZone = arrTime[1];
            String arrivalTimeZone[] = arrivalZone.split(":00+", 2);
            return arrivalTimeZone[0];
        }
        return null;
    }

    private String parseTime(String travelTime) {
        if (!TextUtils.isEmpty(travelTime)) {
            int travelTimeInMinutes = Integer.parseInt(travelTime);
            long hours = TimeUnit.MINUTES.toHours(travelTimeInMinutes);
            long minute = travelTimeInMinutes - TimeUnit.HOURS.toMinutes(hours);

            if (hours != 0 && minute != 0) {
                return hours + " h " + minute + " m";
            } else if (hours != 0) {
                return hours + " h";
            } else if (minute != 0) {
                return minute + " m";
            }
        }
        return null;
    }
}