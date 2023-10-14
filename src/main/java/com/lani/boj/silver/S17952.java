package com.lani.boj.silver;

import java.io.*;
import java.util.*;

// 17952 과제는 끝나지 않아!
public class S17952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[n];
        int idx = -1;
        int sum = 0;

        while(n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int flag = Integer.parseInt(st.nextToken());
            // 과제가 있는 경우
            if(flag == 1) {
                // 스택에 과제의 점수를 저장한다.
                stack.push(Integer.parseInt(st.nextToken()));
                // 배열에 과제 해결 시간(분)을 저장한다.
                // 이 때, 남은 시간을 저장해야 하므로 과제 해결 시간 - 1을 저장한다.
                int m = Integer.parseInt(st.nextToken());
                // 과제 해결 시간 - 1이 0일 경우 배열에 저장하지 않고 스택에서 pop.
                if(m - 1 == 0)
                    sum += stack.pop();
                else
                    arr[++idx] = m - 1;
            }
            // 과제가 없는 경우
            else if(idx >= 0) {
                // 기존 과제를 해야 하므로 배열의 최상단 값(과제해결 시간)을 -1 한다.
                // 그 값이 0이면 배열 인덱스를 -1하고 스택에서 pop 한 후 그 값을 누적으로 더한다.
                if(--arr[idx] == 0) {
                    idx--;
                    sum += stack.pop();
                }
            }
        }

        sb.append(sum);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
