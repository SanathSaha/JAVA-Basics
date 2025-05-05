package me.sanathsaha;

import java.util.Scanner;

public class LogicalOR {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("Enter the letter : ");
        ch = input.next().charAt(0);
        if (ch == 'y' || ch == 'Y') {
            System.out.println("You are a java lover");
        } else if (ch=='n' || ch=='N') {
            System.out.println("You are not a lover");
        }else {
            System.out.println("Neutral");
        }
    }
}
