package com.example.shrijana.retrofitexample.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.shrijana.retrofitexample.MainActivity;
import com.example.shrijana.retrofitexample.Model.Details;
import com.example.shrijana.retrofitexample.R;

import java.util.List;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    private Context context;
    private List<Details> details;

    public RecyclerAdapter(Context context, List<Details> details) {
        this.context = context;
        this.details = details;
    }

    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.profile_details,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.MyViewHolder holder, int position) {
        Details profile =  details.get(position);
        holder.name.setText(profile.getName());
        Glide.with(context).load(profile.getImage()).into(holder.image);
        holder.description.setText(profile.getDescription());
        holder.shortDescription.setText(profile.getShortDescription());
        holder.phone.setText(profile.getPhone());
        holder.email.setText(profile.getEmail());

    }

    @Override
    public int getItemCount() {
        return details.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView  name, description, shortDescription, phone, email;
        ImageView image;
        public MyViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            image = itemView.findViewById(R.id.imageView);
            description = itemView.findViewById(R.id.description);
            shortDescription = itemView.findViewById(R.id.short_description);
            phone = itemView.findViewById(R.id.phone);
            email = itemView.findViewById(R.id.email);

        }
    }
}
