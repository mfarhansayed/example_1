package com.mfs;

import java.util.Arrays;
import java.util.Scanner;

public class PassingInFtn {
    public static void main(String[] args)
    {
        int[] num ={1,44,54,77};
        System.out.println(Arrays.toString(num));
        main(num);
        System.out.println(Arrays.toString(num));
    }
    static void main(int [] arr)
    {
        arr[0]=44;

    }
}
// Strings are immutable

