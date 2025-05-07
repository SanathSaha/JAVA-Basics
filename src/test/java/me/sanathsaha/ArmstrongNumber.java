package me.sanathsaha;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n,r,temp,sum=0;
        System.out.println("Enter the initial number : ");
        m =input.nextInt();
        System.out.println("Enter the end number : ");
        n = input.nextInt();
        int totalArmstrong = 0;
        for(int i=m;i<=n;i++){
            temp = i;
            sum = 0;
            while (temp!=0){
                r = temp%10;
                sum = sum+r*r*r;
                temp = temp/10;
            }
            if(sum == i){
                System.out.println("The armstrong number is ; " +i);
                totalArmstrong++;
            }

        }
        System.out.println("Total Armstrong Number between " + m + " and " + n + " : " +totalArmstrong);
    }
}
