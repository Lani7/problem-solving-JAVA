package com.lani.boj.silver;

import java.io.*;
import java.util.*;

public class S10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        while (m-- > 0) {
            int idx = Arrays.binarySearch(arr, Integer.parseInt(st.nextToken()));
            if(idx < 0)
                sb.append('0').append(' ');
            else
                sb.append('1').append(' ');
        }

        System.out.println(sb);

        br.close();
    }
}
