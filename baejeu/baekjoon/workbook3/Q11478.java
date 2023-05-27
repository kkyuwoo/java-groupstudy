package baejeu.baekjoon.workbook3;

// https://www.acmicpc.net/problem/11478
// 서로 다른 부분 문자열의 개수
//  ababc의 부분 문자열은 a, b, a, b, c, ab, ba, ab, bc, aba, bab, abc, abab, babc, ababc가 있고, 서로 다른것의 개수는 12개이다.

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Q11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String split[] = br.readLine().split("");
       // System.out.println(Arrays.toString(split));
        HashSet<String> answer = new HashSet<>();
        for (int i = 1; i <= split.length ; i++) { // 배열 크기만큼 반복
            plus(i, answer, split);
        }
        if (answer.contains("")) answer.remove("");
        System.out.println(answer);
        System.out.println(answer.size());
    }
    public static HashSet<String> plus(int i, HashSet<String> answer, String[] split){
        for (int j = 0; j < split.length ; j++) {
            String insert ="";
            for (int k = j; k < k + i ; k++) {
                if (k + i > split.length ) break;
                insert = insert + split[k];
            }
            answer.add(insert);
           // System.out.println(answer);
        }
        return answer;
    }
}
/*
        이거 어떻게 풀어야 하노? ㄷㄷ
        1. split 이용해서 ""으로 나누고 배열에 넣는다. ok
        2.lqkf

        hashset?
    */