package me.sanathsaha;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Any positive number : ");
        int num = input.nextInt();
        int count = 0;
        if (num == 0 || num == 1) {
            System.out.println("Not Prime");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % 2 == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not a prime number");
            }
        }
    }
}
