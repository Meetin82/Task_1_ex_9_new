package com.company;
import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        String value;
        double a = readNumber(value = "the first leg: ");
        double b = readNumber(value = "the second leg: ");
        double square = countArea(a, b);
        double perimeter = countPerimeter(a, b);
        printPerimeter(square);
        printSquare(perimeter);
    }
    private static double countPerimeter(double a, double b) {
        double c = Math.sqrt(a * a + b * b);
        double p = (a + b + c);
        return p;
    }
    private static double countArea(double a, double b){
        double s = 0.5 * a * b;
        return s;
    }
    private static void printPerimeter(double perimeter) {
        System.out.println("The perimeter of this triangle: " + perimeter);
    }
    private static void printSquare(double square) {
        System.out.println("The square of this triangle: " + square);
    }
    private static double readNumber(String value) {
        System.out.print("Enter " + value);
        Scanner scn = new Scanner(System.in);
        return scn.nextDouble();
    }
}

