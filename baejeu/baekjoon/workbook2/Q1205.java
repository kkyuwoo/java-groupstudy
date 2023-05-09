package baejeu.baekjoon.workbook2;

// https://www.acmicpc.net/problem/1205
// 등수 구하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;
public class Q1205 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        Long num = (long)Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        Long[] arr = new Long[P];
        for (int i = 0; i < N  ; i++) {
            arr[i] = (long)Integer.parseInt(st.nextToken());
        }

        if( arr[P-1] < num){


        }








    }
}
/*
 100, 90, 90, 80일 때 각각의 등수는 1, 2, 2, 4등
 랭킹 리스트에 올라 갈 수 있는 점수의 개수 P가 주어진다.
 그리고 리스트에 있는 점수 N개가 비오름차순으로 주어지고, 태수의 새로운 점수가 주어진다.
 이때, 태수의 새로운 점수가 랭킹 리스트에서 몇 등 하는지 구하는 프로그램을 작성하시오.
 만약 점수가 랭킹 리스트에 올라갈 수 없을 정도로 낮다면 -1을 출력한다.
 그리고 모든 점수는 2,000,000,000보다 작거나 같은 자연수 또는 0이다. // long 범위   -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807

  3 90 10 각각 N 태수점수 P가 주어진다.

 */