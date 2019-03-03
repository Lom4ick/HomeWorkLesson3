package com.groupqa1;

import java.util.Scanner;

public class Task1Triangle {

    public static void main(String[] args) {
        System.out.print("Please, enter the triangle side width:");
        Scanner sideScanner = new Scanner(System.in);
        int rowBorder = sideScanner.nextInt();
        int starRow = 0;
        while (starRow < rowBorder - 1  ) {
            int starNumber = starRow;
            while (starNumber >= 1) {
                System.out.print("* ");
                starNumber--;
            }
            System.out.print("*");
            System.out.println();
            starRow++;
        }
        while (starRow >= 0) {
            int starNumber = starRow;
            while (starNumber > 0){
                System.out.print("* ");
                starNumber--;
            }
            System.out.print("* ");
            System.out.println();
            starRow--;
        }
    }
}
