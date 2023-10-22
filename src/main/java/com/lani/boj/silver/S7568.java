package com.lani.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 7568 덩치
public class S7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] weights = new int[n];
        int[] heights = new int[n];
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            // 순서를 인덱스로 하고 몸무게 배열, 키 배열에 입력된 수를 각각 저장한다.
            weights[i] = Integer.parseInt(st.nextToken());
            heights[i] = Integer.parseInt(st.nextToken());
        }

        // 키와 몸무게 모두 크면 덩치가 더 크다.
        // 자신보다 더 큰 덩치의 사람 수 k를 구한다. 그럼 그 자신의 덩치 등수는 k + 1이 된다.
        for(int i = 0; i < n; i++) {
            int k = 0;
            for (int j = 0; j < n; j++) {
                if(i == j)      continue;
                if(weights[i] < weights[j] && heights[i] < heights[j])
                    k++;
            }
            sb.append(k + 1).append(' ');
        }

        System.out.println(sb);
        br.close();
    }
}
