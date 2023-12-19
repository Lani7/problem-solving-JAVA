package com.lani.boj.silver;

import java.io.*;
import java.util.*;

public class S5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Character> list = new LinkedList<>();
        int ptr = -1;
        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            char[] chars = br.readLine().toCharArray();
            for (char c : chars) {
                if (Character.isAlphabetic(c) || Character.isDigit(c)) {
                    ptr++;
                    list.add(ptr, c);
                }
                else if (c == '-') {
                    if (ptr - 1 >= -1) {
                        list.remove(ptr);
                        ptr--;
                    }
                }
                else if (c == '<' && ptr - 1 >= -1)
                    ptr--;
                else if (c == '>' && ptr + 1 < list.size())
                    ptr++;
            }
            for (Character c : list)
                sb.append(c);
            sb.append('\n');
            list.clear();
            ptr = -1;
        }

        System.out.println(sb);

        br.close();
    }
}
