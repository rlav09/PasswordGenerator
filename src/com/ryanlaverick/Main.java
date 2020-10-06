package com.ryanlaverick;

import com.ryanlaverick.handler.Password;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);


        main.print("Enter the length of password you wish to generate");


        do {
            String len = scanner.nextLine();

            Password password = new Password();

            main.print("Your password is: " + password.init(Integer.parseInt(len)));
        } while(true);
    }

    private void print(String s) {
        System.out.println(s);
    }
}
