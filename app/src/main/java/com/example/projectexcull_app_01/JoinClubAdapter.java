package com.example.projectexcull_app_01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class JoinClubAdapter extends RecyclerView.Adapter<JoinClubAdapter.JoinClubViewHolder> {
    Context context;
    String nama_club[], pendiri[], jumlah_anggota[];
    int logo_club[];

    public JoinClubAdapter(Context context, String[] nama_club, String[] pendiri, String[] jumlah_anggota, int[] logo_club) {
        this.context = context;
        this.nama_club = nama_club;
        this.pendiri = pendiri;
        this.jumlah_anggota = jumlah_anggota;
        this.logo_club = logo_club;
    }

    @NonNull
    @Override
    public JoinClubViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.join_club_recycler, parent, false);

        return new JoinClubViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull JoinClubViewHolder holder, int position) {
        holder.img_logo_club.setImageResource(logo_club[position]);
        holder.textview_nama_club.setText(nama_club[position]);
        holder.textview_pendiri.setText(pendiri[position]);
        holder.textview_jumlah_anggota.setText(jumlah_anggota[position]);
    }

    @Override
    public int getItemCount() {
        return nama_club.length;
    }

    public class JoinClubViewHolder extends RecyclerView.ViewHolder{
        ImageView img_logo_club;
        TextView textview_nama_club, textview_pendiri, textview_jumlah_anggota;

        public JoinClubViewHolder(@NonNull View itemView) {
            super(itemView);

            img_logo_club = itemView.findViewById(R.id.recycler_image_join);
            textview_nama_club = itemView.findViewById(R.id.club_name);
            textview_pendiri = itemView.findViewById(R.id.club_head);
            textview_jumlah_anggota = itemView.findViewById(R.id.club_member);
        }
    }
}
