package rivercastle.baekjoon.kangseong;

import java.math.BigInteger;
import java.util.Scanner;

public class Q1676 {//팩토리얼 0의 개수

    public static BigInteger getFactorial(int n) {
        BigInteger answer = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            BigInteger factorialElement = new BigInteger("" + i + "");
            answer = answer.multiply(factorialElement);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger numberFactorial = getFactorial(scanner.nextInt());
        int answer = 0;
        BigInteger zero = new BigInteger("0");
        BigInteger ten = new BigInteger("10");

        while (numberFactorial.remainder(ten).equals(zero)) {
            answer += 1;
            numberFactorial = numberFactorial.divide(ten);
        }
        System.out.println(answer);
    }
}
