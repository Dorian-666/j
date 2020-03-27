package com.company;

public class Main {
    public static void main(String[] args){
        Marvel hero_1 = new Marvel("Iron Man","Tony","Stark",45);

         Marvel hero_2 = new Marvel("Captan America","Steve","Rogers",102);

             System.out.println("Hero's team:"+hero_1.team);

                System.out.println("Hero's team:"+hero_2.team);
                System.out.println(" ");


                   hero_1.introduce_hero();
                    hero_1.identity();
                    System.out.println(" ");

                       hero_2.introduce_hero();
                        hero_2.identity();
                        hero_2.motto();



    }

}
