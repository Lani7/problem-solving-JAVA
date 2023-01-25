package com.lani.doit_basic.ch01;

public class Q8 {

    static int sumof(int a, int b) {
        int sum = 0;
        if(a > b) {
            sum = (a + b) * (a - b + 1) / 2;
        } else {
            sum = (a + b) * (b - a + 1) / 2;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumof(3, 5));
    }
}
