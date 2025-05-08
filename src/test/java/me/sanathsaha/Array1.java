package me.sanathsaha;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] number = new double[5];
        System.out.print("Please Enter the array value : ");
        for(int i=0; i < number.length; i++){
            number[i] = input.nextDouble();
        }
        double sum = 0;
        for(int i=0; i < number.length;i++){
            sum = sum+ number[i];
        }
        double avg = sum/ number.length;
        System.out.println("Total sum of the array : "+sum);
        System.out.println("Total avg of the array : "+avg);
    }
}
