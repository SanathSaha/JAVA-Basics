package me.sanathsaha;

import java.util.Scanner;

public class LogicalAND {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char ch ,ch2;
        System.out.println("Is your masters completed ?  : ");
        ch=input.next().charAt(0);

        System.out.println("are you fluent in English or not ? :");
        ch2 = input.next().charAt(0);

        if (ch=='y' && ch2=='y'){
            System.out.println("You are eligible for the interview");
        } else if (ch=='n' && ch2=='n') {
            System.out.println("You are not eligible for the interview");
        }else{
            System.out.println("Not applied");
        }
    }
}
