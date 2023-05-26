package kilnam.baekjoon.workbook3;

import java.util.Scanner;
public class Q10988 {

    public static int palindrome(String str) {
        if (str.length() <= 1) {
            return 1;
        } else {
            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                return palindrome(str.substring(1, str.length() - 1));

            } else {
                return 0;
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(palindrome(input));

    }
}
