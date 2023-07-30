package com.lani.programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class 교점에_별_만들기 {
    static long minX, maxX, minY, maxY;

    private static class Point {

        public final long x, y;

        private Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    // 교차점 찾기
    private Point intersection(long a, long b, long e, long c, long d, long f) {
        double x, y;

        if(a*d - b*c == 0)  return null;

        double tempx =  (double)(b*f - e*d) / (double)(a*d - b*c); // BF-ED / AD-BC
        double tempy = (double)(e*c - a*f) / (double)(a*d - b*c); // EC-AF / AD-BC

        // 교차점 중 정수를 구별한다
        if(tempx % 1 == 0.0 && tempy % 1 == 0.0) {
            x = tempx;
            y = tempy;
        } else return null;

        return new Point((long) x, (long) y);
    }

    private void findMinMaxXY(long x, long y) {
        // 최소, 최고 x점과 최소, 최고 y점을 찾는다
        if(x < minX)    minX = x;
        if(x >= maxX)    maxX = x;
        if(y < minY)    minY = y;
        if(y >= maxY)    maxY = y;
    }

    public String[] solution(int[][] line) {

        int cnt = 0;
        List<Point> list = new ArrayList<>();

        // 서로 다른 직선 간의 교점을 구한다.
        for(int i = 0; i < line.length-1; i++) {
            for(int j = i+1; j < line.length; j++) {
                Point point = intersection(line[i][0], line[i][1], line[i][2],
                        line[j][0], line[j][1], line[j][2]);
                if(point != null)   {
                    list.add(point);    // 정수인 교차점을 list에 담는다

                    // 첫 x, y값을 minX, maxX, minY, maxY에 초기화해준다.
                    if(cnt == 0) {
                        cnt++;
                        minX = point.x; maxX = point.x;
                        minY = point.y; maxY = point.y;
                    }

                    // 최소, 최고 x점과 최소, 최고 y점을 찾는다
                    findMinMaxXY(point.x, point.y);
                }
            }
        } // end of for

        // x, y사이의 거리를 각각 계산한다
        int dtx = (int) (maxX - minX + 1);
        int dty = (int)(maxY - minY + 1);

        // 2차 배열을 .로 초기화한다.
        char[][] arr = new char[dty][dtx];

        for(int i = 0; i < dty; i++) {
            for(int j = 0; j < dtx; j++) {
                arr[i][j] = '.';
            }
        }

        // 배열에 들어갈 인덱스를 계산한 후 *을 찍어준다.
        for(int i = 0; i < list.size(); i++) {

            int xloc = (int)(list.get(i).x - minX);
            int yloc = (int)(maxY - list.get(i).y);

            arr[yloc][xloc] = '*';
        }

        // 2차원 배열을 각각 문자열로 변환한다
        String[] answer = new String[dty];
        for(int i = 0; i < dty; i++) {
            answer[i] = new String(arr[i]);
        }

        return answer;
    }

}
