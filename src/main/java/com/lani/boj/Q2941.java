package com.lani.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String word = bf.readLine();
        int prev = 0;
        int cnt = 0;
        boolean dz = false;

        for (int i = 0; i < word.length(); i++) {

            int c = word.charAt(i);
            if(prev == 99) {
               if(c == 61 || c == 45) { // c= , c-
                   cnt--;
               }
            }
            if(dz == true && c == 61)  { cnt = cnt-1; }   // dz=
            else if(prev == 100) {  // d
                if(c == 45) { cnt--; }  // d-
                if(c == 122)   { dz = true; }   // dz
            }
            if( !(prev == 100 & c == 122))  dz = false;
            if(prev == 108 && c == 106) { cnt--; }  // lj
            else if(prev == 110 && c == 106) { cnt--; }  // nj
            else if(prev == 115 && c == 61) { cnt--; }
            else if(dz == false && prev == 122 && c == 61) {   // z=
                cnt--;
            }
            cnt++;
            prev = c;

        }
        System.out.println(cnt);

        bf.close();
    }
}
