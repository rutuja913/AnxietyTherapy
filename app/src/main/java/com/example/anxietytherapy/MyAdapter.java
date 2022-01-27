package com.example.anxietytherapy;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context context;
    ArrayList<User> list;

    public MyAdapter(Context context, ArrayList<User> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @androidx.annotation.NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @androidx.annotation.NonNull ViewGroup viewGroup, int i) {
View v=LayoutInflater.from(context).inflate(R.layout.item,viewGroup,false);
return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull @androidx.annotation.NonNull MyViewHolder holder, int i) {
User user= list.get(i);
holder.firstName.setText(user.getFirstName());
holder.lastName.setText(user.getLastName());
holder.age.setText(user.getAge());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
TextView firstName,lastName,age;

        public MyViewHolder(@NonNull @androidx.annotation.NonNull View itemView) {
            super(itemView);
            firstName=itemView.findViewById(R.id.tvfirstName);
            lastName=itemView.findViewById(R.id.tvlastName);
            age=itemView.findViewById(R.id.tvAge);
        }
    }
}
