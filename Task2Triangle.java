package com.groupqa1;

import java.util.Scanner;

public class Task2Triangle {
    public static void main(String[] args) {
        System.out.print("Please, enter the triangle side width:");
        Scanner sideScanner = new Scanner(System.in);
        int rowBorder = sideScanner.nextInt();
        int starRow = 0;
        int starNum = rowBorder;
        int spaceCount =0;

        while(starRow < rowBorder){
            int it1 = 0;
            while (it1 < spaceCount)
            {
                System.out.print("  ");
                it1++;
            }
            int it2 = 0;
            while (it2 < starNum)
            {
                System.out.print("* ");
                it2++;
            }

            System.out.println();
            spaceCount++;
            starNum--;
            starRow++;
        }

    }
}
