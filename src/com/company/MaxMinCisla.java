package com.company;

import java.util.Scanner;

public class MaxMinCisla {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter cisla");

        int minCislo = 0;
        int maxCislo = 0;

        while(myObj.hasNext()) {
            int cisla = myObj.nextInt();
            if (cisla < minCislo) {
                minCislo = cisla;
            }
            if (cisla > maxCislo) {
                maxCislo = cisla;
            }

        }
        System.out.println("min number = " + minCislo + " max cislo = " + maxCislo);
    }
}
