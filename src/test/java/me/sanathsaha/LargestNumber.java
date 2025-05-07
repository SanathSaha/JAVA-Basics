package me.sanathsaha;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        if(x>y && x>z){
            System.out.println("Largest number is : " +x);
        } else if (y>x && y>z) {
            System.out.println("Largest number is : " +y);
        }else {
            System.out.println("largest number is : " +z);
        }
    }
}
