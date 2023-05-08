package gyuri.baekjoon.workbook1;

import java.util.Scanner;

public class Q2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int total = 0;
        int min = 10000;
        for(int i = M; i <= N; i++) {
            int factors = 0;
            if(i==1) factors++;
            for(int j = 2; j < i; j++) {
                if (i % j == 0) {
                    factors++;
                    break;
                }
            }
            if (factors == 0) {
                total += i;
                if (min > i) {
                    min = i;
                }
            }
        }
        if (total == 0) {
            System.out.println(-1);
        } else {
            System.out.println(total);
            System.out.println(min);
        }
    }
}
