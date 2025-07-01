package org.example;
import java.util.*;

import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int cel;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        cel = sc.nextInt();

        double fah = cel * (1.8)+ 32;
        System.out.printf("Temperature in Fahrenheit: %.2f", fah);

    }
}