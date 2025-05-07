package me.sanathsaha;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num,temp,r,sum=0;
        num = input.nextInt();
        temp = num;
        while(temp != 0){
            r = temp % 10;
            sum = sum*10 + r;
            temp = temp/10;
        }
        System.out.println("Reverse number is : "+sum);
    }
}
