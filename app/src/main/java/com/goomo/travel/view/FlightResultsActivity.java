package com.goomo.travel.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.goomo.travel.model.FlightSearchData;
import com.goomo.travel.R;
import com.goomo.travel.adapter.RecyclerAdapter;
import com.goomo.travel.model.FlightSearchModel;
import com.goomo.travel.model.FlightSearchResponse;
import com.goomo.travel.model.SearchResult;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import util.AppData;

public class FlightResultsActivity extends AppCompatActivity {

    FlightSearchModel searchModel;
    private RecyclerAdapter adapter;
    private RecyclerView recyclerView;
    private List<FlightSearchData> pojosList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flight_results);
        //getActionBar().setTitle(searchModel.getmSource()+"-->"+searchModel.getmDestination()+"\n\n"+searchModel.getmTraveldate());
        recyclerView = (RecyclerView) findViewById(R.id.recFlight);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        pojosList = buildFlightSearchData(AppData.getData());
        adapter = new RecyclerAdapter(pojosList);
        recyclerView.setAdapter(adapter);
    }

    private List<FlightSearchData> buildFlightSearchData(FlightSearchResponse responseData) {
        List<FlightSearchData> dataList = new ArrayList<>();

        if (dataList != null) {
            for (SearchResult result : responseData.getResults()) {

                if (result != null) {
                    FlightSearchData data = new FlightSearchData();

                    if (result.getFlights().get(0).getOrigin() != null) {
                    data.setmOrigin(result.getFlights().get(0).getOrigin());

                        if (result.getFlights().get(0).getDestination() != null) {
                            data.setmDestination(result.getFlights().get(0).getDestination());

                            String arrivalTime = result.getFlights().get(0).getArrivalDatetime();
                            String arrTime[]=arrivalTime.split("T",2);
                            String arrivalZone = arrTime[1];
                            String arrivalTimeZone[] = arrivalZone.split(":00+",2);
                            String arrival = arrivalTimeZone[0];
                            data.setmArrival(arrival);

                            String departureTime =result.getFlights().get(0).getDepartureDatetime();
                            String depTime[]=departureTime.split("T",2);
                            String departureZone = depTime[1];
                            String departureTimeZone[] = departureZone.split(":00+",2);
                            String departure = departureTimeZone[0];
                            data.setmDeparture(departure);

                            if (result.getFlights().get(0).getAirlineCode() != null) {
                                data.setmAirlineCode(result.getFlights().get(0).getAirlineCode());

                                data.setmDuration(result.getFlights().get(0).getTravelDurationInMinutes());
                                //  data.setmPrice(result.getPricings().get(0).getAdult().getPrice().getAmount());

                                dataList.add(data);
                            }
                        }
                    }
                }
            }

        }
        return dataList;
    }
}