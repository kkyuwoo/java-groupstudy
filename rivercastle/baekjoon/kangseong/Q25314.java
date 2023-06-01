package rivercastle.baekjoon.kangseong;

import java.util.Scanner;

public class Q25314 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nByte = scanner.nextInt();
        System.out.println("long ".repeat(nByte / 4) + "int");
    }
}
