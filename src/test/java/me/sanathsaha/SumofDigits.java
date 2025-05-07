package me.sanathsaha;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Digits : ");
        int sum=0,r,temp;
        temp = input.nextInt();
        while (temp!=0){
            r = temp%10;
            sum = sum+r;
            temp = temp/10;

        }
        System.out.println("Total sum : "+sum);

    }
}
