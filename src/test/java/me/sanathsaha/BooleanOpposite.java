package me.sanathsaha;

import java.util.Scanner;

public class BooleanOpposite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean bool;
        System.out.println("Enter the bool value : ");
        bool = input.nextBoolean();
        System.out.println("Boolean Opposite : " +!bool);

    }
}
