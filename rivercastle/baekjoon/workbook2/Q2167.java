package rivercastle.baekjoon.workbook2;

import java.util.Scanner;

public class Q2167 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] inputArr = new int[low][col];

        // 주어진 배열 만들기
        for (int i = 0; i < low; i++) {
            for (int j = 0; j < col; j++) {
                inputArr[i][j] = scanner.nextInt();
            }
        }

        int answerNumber = scanner.nextInt();
        for(int i = 0; i < answerNumber; i++) {
            //점 만들기
            int xLocation1 = scanner.nextInt() - 1;
            int yLocation1 = scanner.nextInt() - 1;
            int xLocation2 = scanner.nextInt() - 1;
            int yLocation2 = scanner.nextInt() - 1;
            int sum = 0;

            //범위지정 및 합 및 출력
            for (int j = xLocation1; j <= xLocation2; j++) {
                for(int k = yLocation1; k <= yLocation2; k++) {
                    sum += inputArr[j][k];
                }
            }
            System.out.printf("%d\n", sum);
        }
    }
}
