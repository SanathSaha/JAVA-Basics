package me.sanathsaha;

import java.util.Scanner;

//import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlTree.P;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principle amount : ");
        double P = input.nextDouble();
        System.out.println("Enter the annual rate");
        double r = input.nextDouble();
        System.out.println("Enter the time");
        double t = input.nextDouble();

        double A = P * Math.pow((1 + r / 100), t);
        System.out.println(" Compound Amount is : %.2f"+A);
    }
}
