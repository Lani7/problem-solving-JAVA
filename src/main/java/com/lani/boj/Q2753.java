package com.lani.boj;

import java.util.Scanner;

public class Q2753 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(i <= 1 || i <= 4000 ) {
            if ( (i % 4 == 0 && i % 100 != 0) || i % 400 == 0 )
                System.out.println(1);
            else
                System.out.println(0);
        }
        scanner.close();
    }
}
