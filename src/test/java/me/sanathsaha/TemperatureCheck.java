package me.sanathsaha;

import java.util.Scanner;

public class TemperatureCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temp value : ");
        double temp = input.nextDouble();
        if(temp >= -50 && temp <= 50){
            System.out.println("Valid");
        }else {
            System.out.println("Invalid");
        }
    }
}
