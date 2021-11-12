package com.mfs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

//
//        int max = a;
//
//        if (b > max){
//            max =b;
//
//        }
//        if (c > max){
//            max = c;
//        }


        int max = Math.max(c, Math.max(a,b));
        System.out.println(max);

    }
}
