package com.groupqa1;

import java.util.Scanner;

public class Task3Triangle {
    public static void main(String[] args) {
        System.out.print("Please, enter the triangle side width:");
        Scanner sideScanner = new Scanner(System.in);
        int rowBorder = sideScanner.nextInt();

        int spaceRow = 0;
        int spaceNum = rowBorder;
        int starCount =0;

        while(starCount != rowBorder + 1)
        {
            int it1 = 0;
            while (it1 < spaceNum)
            {
                System.out.print("  ");
                it1++;
            }
            int it2 = 0;
            while (it2 < spaceRow)
            {
                System.out.print("* ");
                it2++;
            }

            System.out.println();
            spaceRow++;
            spaceNum--;
            starCount++;
        }


    }
}
