package me.sanathsaha;

import java.util.Scanner;

public class EvenOddProblem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int num;
        System.out.print("Enter the number : ");
        num = input.nextInt();
        if(num%2==0){
            System.out.println("The number is even");
        } else if (num%2 != 0) {
            System.out.println("The number is odd");
            
        }else {
            System.out.println("Something else");
        }

    }
}
