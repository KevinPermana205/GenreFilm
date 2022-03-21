package com.example.genrefilm;

import java.util.ArrayList;

public class DataFilm {
    private  static String [] filmName = {
            "Horror",
            "Komedi",
            "Drama",
            "Romantis",
            "Biografi",
            "Petualangan",
            "Perang",
            "Scifi",
            "Animasi",
            "Blue Film"
    };

    private static String [] filmDetail = {
            "Cirinya film menakutkan",
            "Cirinya kita bisa ketawa",
            "Cirinya kisah tentang kehidupan sosial",
            "Cirinya tentang romansa",
            "Cirinya tentang seseorang saja",
            "Cirinya tentang perjalanan waktu",
            "Cirinya tentang perperangan",
            "Cirinya tentang imajinasi",
            "Cirinya tentang kartun",
            "Cirinya tentang konteks dewasa"
    };

    private static int[] filmImage = {
        R.drawable.horror,
        R.drawable.laughing,
        R.drawable.theater,
        R.drawable.romance,
        R.drawable.profile,
        R.drawable.adventure,
            R.drawable.conflict,
            R.drawable.ufo,
            R.drawable.drama,
            R.drawable.heart,
    };

    static ArrayList<Film> getListData(){
        ArrayList<Film> list = new ArrayList<>();
        for (int position = 0; position<filmName.length; position++){
            Film film = new Film();
            film.setName(filmName[position]);
            film.setDetail(filmDetail[position]);
            film.setPhoto(filmImage[position]);
            list.add(film);
        }
        return list;
    }
}
