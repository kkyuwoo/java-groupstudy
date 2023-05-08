package gyuri.baekjoon.workbook1;

import java.util.Scanner;

public class Q1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt =0;
        for(int i = 0; i < N; i++) {
            int num = sc.nextInt();
            int factors = 0;
            if (num == 1) continue;
            for(int j=2; j*j<=num; j++) {
                if (num % j == 0) factors++;
            }
            if (factors == 0) cnt++;
            }
        System.out.println(cnt);
    }
}
