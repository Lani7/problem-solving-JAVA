package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        // 5로 나눌 수 있는지
        boolean flag = false;
        int a = n / 5;      // 5kg 의 몫 (봉지수)
        int b = 0;          // 3kg 의 몫 (봉지수)

        while(a>=0) {
            // 전체 kg - (5kg * 봉지수)를 3으로 나눈 나머지가 0이면 3으로 나눈 몫이 3kg의 봉지수가 된다
            if ( (n - (5 * a)) % 3 == 0) {
                b = (n - (5 * a)) / 3;
                flag = true;
                break;
                //System.out.println(a + b);
            }
            // 아니라면 봉지수를 -1한 다음 다시 반복문으로 실행한다
            a--;
        }
        if(flag == true) System.out.println(a + b);
        else System.out.println("-1");

        bf.close();
    }
}
