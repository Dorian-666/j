package com.company;

import java.util.Scanner;

public class Process {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Netflix account = new Netflix();

        System.out.println(account.introduction);

        account.registration();

        System.out.println(account.next_step);


        System.out.print("For film-input 1 and for serial,input 2:");
        int input_1 = scan.nextInt();
        switch (input_1){
            case 1:
                System.out.print("There are 2 films in this application.Please ,enter number for film which you want(1 or 2)+:");

                int input_2 = scan.nextInt();

                Film film_1 = new Film("Avengers","Disney","Russo brothers","Fantastic",2019,7.5);

                Film film_2 = new Film("Titanic","Warnerbros","James Cameron","Dram",1990,8.6);

                switch (input_2){
                    case 1:
                        film_1.details_film();
                        break;

                    case 2:
                        film_2.details_film();
                }



                break;
            case 2:
                System.out.print("There are 2 serials in this application.Please ,enter number for serial which you want(1 or 2):");

                int input_3 = scan.nextInt();

                Serial serial_1 = new Serial("Daredevil","Disney","SuperHero",2016,5,10,7.8);

                Serial serial_2 = new Serial("Rick and Morty","Netflix","Animation",2013,4,11,8.0);



                switch (input_3){
                    case 1:
                        serial_1.details_serial();
                        break;

                    case 2:
                        serial_2.details_serial();
                        break;

                }





        }



    }


}
