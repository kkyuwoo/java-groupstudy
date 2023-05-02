package baejeu.baekjoon.prinstar;



/*
별찍기5
    *
   ***
  *****
 *******
*********
*/

import java.util.*;
public class Q2442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 0; i < input ; i++) {       // input = 5
            for (int j =input-i; j > 1 ; j--) { // 공백을 위한 for문
                System.out.printf(" ");
            }
            for ( int k = -1;  k < i * 2; k++ ) { // 별 출력을 위한 for문
                System.out.printf("*");
            }
            if ((0<=i) &&  (i < input-1))
                System.out.println();
        }
    }
}

