package baejeu.baekjoon.workbook3;


// 재귀로 팰린드롬 찾기
import java.util.Scanner;
public class Q10988Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String[] input = in.split("");
        if (find(input)) System.out.println(1);
        else System.out.println(0);
    }

    public static boolean find(String[] input) {
        if (input.length <= 1) return true;
        String[] input2;
        if (input[0].equals(input[input.length - 1])) {
            input2 = new String[input.length - 2];
            for (int i = 0; i < input.length - 2; i++) {
                input2[i] = input[i + 1];
            }
        }
        else {
            return false;
        }
        return find(input2);
    }
}
