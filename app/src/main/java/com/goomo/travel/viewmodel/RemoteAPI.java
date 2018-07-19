package com.goomo.travel.viewmodel;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.goomo.travel.model.FlightSearchResponse;
import com.goomo.travel.model.Goomo;
import com.goomo.travel.model.SearchTrackResponse;
import com.goomo.travel.view.FlightResultsActivity;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;

import util.AppData;

public class RemoteAPI {
    private static final String TAG = "RemoteAPI";
    private static Gson gson;
    private RequestQueue requestQueue;
    private Context context;


    public RemoteAPI(Context context) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gson = gsonBuilder.create();
        requestQueue = Volley.newRequestQueue(context);
        this.context=context;
    }

    public void searchFlightApi(final String source,final String destination, final String traveldatte,
                                       final int adultCount, final int childCount,
                                       final String travelClass, final Boolean isIndianResident,final int infantCount) {
        String jsonURL = "https://pre-client-api.goomo.team/v1/flights/one_way/search";

        JsonObjectRequest json_req = new JsonObjectRequest(Request.Method.POST, jsonURL, null, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {
                SearchTrackResponse searchTrackResponse = gson.fromJson(response.toString(), SearchTrackResponse.class);
                Log.d(TAG, "onResponse: "+searchTrackResponse.getMeta().getSearch_track_id());
                flightResultApi(searchTrackResponse.getMeta().getSearch_track_id());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Volley", "Error "+error.getMessage());
            }
        }) {
            @Override
            public byte[] getBody() {
                JSONObject jsonObject = new JSONObject();
                byte[] body = new byte[0];
                try {
                    JSONObject sourceJson=new JSONObject();
                    sourceJson.put("airport",source);
                    JSONObject destinationJson=new JSONObject();
                    destinationJson.put("airport",destination);
                    jsonObject.put("origin", sourceJson);
                    jsonObject.put("destination", destinationJson);
                    jsonObject.put("travel_date", traveldatte);
                    jsonObject.put("residentof_india", isIndianResident);
                    jsonObject.put("class_type", travelClass);
                    jsonObject.put("adult_count", adultCount);
                    jsonObject.put("child_count", childCount);
                    jsonObject.put("infant_count", infantCount);
                } catch (JSONException jex) {
                    jex.printStackTrace();
                }
                try {
                    body = jsonObject.toString().getBytes("UTF-8");
                    Log.d(TAG, "getBody: "+jsonObject.toString());
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                return body;
            }

            @Override
            public String getBodyContentType() {
                return "application/json";
            }
        };
        requestQueue.add(json_req);

    }

    public void flightResultApi(String searchTrackId) {
        String flightUrl = "https://pre-client-api.goomo.team/v1/flights/one_way/"+searchTrackId;
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, flightUrl, null, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {
                FlightSearchResponse responseData = gson.fromJson(response.toString(), FlightSearchResponse.class);
                AppData.setData(responseData);
                context.startActivity(new Intent(context, FlightResultsActivity.class));
                Log.d(TAG, "goomo" + responseData.getMeta().getDestination());


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Volley", "Error");
            }
        });
        requestQueue.add(request);
    }
}