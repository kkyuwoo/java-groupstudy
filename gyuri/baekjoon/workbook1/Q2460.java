package gyuri.baekjoon.workbook1;

import java.util.Scanner;

public class Q2460 {
    public static void main(String[] args) {
        int max = 0;
        int now = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<10; i++) {
            int off = sc.nextInt();
            int get = sc.nextInt();
            now = now + get - off;
            if (max < now) {
                max = now;
            }
        }
        System.out.println(max);
    }
}
