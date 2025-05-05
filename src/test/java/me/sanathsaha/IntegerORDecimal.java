package me.sanathsaha;

import java.util.Scanner;

public class IntegerORDecimal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter the number : ");
        num = input.nextInt();
        if(num == (int) num){
            System.out.println("Integer");
        }
        else if(num == (double) num){
            System.out.println("Decimal");
        }
        else{
            System.out.println("Invalid number");
        }
    }
}
