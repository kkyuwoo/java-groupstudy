package rivercastle.baekjoon.workbook1;

1
import java.util.Scanner;
2
        ​
        3
public class Q10870 {
4
    public static void main(String[] args) {
        5
        Scanner scanner = new Scanner(System.in);
        6
        int input = scanner.nextInt();
        7
        int[] intArr = {0, 1};
        8
        if(input < 2) {
            9
            System.out.printf("%d", intArr[input]);
            10
            return;
            11
        } else {
            12
            intArr = new int[input + 1];
            13
            intArr[0] = 0;
            14
            intArr[1] = 1;
            15
​
            16
            for (int i = 2; i <= input; i++) {
                17
                intArr[i] = intArr[i-2] + intArr[i-1];
                18
            }
            19
            System.out.printf("%d", intArr[input]);
            20
        }
        21
    }
22
}

