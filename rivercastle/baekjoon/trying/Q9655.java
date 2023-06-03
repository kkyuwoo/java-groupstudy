package rivercastle.baekjoon.trying;

import java.util.Scanner;

public class Q9655 {//돌게임
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stones = scanner.nextInt();

        int times = stones / 3;
        int remains = stones % 3;

        if (times % 2 == 0) {
            if (remains % 2 == 0) {
                System.out.println("CY");
            } else {
                System.out.println("SK");
            }
        } else {
            if (remains % 2 == 0) {
                System.out.println("SK");
            } else {
                System.out.println("CY");
            }
        }
    }
}
