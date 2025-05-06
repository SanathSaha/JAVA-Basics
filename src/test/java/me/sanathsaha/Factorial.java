package me.sanathsaha;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,fact = 1;
        System.out.println("Enter any positive number:");
        num = input.nextInt();
        int i=num;
        while(i>=1){
            fact = fact*i;
            i--;
        }
        System.out.printf("Factorial of "+num+" = "+fact);



    }
}
