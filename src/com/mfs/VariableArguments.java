package com.mfs;

import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
  //      fun(2,7,78,54,77);
  //      multiple(2,4,"mfs","ss","sdfa");
        demo(12,47,88);
        demo("sfsc","dwec");

    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a,int b, String ...v){


    }

    static void fun(int ...v) {             // Variable length arguments
        System.out.println(Arrays.toString(v));

    }
}
