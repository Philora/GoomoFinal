package com.goomo.travel.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.goomo.travel.model.FlightSearchData;
import com.goomo.travel.R;
import com.goomo.travel.RecyclerAdapter;
import com.goomo.travel.model.FlightSearchResponse;
import com.goomo.travel.model.SearchResult;

import java.util.ArrayList;
import java.util.List;

import util.AppData;

public class FlightResultsActivity extends AppCompatActivity {

    private static final String TAG = "FlightResultsActivity";
    private RecyclerAdapter adapter;
    private RecyclerView recyclerView;
    private List<FlightSearchData> pojosList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flight_results);
        recyclerView = (RecyclerView) findViewById(R.id.recFlight);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        pojosList = buildFlightSearchData(AppData.getData());
        adapter=new RecyclerAdapter(pojosList);
        recyclerView.setAdapter(adapter);
    }

    private List<FlightSearchData> buildFlightSearchData(FlightSearchResponse responseData){
        List<FlightSearchData> dataList=new ArrayList<>();
        for(SearchResult result:responseData.getResults()){
            FlightSearchData data=new FlightSearchData();


            data.setmArrival(result.getFlights().get(0).getArrivalDatetime());
            data.setmDeparture(result.getFlights().get(0).getDepartureDatetime());

            data.setmAirlineCode(result.getFlights().get(0).getAirlineCode());
            data.setmOrigin(result.getFlights().get(0).getOrigin());
            data.setmDestination(result.getDestination());

            data.setmDuration(result.getFlights().get(0).getTravelDurationInMinutes());
            //data.setmPrice(result.getPricings().get(0).getAdult().getPrice().getAmount());

            dataList.add(data);
        }
        return dataList;
    }
}