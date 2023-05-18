package kilnam.baekjoon.workbook2;

import java.util.Scanner;

public class Q2563 {
    public static int[][] arr = new int[100][100];
    public static int sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int paper = sc.nextInt();
        for (int i = 0; i < paper; i++) {
            makeSqure(sc.nextInt(), sc.nextInt());
        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);

    }


    static void makeSqure(int x, int y) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[100 - y - i][x + j] = 1;

            }
        }

    }
}