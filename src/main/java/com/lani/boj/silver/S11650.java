package com.lani.boj.silver;

import java.io.*;
import java.util.*;

public class S11650 {
    static class Pair implements Comparable<Pair> {
        private int x;
        private int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Pair o) {
//            if(x < o.x)     return -1;
//            else if(x == o.x) {
//                if(y < o.y) return -1;
//                else if(y == o.y)   return 0;
//                else    return 1;
//            }
//            else    return 1;

            return (x < o.x) ? -1 :
                    (x == o.x && y < o.y) ? -1 : 1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        List<Pair> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            list.add(new Pair(x, y));
        }

        Collections.sort(list);

        for(Pair p : list)
            sb.append(p.x).append(' ').append(p.y).append('\n');

        System.out.println(sb);

        br.close();
    }
}
