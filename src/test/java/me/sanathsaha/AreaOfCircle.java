package me.sanathsaha;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args){
        Scanner input = new Scanner("System.in");
        double area,radius;
        System.out.println("Enter the radius value : ");
        radius = input.nextDouble();

        area = 3.1416 * radius * radius;

        System.out.println("total area of the circle : " +area);

    }
}
