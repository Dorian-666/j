package com.company;

import java.util.Scanner;

public class Netflix {
    String user_name,user_login,user_password;



    static String introduction="Welcome to netflix application!Please,firstly create  an account to continue. ";
    static String next_step="Successfully!.Next,please,choose what you want to watch(film or serial)";

    public Netflix(){


    }
    void registration(){
        System.out.print("Enter new login:");
        Scanner input = new Scanner(System.in);
        user_login = input.nextLine();
        System.out.print("Enter new password:");
        user_password = input.nextLine();

        System.out.print("Enter user name:");
        user_name = input.nextLine();

    }


}
