package com.example.projectexcull_app_01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HofAdapter  extends RecyclerView.Adapter<HofAdapter.HofViewHolder> {
    Context context;
    String hof_rank[], hof_username[];

    public HofAdapter(Context context, String[] hof_rank, String[] hof_username) {
        this.context = context;
        this.hof_rank = hof_rank;
        this.hof_username = hof_username;
    }

    @NonNull
    @Override
    public HofViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.hof_recycler_view, parent, false);

        return new HofViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HofViewHolder holder, int position) {
        holder.text_hof_rank.setText(hof_rank[position]);
        holder.text_hof_username.setText(hof_username[position]);
    }

    @Override
    public int getItemCount() {
        return hof_username.length;
    }

    public class HofViewHolder extends RecyclerView.ViewHolder {
        TextView text_hof_username, text_hof_rank;

        public HofViewHolder(@NonNull View itemView) {
            super(itemView);

            text_hof_username = itemView.findViewById(R.id.hof_recycler_username);
            text_hof_rank = itemView.findViewById(R.id.hof_recycler_rank);
        }
    }
}
