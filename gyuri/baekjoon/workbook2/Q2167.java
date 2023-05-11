package gyuri.baekjoon.workbook2;

import java.util.Scanner;

public class Q2167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        for (int i=0; i<k; i++) {
            int I = sc.nextInt();
            int J = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int result = 0;
            for (int j = I - 1; j < X; j++) {
                for (int l = J - 1; l < Y; l++) {
                    result += arr[j][l];
                }
            }
            System.out.println(result);
        }

    }
}
