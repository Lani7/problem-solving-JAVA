package com.lani.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bf.readLine());    // 테스트 개수 t

        for(int i = 0; i < t; i++) {
            int charge = Integer.parseInt(bf.readLine());

            int quarter = charge / 25;  // $0.25
            int dime = (charge % 25) / 10;  // $0.10
            int nickel = ((charge % 25) % 10) / 5;  // $0.05
            int penny = ((charge % 25) % 10) % 5;   // $0.01

            System.out.printf("%d %d %d %d\n", quarter, dime, nickel, penny);
        }
    }
}
