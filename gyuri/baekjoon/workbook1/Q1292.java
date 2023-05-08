package gyuri.baekjoon.workbook1;

import java.util.Scanner;

public class Q1292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int[] arr = new int[1001];
        int cnt = 0;
        for (int i=1; i<=1000; i++) {
            for (int j = 0; j < i; j++) {
                if (cnt == 1000) break;
                arr[cnt] = i;
                cnt++;
            }
        }
        int result = 0;
        for (int i=num1; i<=num2; i++) {
            result += arr[i-1];
        }
        System.out.println(result);
    }
}
