package com.oop;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //System.out.println("Enter name");
//        scanner.nextLine();
//        String ys = scanner.nextLine();
//        String dd = scanner.nextLine();
//        System.out.println(x+ys+dd);
//        String n = scanner.nextLine();
//        System.out.println("Enter 2 nd name");
//        String n2 = scanner.nextLine();
//        System.out.println(n+n2);
//        int x = 100;
//        int newx = newx(x);
//        System.out.println(x);
//        System.out.println(newx);
//        System.out.println("Enter 1 number");
//        int x = scanner.nextInt();
//        System.out.println("Ebter 2 number");
//        int x2 = scanner.nextInt();
//        System.out.println("Enter 3 number");
//        int x3 = scanner.nextInt();
//        System.out.println(x+x2+x3);
        int arr[] = new int[5];
        String srr[] = new String[5];
        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter "+i+" number");
            arr[i] = scanner.nextInt();
            //srr[i] = scanner.nextLine();
            //System.out.println("Enter name");
            //
        }
        System.out.println(Arrays.toString(arr));
       //System.out.println(Arrays.toString(srr));


    }
//    public static int newx(int x){
//        x = 20;
//        return x+200;
//    }
}
