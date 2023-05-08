package rivercastle.baekjoon.workbook1;

import java.util.Scanner;

public class Q2693 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] testArr = new int[10];
        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++) {
            for(int j = 0; j < 10; j++) {
                testArr[j] = scanner.nextInt();
            }

            for(int j = 0; j < 3; j++) {
                int max = testArr[j];
                for (int k = j; k < 10; k++) {
                    if (testArr[k] > max) {
                        int temp = testArr[j];
                        testArr[j] = testArr[k];
                        max = testArr[j];
                        testArr[k] = temp;
                    }
                }
            }
            System.out.printf("%d\n", testArr[2]);
        }
    }
}
