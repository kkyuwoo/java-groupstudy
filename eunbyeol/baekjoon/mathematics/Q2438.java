package eunbyeol.baekjoon.mathematics;

import java.util.Scanner;

public class Q2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dan =  sc.nextInt();

        for(int i=0; i<dan; i++) {
            for(int j=0; j<i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
