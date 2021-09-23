package com.company;

import java.util.Scanner;

public class SecteniCisel {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter String");

        String str = myObj.nextLine();

        int sum = 0;
        String temp = "0";

        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch))
                temp += ch;

                // if current character is an alphabet
            else {
                // increment sum by number found earlier
                // (if any)
                sum += Integer.parseInt(temp);

                // reset temporary string to empty
                temp = "0";
            }
        }
        System.out.println(sum+ Integer.parseInt(temp));

    }
}
