package com.lani.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2745 {
    public static void main(String[] args) throws IOException {
        // 10진법으로 변환하기
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        String n = st.nextToken();  // 숫자
        String b = st.nextToken();  // B진법

        // 숫자 문자열 n을 각 자리수마다 쪼갠다
        char[] s = n.toCharArray();

        int no = 1;     // 자리수마다 곱할 수
        int sum = 0;    // 각 자리수를 더한 값 (십진수 변환값)
        for (int i = s.length - 1; i >= 0; i--) {
            // 이때 b에 알파벳이 있다면 알파벳에 해당하는 숫자로 변환한다
            if(s[i] >= 65 && s[i] <= 90) {
                sum += (int) (s[i] - 55 ) * no;
            } else {
                // 각 자리수마다 입력받은 진법b를 곱한다
                // 각 자리수마다 각각 곱한 수를 모두 더한다
                sum += (s[i] - '0') * no;
            }
            // 진법에 해당하는 수만큼 누적 곱할 수
            no *= Integer.parseInt(b);
        }

        System.out.println(sum);

        bf.close();
    }
}
