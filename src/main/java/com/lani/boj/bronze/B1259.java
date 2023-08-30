package com.lani.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(bf.readLine());
            if(n == 0)  break;

            // 팰린드롬수 : 수의 숫자들을 뒤에서부터 읽어도 같다.
            // 뒤에서부터 읽은 숫자와 n이 같은지 비교한다.

            // solution 1
            StringBuilder sb = new StringBuilder(Integer.toString(n));
            if(n == Integer.parseInt(sb.reverse().toString()) )
                System.out.println("yes");
            else System.out.println("no");



            // solution 2
//            int num = n;
//            int reversed = 0;
//            int length = (int)(Math.log10(n) + 1); // n의 자릿수
//
//            int temp = 0;
//            while(num > 0) {
//                temp = num % 10;
//                num = num / 10;
//                reversed += temp * Math.pow(10, length - 1);
//                length--;
//            }
//
//            if(n == reversed) System.out.println("yes");
//            else System.out.println("no");

        }

        bf.close();
    }
}
