package baejeu.baekjoon.workbook3;

import java.util.Scanner;
// 재귀로 팰린드롭인지 확인하기 더 간단하게
public class Q10988Recursion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (find(input)) System.out.println(1);
        else System.out.println(0);
    }
    public static boolean find(String input) {
        if (input.length() <= 1) return true;

        if (input.charAt(0) != input.charAt(input.length()-1)){
            return false;
        }
        else{
            input = input.substring(1, input.length()-1);
            return find(input);
        }
    }
}

