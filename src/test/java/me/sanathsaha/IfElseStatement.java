package me.sanathsaha;

import java.util.Scanner;

public class IfElseStatement {
    public  static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age;
        System.out.println("Enter your age");
        age = input.nextInt();
        if(age>=18){
            System.out.println("Valid voter");
        }
        else{
            System.out.println("Invalid voter");
        }
    }
}
