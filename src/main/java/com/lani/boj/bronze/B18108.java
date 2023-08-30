package com.lani.boj.bronze;

import java.util.Scanner;

public class B18108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bulgi = scanner.nextInt();

        int adYear = bulgi - 543;

        System.out.println(adYear);

        scanner.close();
    }
}
