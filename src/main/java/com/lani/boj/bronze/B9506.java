package com.lani.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            ArrayList<Integer> list = new ArrayList<>();
            int sum = 1;
            int n = Integer.parseInt(bf.readLine());
            if(n == -1) break;

            list.add(1);

            // n의 약수와 자기자신을 제외한 모든 약수들의 합을 구한다.
            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0) {
                    list.add(i);
                    sum += i;
                }
            }

            // 자기자신을 제외한 모든 약수들의 합과 같을 경우 출력
            if(sum == n) {
                System.out.print(n + " = ");
                for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i));
                    if(i != list.size() - 1) System.out.print(" + ");
                }
                System.out.println();
            }

            // 아닐 경우 출력
            if(sum != n) System.out.println(n + " is NOT perfect.");
        }
        bf.close();
    }
}
