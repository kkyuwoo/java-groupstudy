package rivercastle.baekjoon.trying;

import java.util.Scanner;

public class Q2417 {//정수 제곱근 미해결 https://www.acmicpc.net/problem/2417
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        System.out.println(Math.sqrt(number) % 1 == 0 ? (long) Math.sqrt(number) : ((long) Math.sqrt(number)) + 1);
    }
}
