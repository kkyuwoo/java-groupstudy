package rivercastle.baekjoon.kangseong;

import java.math.BigDecimal;
import java.util.Scanner;

public class Q10757 {//큰 수 A + B

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal value1 = new BigDecimal(scanner.next());


        System.out.println(value1.add(new BigDecimal(scanner.next())));
    }
}
