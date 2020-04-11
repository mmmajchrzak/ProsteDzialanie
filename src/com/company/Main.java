package com.company;

import java.util.Scanner;

public class Main {

    private static Object Scanner;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj zmienną x: ");
        double x = scan.nextDouble();
        System.out.println("Podaj zmienną y: ");
        double y = scan.nextDouble();
        System.out.println("Podaj zmienną z: ");
        double z = scan.nextDouble();
        double v = (4 * x - y) / (3 * (z * z + 1));
        System.out.println("Wynik działania wynosi: ");
        System.out.println(v);




        System.out.println();







    }
}
