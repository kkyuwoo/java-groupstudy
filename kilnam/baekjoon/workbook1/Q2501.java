package kilnam.baekjoon.workbook1;

import java.util.Scanner;

public class Q2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int key = sc.nextInt();
        int cnt = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cnt++;
                if (cnt == key) {
                    System.out.println(i);
                }
            }

        }
        if (key > cnt) {
            System.out.println(0);

        }
    }
}
