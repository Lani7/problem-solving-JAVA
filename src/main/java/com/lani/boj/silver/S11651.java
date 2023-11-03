package com.lani.boj.silver;

import java.io.*;
import java.util.*;

public class S11651 {
    static class Pair {
        private int x;
        private int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        Pair[] list = new Pair[n];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            list[i] = new Pair(x, y);
        }

        Comparator<Pair> cp = new Comparator<>() {
            @Override
            public int compare(Pair o1, Pair o2) {
//                if(o1.y < o2.y)             return -1;
//                else if(o1.y == o2.y) {
//                    if(o1.x < o2.x)         return -1;
////                    else if(o1.y == o2.y)   return 0;
//                    else                    return 1;
//                }
//                else                        return 1;

                return (o1.y < o2.y) ? -1 :
                        (o1.y == o2.y && o1.x < o2.x) ? -1 : 1;
            }
        };

        Arrays.sort(list, cp);

        for(Pair p : list)
            sb.append(p.x).append(' ').append(p.y).append('\n');

        System.out.println(sb);

        br.close();
    }
}
