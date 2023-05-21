package baejeu.algorithm.prefixsum;

import java.util.Scanner;

// https://www.acmicpc.net/problem/11659
// 구간 합 구하기 4
// 수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.
import java.util.Scanner;
public class BJ11659 { // 백준 11659번
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int size = sc.nextInt(); // 숫자 N개
            int num = sc.nextInt(); // 구간들

        int [] PrefixSum = new int[size+1]; // 누적합 배열
        PrefixSum[0] = 0;
        for (int i = 1; i <= size ; i++) {  // 1 2 3 4 5
            PrefixSum[i] = sc.nextInt() + PrefixSum[i-1];
        }
        // 0 5 9 12 14 15 누적합 배열 prefixsum

        for (int i = 0; i < num ; i++) {
            int start = sc.nextInt(); // 구간 시작
            int end = sc.nextInt(); // 구간 끝
            System.out.println(PrefixSum[end]-PrefixSum[start-1]);
        }
    }
}
