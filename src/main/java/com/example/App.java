package com.example;

public class App {

    public static double calculateSI(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public static void main(String[] args) {
        double p = 1000;
        double r = 5;
        double t = 2;

        System.out.println("Simple Interest: " + calculateSI(p, r, t));
    }
}
