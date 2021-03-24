package com.example.projectexcull_app_01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AssignmentAdapter extends RecyclerView.Adapter<AssignmentAdapter.AssignmentViewHolder> {
    Context context;
    int[] assigment_logo;
    String[] assigment_title;

    public AssignmentAdapter(Context context, int[] assigment_logo, String[] assigment_title) {
        this.context = context;
        this.assigment_logo = assigment_logo;
        this.assigment_title = assigment_title;
    }

    @NonNull
    @Override
    public AssignmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.assignment_recycler, parent, false);

        return new AssignmentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AssignmentViewHolder holder, int position) {
        holder.text_assignment_title.setText(assigment_title[position]);
        holder.img_assignment_logo.setImageResource(assigment_logo[position]);
    }

    @Override
    public int getItemCount() {
        return assigment_title.length;
    }

    public class AssignmentViewHolder extends RecyclerView.ViewHolder {
        ImageView img_assignment_logo;
        TextView text_assignment_title;

        public AssignmentViewHolder(@NonNull View itemView) {
            super(itemView);

            img_assignment_logo = itemView.findViewById(R.id.assignment_recycler_image);
            text_assignment_title = itemView.findViewById(R.id.assignment_title);
        }
    }
}
