package com.lani.boj.silver;

import java.io.*;
import java.util.*;

public class S15688 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
//        List<Integer> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < n; i++)
//            list.add(Integer.parseInt(br.readLine()));
            arr[i] = Integer.parseInt(br.readLine());

//        Collections.sort(list);
        Arrays.sort(arr);
//        Arrays.sort(arr, (num1,num2)->num2-num1);

//        for (int i: list)
        for (int i: arr)
            sb.append(i).append('\n');

        System.out.println(sb);

        br.close();
    }
}
