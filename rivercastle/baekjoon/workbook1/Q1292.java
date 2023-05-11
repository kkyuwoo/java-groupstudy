package rivercastle.baekjoon.workbook1;

import java.util.Scanner;

public class Q1292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt() - 1; // 1 ~
        int end = scanner.nextInt(); // ~ 1000
        int[] intArr = new int[end];
        int value = 1;
        int length = 0;
        int sum = 0;

        //주어진 범위의 마지막까지 수열을 만들기
        for (int i = 0; i < end; i++) {
            for (int j = 0; j < value; j++) {
                intArr[i] = value;
                i++;
                length++;

                if (length >= end) {
                    break;
                }
            }
            i--; //수 할당이 끝나고 마지막에 idx수정
            value++;
        }
        //합계
        for (int i = start; i < end; i++) {
            sum += intArr[i];
        }
        System.out.printf("%d", sum);
    }
}
