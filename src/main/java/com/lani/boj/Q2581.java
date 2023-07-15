package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(bf.readLine());
        int n = Integer.parseInt(bf.readLine());
        int sum = 0;
        int min = 0;
        boolean flag = true;

        // m 이상과 n 이하의 자연수 중 소수인 것을 모두 찾는다
        for (int i = m; i <= n; i++) {
            if(i == 1)  continue;
            flag = true;
            for (int j = 2; j <= i/2; j++) {
                if(i % j == 0)  { flag = false; break; }
            }

            if(flag == true)   {
                sum += i;       // 소수를 누적으로 더한다.
                if(min == 0)   { min = i; } // 최솟값
            }
        }

        if(sum != 0)    {
            System.out.println(sum);
            System.out.println(min);
        }
        else            System.out.println("-1");

        bf.close();
    }
}
