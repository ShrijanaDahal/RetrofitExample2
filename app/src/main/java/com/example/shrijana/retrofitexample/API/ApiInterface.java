package com.example.shrijana.retrofitexample.API;

import com.example.shrijana.retrofitexample.Model.Details;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("Management/personalInfo")
    Call<Details> getTestResponse();
}
