package rivercastle.baekjoon.workbook2;

import java.util.Scanner;

public class Q2563 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //하얀색도화지
        int[][] whitePaper = new int[100][100];

        int width = 0; //겹치는 넓이 (답)

        int pieces = scanner.nextInt(); //검정색 종이의 수
        for (int i = 0; i < pieces; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            for (int j = y; j < y + 10; j++) {
                for (int k = x; k < x + 10; k++) {//점으로 1cm 1cm 쪼개서 일치여부 확인
                    if (whitePaper[j][k] != 1) {
                        width += 1;
                        whitePaper[j][k] = 1;
                    }
                }
            }
        }
        System.out.println(width);
    }
}