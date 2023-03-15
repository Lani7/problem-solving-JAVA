package com.lani.doit_basic.ch02;

import java.util.Scanner;

public class Q8 {

    static class YMD {
        int y;      // 년
        int m;      // 월(1~12)
        int d;      // 일(1~31)

        // 생성자(주어진 날짜로 설정)
        YMD(int y, int m, int d) {
            this.y = y;
            this.m = m;
            this.d = d;
        }

        // 각 월의 일수
        int[][] mdays = {
                {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},		// 평년
                {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},		// 윤년
        };

        // year이 윤년인지 검사 (0 : 평년, 1 : 윤년)
        int isLeap(int year) {
            return ( year % 400 == 0 && year % 100 != 0 ) || year % 400 == 0 ? 1 : 0;
        }

        // n일 뒤의 날짜를 반환
        YMD after(int n) {
            YMD ymd = new YMD(this.y, this.m, this.d);

            if(n < 0)   return before(-n);

            ymd.d += n;

            // date가 해당하는 월의 일수보다 많을 경우
            while(ymd.d > mdays[isLeap(ymd.y)][ymd.m - 1]) {
                // date에서 해당 월의 일수를 뺀다
                ymd.d -= mdays[isLeap(ymd.y)][ymd.m - 1];
                // 월을 +1 추가한 다음 만약 월이 12보다 많을 경우
                if(++ymd.m > 12) {
                    // 연도를 +1 증가
                    ymd.y++;
                    // 월에 1을 저장
                    ymd.m = 1;
                }
            }

            return ymd;
        }

        // n일 전의 날짜를 반환
        YMD before(int n) {
            YMD ymd = new YMD(this.y, this.m, this.d);

            if(n < 0)   return after(-n);

            ymd.d -= n;

            // date가 1보다 적을 경우
            while(ymd.d < 1) {
                // 월을 -1한 다음 만약 월이 1보다 적을 경우
                if(--ymd.m < 1) {
                    // 연도를 -1
                    ymd.y--;
                    // 월에 12를 저장
                    ymd.m = 12;
                }
                // date에서 해당 월의 일수를 더한다
                // 이전 날짜를 구하는 것이므로 ymd.m를 -1한 월(이전월)의 날짜를 더한다.
                ymd.d += mdays[isLeap(ymd.y)][ymd.m - 1];

            }

            return ymd;
        }

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("날짜를 입력하세요");
        System.out.print("연 >> ");
        int y = stdIn.nextInt();
        System.out.print("월 >> ");
        int m = stdIn.nextInt();
        System.out.print("일 >> ");
        int d = stdIn.nextInt();

        YMD ymd = new YMD(y, m, d);

        System.out.println("며칠 전/후의 날짜를 구할까요?");
        int n = stdIn.nextInt();

        YMD after = ymd.after(n);
        System.out.printf( "%d일 후의 날짜는 %d년 %d월 %d일입니다.\n", n, after.y, after.m, after.d );
        YMD before = ymd.before(n);
        System.out.printf( "%d일 전의 날짜는 %d년 %d월 %d일입니다.\n", n, before.y, before.m, before.d );



    }
}
