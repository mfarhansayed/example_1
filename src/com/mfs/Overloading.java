package com.mfs;

public class Overloading {
    public static void main(String[] args) {
        fun(77);
        fun("mfs");
        fun(4,77);
        fun(44,78,12);

    }
    static void fun(int a,int b) {
        int sum = a +b;
        System.out.println(sum);

    }

    static void fun(int a,int b,int c) {
        int ans= a * b - a / b + c;
        System.out.println(ans);

    }


    static void fun(int a) {
        System.out.println("first one");
        System.out.println(a);

    }

    static void fun(String name){
        System.out.println("second one");
        System.out.println(name);

    }

}
