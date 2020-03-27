package com.company;

public class Film {
    String film_name,director_film,genre_film,company_film;

    int year;

    double imdb_point;

    public Film(String f_n,String c_f,String d_f,String g_f,int y,double i_p){
        film_name = f_n;
        director_film = d_f;
        genre_film = g_f;
        company_film = c_f;

        year = y;

        imdb_point = i_p;



                }
                void details_film(){

                System.out.println("Good choice!Film details:");

                System.out.println("Name:"+film_name);

                System.out.println("Genre:"+genre_film);

                System.out.println("Imdb:"+imdb_point);

                System.out.println("Director:"+director_film);

                System.out.println("Company:"+company_film);

                System.out.println("Year"+year);



                }



                }
