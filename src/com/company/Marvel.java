package com.company;

public class Marvel {
    String superhero_name, identity_name, identity_surname;
    int age;
    static String team="Avengers";
    public Marvel(String s_n, String i_n , String i_s,int a){
        superhero_name =s_n;
        identity_name = i_n;
        identity_surname = i_s;
        age = a;

    }
    void introduce_hero(){
        System.out.println("I am "+superhero_name);
    }
    void motto(){
        System.out.println(superhero_name+":"+"Avengers,Assemble!");
    }
    void identity(){
        System.out.println("Name:"+identity_name);
        System.out.println("Surname:"+identity_surname);
        System.out.println("Age:"+age);
    }






}
