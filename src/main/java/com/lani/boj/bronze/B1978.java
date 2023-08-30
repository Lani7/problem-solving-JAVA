package com.lani.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int cnt = 0;
        boolean flag;

        for (int i = 0; i < n; i++) {
            flag = true;
            int t = Integer.parseInt(st.nextToken());
            // 1은 소수이므로 무조건 소수처리한다.
            if(t == 1)  { flag = false; continue; }
            // 만약 t가 2~t-1의 숫자로 나누어떨어지지 않는다면 소수다.
            for (int j = 2; j < t; j++) {
                if(t % j == 0) { flag = false; break; }
            }
            if(flag)    cnt++;
        }

        System.out.println(cnt);

        bf.close();
    }
}
