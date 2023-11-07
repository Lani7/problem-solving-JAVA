package com.lani.boj.silver;

import java.io.*;
import java.util.*;

public class S10814 {
    static class Member implements Comparable<Member> {
        private int age;
        private String name;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Member m) {
            return this.age - m.age;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Member[] members = new Member[n];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            members[i] = new Member(Integer.parseInt(st.nextToken()), st.nextToken());
        }

        Arrays.sort(members);

        for(Member m : members)
            sb.append(m.age).append(' ').append(m.name).append('\n');

        System.out.println(sb);

        br.close();
    }
}
