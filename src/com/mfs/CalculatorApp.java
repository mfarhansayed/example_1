package com.mfs;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        int ans = 0;

        //while loop

        while (true)
        {

            //take operator as i/p

            System.out.println("enter operator :");

            //char intialise

            char op = input.next().trim().charAt(0);

            System.out.println();

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%')
            {

                System.out.println("enter 2 no :");
                int num1 = input.nextInt();
                int num2 = input.nextInt();


                if (op == '+')
                {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }

                if (op == '*') {
                    ans = num1 * num2;
                }

                if (op == '/')
                {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            }
            else if (op == 'x' || op == 'X') {
                break;
            }
            else
            {
                System.out.println("invalid");
            }
            System.out.println(ans);
        }

    }
}
