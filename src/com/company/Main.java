package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int srednee = (( x + y + z) / 3);
        System.out.println (srednee);
        int bez = srednee / 2;
        //System.out.println(bez);
        if (bez > 3){
            System.out.println("Программа выполнена корректно");
        }






	// write your code here
    }
}
