package com.myproject;

import java.util.Scanner;

public class DivisionTest {

    public static void main(String... args){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Denominator or Enter 'Q' to exit ");
        String nextLine = myObj.nextLine();
        while(!nextLine.equals("Q")) {
            Long divisor = Long.valueOf(nextLine);
            System.out.println("Enter Numerator");
            Long divison = Long.valueOf(myObj.nextLine());

            long div = divisor / divison;
            long remainder = divisor % divison;

            System.out.println("Answer is : " + div + " R " + remainder);
        }
        System.exit(0);
    }
}
