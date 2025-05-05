package me.sanathsaha;

import java.util.Scanner;

public class ForloopPractice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i,n,sum=0;
        System.out.println("Enter the value : ");
        n = input.nextInt();
        for(i=1;i<=n;i++){
            sum += i;
        }
        System.out.println("Total sum of the values : " +sum);

    }

}
