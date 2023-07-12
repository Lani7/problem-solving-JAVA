package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());
            if(one == 0 && two == 0)    break;
            if(two % one == 0) // 첫번째 숫자가 두번째 숫자의 약수
                System.out.println("factor");
            else if(one % two == 0) // 첫번째 숫자가 두번째 숫자의 배수
                System.out.println("multiple");
            else
                System.out.println("neither");
        }

        bf.close();
    }
}
