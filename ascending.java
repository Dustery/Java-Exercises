package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        if (a>b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        if (a>c) {
            int tmp = a;
            a = c;
            c = tmp;
        }
        if (b>c) {
            int tmp = b;
            b = c;
            c = tmp;
        }
        System.out.println(a + " " + b + " " +c) ;

    }
}
