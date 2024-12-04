package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un numar intre 10000 si 99999: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n < 10000 || n > 99999) {
            System.out.println("Numarul nu este valid");
            return;
        }

        int sumEven = 0;
        int sumOdd = 0;

        while (n > 0) {
            int digit = n % 10;
            
            if (digit % 2 == 0) 
                sumEven += digit;
            else sumOdd += digit;

            n /= 10;
        }

        if (sumEven >= sumOdd) 
            System.out.println("DA");
        else System.out.println("NU");
    }
}