package baejeu.baekjoon.workbook2;

// https://www.acmicpc.net/problem/2563
// 색종이
// 첫째 줄에 색종이의 수가 주어진다.
// 둘째 줄부터 한 줄에 하나씩 색종이를 붙인 위치가 주어진다. 색종이를 붙인 위치는 두 개의 자연수로 주어지는데 첫 번째 자연수는 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리이고,


import java.util.Scanner;

public class Q2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 색종이 숫자
        int[][] box = new int[100][100]; // 크기 10000인 2차원 배열 생성
        for (int i = 0; i < num ; i++) {
            int l = sc.nextInt(); // 왼쪽 변의 위치
            int u = sc.nextInt(); // 아래쪽 변의 위치

            for (int j = l; j < l + 10; j++) { // 색종이의 가로 길이
                for (int k = u; k < u + 10; k++) { // 색종이의 세로 길이
                    box[j][k] = 1;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < 100 ; i++) {
            for (int j = 0; j < 100 ; j++) {
                sum += box[i][j];
            }
        }
        System.out.println(sum);
    }
}

