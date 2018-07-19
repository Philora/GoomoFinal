package com.goomo.travel.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.goomo.travel.R;
import com.goomo.travel.model.FlightSearchData;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<FlightSearchData> listPojo;

    public RecyclerAdapter(List<FlightSearchData> data) {
        listPojo = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.flight_item, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final FlightSearchData myPojo= listPojo.get(position);
        holder.departure.setText(myPojo.getmDeparture());
        holder.arrival.setText(myPojo.getmArrival());

        holder.origin.setText(myPojo.getmOrigin());
        holder.dest.setText(myPojo.getmDestination());
        holder.airlines.setText(myPojo.getmAirlineCode());
        holder.duration.setText(myPojo.getmDuration());

//        holder.price.setText(myPojo.getmPrice());
    }

    @Override
    public int getItemCount() {
        return listPojo.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView departure, arrival, origin, dest, airlines , duration, price;

        public MyViewHolder(View itemView) {
            super(itemView);
            departure = (TextView) itemView.findViewById(R.id.txtStartTime);
            arrival = (TextView) itemView.findViewById(R.id.txtEndTime);
            origin = (TextView) itemView.findViewById(R.id.txtOrigin);
            dest = (TextView) itemView.findViewById(R.id.txtDestination);
            airlines = (TextView) itemView.findViewById(R.id.txtAirlines);
            duration = (TextView) itemView.findViewById(R.id.txt_hours);
            price = (TextView) itemView.findViewById(R.id.txtPrice);
        }
    }
}
