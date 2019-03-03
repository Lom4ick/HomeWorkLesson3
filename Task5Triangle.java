package com.groupqa1;

import java.util.Scanner;

public class Task5Triangle {
        public static void main(String[] args) {
            System.out.println("Input triangle height:");
            Scanner scanner = new Scanner(System.in);
            int middle = scanner.nextInt();
            int a1 = 0;
            while(a1 < middle)
            {
                int i = 0;
                while (i < middle - a1)
                {
                    System.out.print(" ");
                    i++;
                }
                int j = 0;
                while (j < a1*2 + 1)
                {
                    System.out.print("*");
                    j++;
                }
                System.out.println();
                a1++;
            }
            int a2 = 0;
            while(a2 < middle)
            {
                int i = 0;
                while (i < middle - a2)
                {
                    System.out.print(" ");
                    i++;
                }
                int j = 0;
                while (j < a2*2 + 1)
                {
                    System.out.print("*");
                    j++;
                }
                System.out.println();
                a2++;
            }
        }
    }
