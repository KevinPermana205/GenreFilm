package com.example.genrefilm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvFilm;
    private ArrayList<Film> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFilm = findViewById(R.id.rv_film);
        rvFilm.setHasFixedSize(true);

        list.addAll(DataFilm.getListData());
        showRecyclerList();
    }
    private  void showRecyclerList(){
        rvFilm.setLayoutManager((new LinearLayoutManager(this)));
        ListFilmAdapter listFilmAdapter = new ListFilmAdapter(list);
        rvFilm.setAdapter(listFilmAdapter);
    }
}