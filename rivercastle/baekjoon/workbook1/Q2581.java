package rivercastle.baekjoon.workbook1;
import java.util.Scanner;

public class Q2581 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberM = scanner.nextInt();
        int numberN = scanner.nextInt();
        //주어진 수에 1이 포함되는 경우
        if (numberM == 1) {
            numberM = 2;
        }

        int sum = 0;
        int order = 0;
        int min = 0;

        for (int i = numberM; i <= numberN; i++) {
            boolean isPrime = true;
            //속도향상을 위해 제곱근까지만 검사
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                sum += i;
                order += 1;
                if (order == 1) {
                    min = i;
                }
            }
        }
        if (order == 0) {
            System.out.println(-1);
        } else {
            System.out.printf("%d\n%d", sum, min);
        }
    }
}
