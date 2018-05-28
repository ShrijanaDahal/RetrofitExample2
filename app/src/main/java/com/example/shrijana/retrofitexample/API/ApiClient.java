package com.example.shrijana.retrofitexample.API;

import com.example.shrijana.retrofitexample.Model.Details;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;


public class ApiClient {
    public static final String BASE_URL = "https://sushilbhattarai.com.np/gokarnabista/api/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {

        Gson gson = new GsonBuilder()
                .serializeNulls()
                .create();

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
//                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
