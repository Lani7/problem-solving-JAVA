package com.lani.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s4134 {

    private static boolean getPrime(long n) {
        for (int j = 2; j <= Math.sqrt(n); j++) {
            // 소수가 아닐 경우
            if(n % j == 0)  return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
//        boolean flag;

        // n보다 크거나 같은 소수 중 가장 작은 소수를 찾는다.
        // 소수 : 1보다 큰 자연수 중 1과 자기 자신만을 약수로 가지는 수

        for (int i = 0; i < t; i++) {
            long n = Long.parseLong(bf.readLine());

            // n보다 크거나 같은 숫자들 중에서 소수를 찾는다.

            // n이 2보다 작을 경우 (0 또는 1)
            if(n < 2)   n = 2;

            while(true) {
                // solution 2
                if(!getPrime(n))    n++;
                else break;

                // solution 1
//                flag = true;
//                for (int j = 2; j <= Math.sqrt(n); j++) {
//                    // 소수가 아닐 경우
//                    if(n % j == 0)  { flag = false; break; }
//                }
//                if(flag == false)  n++;     // n이 1 증가한다.
//                else    break;              // 소수면 반복문 탈출
            }

            // 소수 출력
            System.out.println(n);
        }

        bf.close();
    }
}
