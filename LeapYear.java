package org.example;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Month Number");
        int Month=scan.nextInt();

        System.out.println("Enter Year");
        int Year=scan.nextInt();

        switch (Month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("month has 31 days"); break;

             case 4: case 6: case 9: case 11:
                System.out.println("month has 30 days");break;

            case 2: if ((Year % 400 == 0) || ((Year % 4 == 0) && (Year % 100 != 0))){
                System.out.println("month has 29 days and its a leap year"); break;
                }
                else {
                System.out.println("Month has 28 days");
            }
        }
    }
}



