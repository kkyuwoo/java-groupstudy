package gyuri.baekjoon.workbook1;

import java.util.Scanner;

public class Q2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int GCD = 0;
        int LCM = 0;

        for(int i = Integer.min(num1, num2); i > 0; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                GCD = i;
                break;
            }
        }

        for(int i = Integer.max(num1, num2); i < num1*num2+1; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                LCM = i;
                break;
            }
        }

        System.out.println(GCD);
        System.out.println(LCM);
    }
}
