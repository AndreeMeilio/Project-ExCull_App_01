package com.example.projectexcull_app_01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AssignmentAdapter extends RecyclerView.Adapter<AssignmentAdapter.AssignmentViewHolder> {

    Context context;
    String[] task_name;
    String[] teacher_name;
    String[] deadline;

    public AssignmentAdapter(Context context, String[] task_name, String[] teacher_name, String[] deadline){
        this.context = context;
        this.task_name = task_name;
        this.teacher_name = teacher_name;
        this.deadline = deadline;
    }

    @NonNull
    @Override
    public AssignmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.assigment_recycler_list, parent, false);

        return new AssignmentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AssignmentViewHolder holder, int position) {
        holder.text_task_name.setText(task_name[position]);
        holder.text_teacher_name.setText(teacher_name[position]);
        holder.text_deadline.setText(deadline[position]);
    }

    @Override
    public int getItemCount() {
        return task_name.length;
    }

    public class AssignmentViewHolder extends RecyclerView.ViewHolder{
        TextView text_task_name, text_teacher_name, text_deadline;

        public AssignmentViewHolder(@NonNull View itemView) {
            super(itemView);

            text_task_name = itemView.findViewById(R.id.recycler_task_name);
            text_teacher_name = itemView.findViewById(R.id.recycler_teacher_name);
            text_deadline = itemView.findViewById(R.id.recycler_deadline);
        }
    }
}
