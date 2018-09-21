package com.example.mhmd.perhoursjobs;


import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class jobsListAdapter extends RecyclerView.Adapter<jobsListAdapter.jobsListViewHolder>{

    List<jobsitem> jobsitemList;

    public jobsListAdapter(List<jobsitem> jobsitemList) {
        this.jobsitemList = jobsitemList;
    }

    @Override
    public jobsListAdapter.jobsListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_jobs,parent,false);

        return new jobsListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(jobsListAdapter.jobsListViewHolder holder, final int position) {

        holder.name.setText(jobsitemList.get(position).getJobName());
        holder.provider.setText(jobsitemList.get(position).getJobProvider());
        holder.distance.setText(jobsitemList.get(position).getDistance());
        holder.price.setText(jobsitemList.get(position).getJobPrice());

       /* holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent();
                intent.putExtra("Details",jobsitemList.get(position).getJobDescription());
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return jobsitemList.size();
    }

    public class jobsListViewHolder extends RecyclerView.ViewHolder
    {

        ImageView image;
        TextView name,provider,distance,price;

        public jobsListViewHolder(View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.name);
            provider = itemView.findViewById(R.id.provider);
            distance = itemView.findViewById(R.id.distance);
            price = itemView.findViewById(R.id.price);
        }
    }
}
