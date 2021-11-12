package com.mfs;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args)
    {
        // take i/pof 2 no and print sum
        int ans=sum2();
        System.out.println(ans);


    }

    //return the  value

    static int sum2(){
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;
        System.out.println("2 no:");

        num1=in.nextInt();
        num2=in.nextInt();
        sum=num1+num2;
        return sum;
  //      System.out.println("this will never execute");

    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;
        System.out.println("2 no:");

        num1=in.nextInt();
        num2=in.nextInt();
        sum=num1+num2;
        System.out.println("result :"+sum);

    }
}
