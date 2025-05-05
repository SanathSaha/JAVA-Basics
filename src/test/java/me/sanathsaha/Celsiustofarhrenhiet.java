package me.sanathsaha;

import java.util.Scanner;

public class Celsiustofarhrenhiet {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double cel, farn;

        System.out.println("Enter farnenheit value : ");

        farn = input.nextDouble();

        cel = 1.8 * (farn - 32);

        System.out.println("celcius : " +cel);

    }
}
