package me.sanathsaha;

import java.util.Scanner;

public class OperatorsPractice {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)){
            int PhonePrice = 1800;
            int numberOfInstallments , installmentPerMonth;
             
            System.out.println("Enter Number of installment : ");

            numberOfInstallments = input.nextInt();

            installmentPerMonth = PhonePrice / numberOfInstallments;

            System.out.println("Monthly install amount : " + installmentPerMonth + "euros");
        }

    }
}
