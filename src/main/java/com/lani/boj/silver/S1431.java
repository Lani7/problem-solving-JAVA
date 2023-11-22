package com.lani.boj.silver;

import java.io.*;
import java.util.*;

public class S1431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++)
            arr[i] = br.readLine();

        Comparator<String> comparator = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length())
                    return o1.length() - o2.length();
                else {
                    int o1sum = 0, o2sum = 0;
                    for (int i = 0; i < o1.length(); i++) {
                        if (Character.isDigit(o1.charAt(i)))
                            o1sum += o1.charAt(i) - '0';
                        if (Character.isDigit(o2.charAt(i)))
                            o2sum += o2.charAt(i) - '0';
                    }
                    if (o1sum != o2sum)
                        return o1sum - o2sum;
                    else
                        return o1.compareTo(o2);
                }
            }
        };

        Arrays.sort(arr, comparator);

        for (String s : arr)
            sb.append(s).append('\n');

        System.out.println(sb);

        br.close();
    }
}
