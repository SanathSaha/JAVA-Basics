package me.sanathsaha;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,fact = 1;
        System.out.println("enter any number:");
        n = input.nextInt();
        for(int i=1; i<=n; i++){
            fact=fact*i;

        }
        System.out.printf("factorial of %d is ",n);
        System.out.println(fact);


    }
}
