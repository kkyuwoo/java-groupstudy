package baejeu.baekjoon.prinstar;



import java.util.*;

/*
별찍기 4
 */

public class Q2441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 0; i < input; i++) {
            for (int k = 0; k < i; k++) {
                System.out.printf(" ");
            }
            for (int j = input; j - i > 0; j--) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
