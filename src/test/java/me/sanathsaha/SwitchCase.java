package me.sanathsaha;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int digit;
        System.out.println("Enter the value : ");
        digit = input.nextInt();

        switch (digit){
            case 1 :
                System.out.println("Select language bengali");
                break;
            case 2 :
                System.out.println("Select language Hindi");
                break;
            case 3 :
                System.out.println("Select language Urdu");
                break;
            default:
                System.out.println("Select language English");
                break;
        }
    }
}
