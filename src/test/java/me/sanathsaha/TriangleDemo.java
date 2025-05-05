package me.sanathsaha;

import java.util.Scanner;

public class TriangleDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius : " );
        double radius = input.nextInt();


        double area = 3.1416 * radius * radius;

        System.out.println("Total area of an area : " +area);

    }
}
