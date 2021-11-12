package com.mfs;

import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int emoID = in.nextInt();
        String department = in.next();

        //switch

        switch (emoID) {
            case 1 -> System.out.println("MFS");
            case 2 -> System.out.println("son");
            case 3 -> {
                System.out.println("smith");
                switch (department) {
                    case "IT" -> System.out.println("IT Dep");
                    case "Management" -> System.out.println("Management Dep");
                    default -> System.out.println("No dept");
                }
            }
            default -> System.out.println("incoorect empid");
        }

    }


}
