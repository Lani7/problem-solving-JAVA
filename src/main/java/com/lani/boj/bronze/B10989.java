package com.lani.boj.bronze;

import java.io.*;

public class B10989 {
    static void countingSort(int[] arr, int max) {
        int[] f = new int[max + 1];
        int[] b = new int[arr.length];

        for (int i = 0; i < arr.length; i++)    f[arr[i]]++;
        for (int i = 1; i <= max; i++)          f[i] += f[i - 1];
        for (int i = 0; i < arr.length; i++)    b[--f[arr[i]]] = arr[i];
        for (int i = 0; i < arr.length; i++)    arr[i] = b[i];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(br.readLine());

        int max = arr[0];
        for (int i = 0; i < n; i++)
            if(arr[i] > max)    max = arr[i];

        countingSort(arr, max);

        for (int i : arr)
            sb.append(i).append('\n');

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
