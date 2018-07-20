package com.goomo.travel.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import com.goomo.travel.model.FlightSearchModel;

import java.util.List;

public class GoomoViewModel extends AndroidViewModel {

    private RemoteAPI remoteSource;

    public GoomoViewModel(Application application) {
        super(application);
        remoteSource=new RemoteAPI(getApplication());

    }

    public void searchFlights(FlightSearchModel data) {
        remoteSource.searchFlightApi(
                data.getmSource(),
                data.getmDestination(),
                data.getmTraveldate(),
                data.getmAdultCount(),
                data.getmChildCount(),
                data.getmTravelClass(),
                data.isIndianResient(),
                data.getmInfantCount());

    }
}
