package baejeu.baekjoon.workbook3;

// https://www.acmicpc.net/problem/11478
// 서로 다른 부분 문자열의 개수
//  ababc의 부분 문자열은 a, b, a, b, c, ab, ba, ab, bc, aba, bab, abc, abab, babc, ababc가 있고, 서로 다른것의 개수는 12개이다.

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11478UseSubString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine(); // 문자열 입력 받기
        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i <=input.length() ; i++) { // 1000 * 1000 = 1000000 시간복잡도 충분하게 통과
            for (int j = i; j <=input.length() ; j++) {
                if (i==j) continue; // ""이 들어가는 이유
                hashSet.add(input.substring(i, j));
            }
        }
        // hashSet.remove("");
        // System.out.println(hashSet);
        System.out.println(hashSet.size());
    }
}
