package rivercastle.baekjoon.workbook1;

import java.util.Scanner;

public class Q2501 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int cnt = 0;

        for (int i = 1; i <= number1; i++) {
            if (number1 % i == 0) {
                cnt += 1;
            }
            if (cnt == number2) {
                System.out.println(i);
                break;
            }
        }

        if (number2 > cnt) {
            System.out.printf("%d\n", 0);
        }
    }
}
