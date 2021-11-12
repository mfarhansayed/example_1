package com.array;

import java.util.Scanner;

public class ArrayList
{
    public static void main(String[] args)
    {
        System.out.println("Enter");
        Scanner in = new Scanner(System.in);

        //Syntax

       java.util.ArrayList<Integer> list = new java.util.ArrayList<>(10);
        list.add(67);
        list.add(674);
        list.add(677);
        list.add(6744);
        System.out.println(list);
        list.set(1,44);
        list.remove(2);
        System.out.println(list);

//        //input
//        for (int i = 0; i < 5; i++) {
//            list.add(in.nextInt());
//
//
//        }
//        // get item at any index
//
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(list.get(i));
//        }

     }
}
