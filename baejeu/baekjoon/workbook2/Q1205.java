package baejeu.baekjoon.workbook2;

// https://www.acmicpc.net/problem/1205
// 등수 구하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q1205 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long score = Long.parseLong(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        ArrayList<Long> list = new ArrayList<>();

        if (N==0) System.out.println(1);
        else {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N ; i++) {
                list.add(Long.parseLong(st.nextToken()));
            }
            //System.out.println(list);
            if (N == P){
                if (Collections.min(list) >= score){
                    System.out.println(-1);
                }
                else{
                    for (int i = 0; i < N; i++) {
                        if (list.get(i) <= score) {
                            System.out.println(i+1);
                            break;
                        }
                    }
                }
            }
            else if (N < P){
               list.add(score);
               Collections.sort(list, Collections.reverseOrder());
               //System.out.println(list);
               for (int j = 0; j < N+1; j++) {
                    if (list.get(j) == score) {
                        System.out.println(j+1);
                        break;
                    }
               }
            }
        }
        /* 경우의 수 생각해보기  N 점수 P   10 <= P <= 50 0 <= N <= P
        1. N = 0 무조건 1등
        2. N == P  N에서의 최솟값이 새로운 점수보다 크거나 같으면 -1 출력 나머지는 등수 비교해서 등수 출력
        3. N < P  정렬해서 등수 구하면 끝
        */
    }
}
/*
입력 첫번째 N 점수 개수
입력 두번째 태수의 새로운 점수
입력 세번째 리스트에 올라갈수 있는 개수 P
그러고 태수의 점수는 몇등인가?  리스트에 올라갈 수 없도록 낮으면 -1 출력



 */