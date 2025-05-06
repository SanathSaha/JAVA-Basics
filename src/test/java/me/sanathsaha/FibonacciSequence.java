package me.sanathsaha;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int n = input.nextInt();
        int first = 0;
        int second = 1;
        System.out.print(first +" " +second);
        for(int i=3;i<=n;i++){
            int fibo = first+ second;
            System.out.print(" " +fibo);
            first = second;
            second = fibo;
        }
    }
}
