package com.example.genrefilm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class ListFilmAdapter extends RecyclerView.Adapter<ListFilmAdapter.ListViewHolder> {
    private ArrayList<Film> listFilm;

    public ListFilmAdapter (ArrayList<Film> list) {
        this.listFilm = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_film, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Film film = listFilm.get(position);
        Glide.with(holder.itemView.getContext())
                .load(film.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(film.getName());
        holder.tvDetail.setText(film.getDetail());
    }

    @Override
    public int getItemCount() {
        return listFilm.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName;
        TextView tvDetail;

        ListViewHolder(View itemview){
        super(itemview);
        imgPhoto = itemview.findViewById(R.id.img_item_film);
        tvName = itemview.findViewById(R.id.tv_item_name);
        tvDetail = itemview.findViewById(R.id.tv_detail);
     }
    }
}
