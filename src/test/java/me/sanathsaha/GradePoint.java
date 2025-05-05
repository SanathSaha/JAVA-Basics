package me.sanathsaha;

import java.util.Scanner;

public class GradePoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the score : ");
        int score = input.nextInt();
        if(score>=80 && score<=100){
            System.out.println("Grade A = 4");
        } else if (score>=60 && score<=79) {
            System.out.println("Grade B = 3");

        } else if (score>=50 && score <=59) {
            System.out.println("Grade C = 2");
        } else if (score>=40 && score<=49) {
            System.out.println("Grade D = 1");
        }else if(score<40) {
            System.out.println("Grade F = 0");
        }else{
            System.out.println("Invalid Input");
        }
    }
}
