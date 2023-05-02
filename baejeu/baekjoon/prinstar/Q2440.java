package baejeu.baekjoon.prinstar;



/*
별찍기 3
*****
****
***
**
*

 */


import java.util.*;

public class Q2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 0; i < input; i++) {   // 1~2345
            for (int j = input; j - i > 0; j--) {
                System.out.printf("*");
            }
            System.out.println();

        }
    }
}
