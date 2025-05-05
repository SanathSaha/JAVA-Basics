package me.sanathsaha;

import java.util.Scanner;

public class VowelConsotant {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("Enter any character : ");
        ch = input.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("Vowel");
        }
        /*
        else if (ch=='e') {
            System.out.println("vowel");
        }
        else if (ch=='i') {
            System.out.println("vowel");
        }else if (ch=='o') {
            System.out.println("vowel");
        }else if (ch=='u') {
            System.out.println("vowel");
        }
        */

        else{
            System.out.println("Consonant");
        }

    }
}
