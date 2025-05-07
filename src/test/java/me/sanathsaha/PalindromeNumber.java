package me.sanathsaha;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n,r,temp,sum=0;
        System.out.println("Enter the initial number : ");
        m =input.nextInt();
        System.out.println("Enter the end number : ");
        n = input.nextInt();
        int totalPalindrome = 0;
        for(int i=m;i<=n;i++){
            temp = i;
            sum = 0;
            while (temp!=0){
                r = temp%10;
                sum = sum*10+r;
                temp = temp/10;
            }
            if(sum == i){
                totalPalindrome++;
            }

        }
        System.out.println("Total Palindrome Number between " + m + "and" + n + " : " +totalPalindrome);
    }
}
