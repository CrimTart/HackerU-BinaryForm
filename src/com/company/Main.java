package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me an integer: ");
        int n = scanner.nextInt();
        System.out.println("Integer in binary (machine): " + Integer.toBinaryString(n));
        System.out.println("Integer in binary (mathematical): " + binarize(n));
    }

    private static String binarize(int n) {
        StringBuilder sb = new StringBuilder();
        boolean negative = false;
        if (n < 0) {
            negative = true;
            n = -n;
        }
        while (n>0) {
            sb.append(n%2);
            n/=2;
        }
        if (negative) sb.append('-');
        return sb.reverse().toString();
    }
}
