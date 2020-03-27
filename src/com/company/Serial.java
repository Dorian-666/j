package com.company;

public class Serial {
    String serial_name, genre_serial, company_serial;

    int year_s, season, episodes_serial;

    double imdb_serial;

    public Serial(String serial_name, String c_s, String g_s, int y_s, int s, int e_s, double i_s) {

        this.serial_name = serial_name;
        genre_serial = g_s;
        company_serial = c_s;

        year_s = y_s;
        season = s;
        episodes_serial = e_s;

        imdb_serial = i_s;



    }
    void details_serial(){

        System.out.println("Good choice!Serial details:");

        System.out.println("Name:" + serial_name);

        System.out.println("Company:" + company_serial);

        System.out.println("Year" + year_s);

        System.out.println("Genre:" + genre_serial);

        System.out.println("Imdb:" + imdb_serial);

        System.out.println("Seasons:" + season);

        System.out.println("Episodes:" + episodes_serial);


    }

}

