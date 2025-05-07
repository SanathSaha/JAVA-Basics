package me.sanathsaha;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num,temp,r,sum=0;
        num = input.nextInt();
        temp = num;
        while(temp!=0){
            r = temp%10;
            sum = sum*10 + r;
            temp = temp/10;

        }
        if(num == sum){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
