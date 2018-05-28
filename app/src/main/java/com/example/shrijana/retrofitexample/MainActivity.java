package com.example.shrijana.retrofitexample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.shrijana.retrofitexample.API.ApiClient;
import com.example.shrijana.retrofitexample.API.ApiInterface;
import com.example.shrijana.retrofitexample.Adapter.RecyclerAdapter;
import com.example.shrijana.retrofitexample.Model.Details;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);

        getData();

    }

    private void getData() {
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<Details> profileDetail = apiService.getTestResponse();
        profileDetail.enqueue(new Callback<Details>() {
            @Override
            public void onResponse(Call<Details> call, Response<Details> response) {
                Details personDetails = response.body();
                recyclerView.setAdapter(new RecyclerAdapter(getApplicationContext(),personDetails.getData()));
                Toast.makeText(MainActivity.this, "Successful", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Details> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
