package com.lani.boj;

import java.io.*;
import java.util.StringTokenizer;

public class S24060 {
    static int k, cnt, answer;
    static int[] tmp;

    // A[p..r]을 오름차순 정렬한다.
    static void merge_sort(int a[], int p, int r) {
        if(p < r) {
            int q = (p + r) / 2;             // p, r의 중간 지점
            merge_sort(a, p, q);            // 전반부 정렬
            merge_sort(a, q + 1, r);     // 후반부 정렬
            merge(a, p, q, r);              // 병합
        }
    }

    // A[p..q]와 A[q+1..r]을 병합하여 A[p..r]을 오름차순 정렬된 상태로 만든다.
    // A[p..q]와 A[q+1..r]은 이미 오름차순으로 정렬되어 있다.
    static void merge(int[] a, int p, int q, int r) {
        int i = p, j = q + 1, t = 1;

        while (i <= q && j <= r) {
            if(a[i] <= a[j])
                tmp[t++] = a[i++];
            else
                tmp[t++] = a[j++];
        }

        // 왼쪽 배열 부분이 남은 경우
        while (i <= q) {
            tmp[t++] = a[i++];
        }
        // 오른쪽 배열 부분이 남은 경우
        while (j <= r) {
            tmp[t++] = a[j++];
        }

        i = p;
        t = 1;
        // 결과를 A[p..r]에 저장
        while (i <= r) {
            a[i++] = tmp[t++];
            if(++cnt == k) {
                answer = tmp[t - 1];
                System.out.println(answer);
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        tmp = new int[n + 1];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        merge_sort(arr, 0, n - 1);

        if(cnt < k) System.out.println("-1");

        br.close();
    }
}
