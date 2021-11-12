package com.mfs;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // int [] arr = new int[5];                 // for array
        //
//        arr[0] = 123;
//        arr[1] = 124;
//        arr[2] = 128;
//        arr[3] = 127;
//        System.out.println(arr[3]);
        
        // input using for loop

//        for (int i = 0; i < arr.length; i++)
//        {
//            arr[i]= in.nextInt();
//
//        }
//        System.out.println(Arrays.toString(arr));

        // array of objects

        String[] str = new String[4];                 // for array of string
        for(int i=0;i< str.length;i++)
        {
            str[i]= in.next();
        }

        System.out.println(Arrays.toString(str));

        // modify

        str[1]="mfs";

        System.out.println(Arrays.toString(str));




    }



}
