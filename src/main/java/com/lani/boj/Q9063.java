package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int maxX = 0;   // 가장 큰 x 좌표점
        int minX = 0;   // 가장 작은 x 좌표점
        int maxY = 0;   // 가장 큰 y 좌표점
        int minY = 0;   // 가장 작은 y 좌표점

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // 처음 들어온 x, y 좌표값을 각각 maxX, minX, maxY, minY에 저장한다.
            if(i == 0)  {
                maxX = x; minX = x; maxY = y; minY = y;
            }

            // x, y값과 비교한다.
            if(x > maxX)    maxX = x;
            if(x < minX)    minX = x;
            if(y > maxY)    maxY = y;
            if(y < minY)    minY = y;
        }

        // 넓이를 구한다.
        System.out.println((maxX - minX) * (maxY - minY));

        bf.close();
    }
}
