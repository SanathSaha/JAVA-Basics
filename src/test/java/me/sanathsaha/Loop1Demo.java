package me.sanathsaha;

import java.util.Scanner;

public class Loop1Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n;
        System.out.println("Enter the initial number : ");
        m = input.nextInt();
        System.out.println("Enter the final number : ");
        n = input.nextInt();
        int sum = 0;
        for (int i=m;i<=n;i++){
            if(i%2==0){
                sum += i;
            }
        }
        System.out.println("The sum is : " +sum);
    }
}
