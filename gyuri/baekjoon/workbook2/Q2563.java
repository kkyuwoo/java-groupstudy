package gyuri.baekjoon.workbook2;

import java.util.Scanner;

public class Q2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[101][101];
        int result = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = x; j < x+10; j++) {
                for (int k = y; k < y+10; k++) {
                    if(arr[j][k] == 0) {
                        arr[j][k] = 1;
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
