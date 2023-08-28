package com.lani.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 재귀의 귀재
public class B25501 {
    static int cnt = 0;
    public static int recursion(String s, int l, int r) {
        cnt++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s) {

        return recursion(s, 0, s.length() - 1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        for (int i = 0; i < t; i++) {
            String s = bf.readLine();
            cnt = 0;
            System.out.println(isPalindrome(s) + " " + cnt);
        }

        bf.close();
    }
}
