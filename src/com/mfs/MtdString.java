package com.mfs;

import java.util.Scanner;

public class MtdString {
//    public static void main(String[] args) {
//        String message =greet();
//        System.out.println(message);
//    }
//
//    static String greet() {
//        String greeting ="how are you";
//        return greeting;
//    }

    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        System.out.println("Name : ");
        String name = in.next();
        String personalised = myGreet(name);
        System.out.println(personalised);

    }

    static String myGreet(String name) {

        String message = " Hello " + name;
        return message;
    }
}
