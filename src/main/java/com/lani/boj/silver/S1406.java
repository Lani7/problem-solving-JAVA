package com.lani.boj.silver;

import java.io.*;
import java.util.*;

public class S1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        String s = br.readLine();
        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < s.length(); i++)
            left.push(s.charAt(i));

        while (m-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char order = st.nextToken().charAt(0);
            switch (order) {
                case 'L' :
                    if (!left.isEmpty())
                        right.push(left.pop());
                    break;
                case 'D' :
                    if (!right.isEmpty())
                        left.push(right.pop());
                    break;
                case 'B' :
                    if (!left.isEmpty())
                        left.pop();
                    break;
                case 'P' :
                    char c = st.nextToken().charAt(0);
                    left.push(c);
                    break;
            }
        }

        for (Character c : left)
            sb.append(c);
        while (!right.isEmpty())
            sb.append(right.pop());

        System.out.println(sb);

        br.close();
    }
}
