package gyuri.baekjoon.printstar;

import java.util.Scanner;

public class Q2446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<i; j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=2*(n-i)+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--) {
            for(int j=1; j<i; j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=2*(n-i)+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}