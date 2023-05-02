package baejeu.baekjoon.prinstar;

/*
별찍기 9
*********   9
 *******    7
  *****
   ***
    *
   ***
  *****
 *******
*********

N = 5

 */

import java.util.Scanner;
public class Q2446 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();


        if (input > 1) {
            for (int i = 0; i < input-1; i++) {
                for (int j = 0; j < i ;j++) {  // 공백 윗부분
                    System.out.print(" ");
                }
                for (int j = 0; j < (input*2-1)-(2*i); j++) { // 별 윗부분
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 0; i < input-1 ; i++) { // 중앙 별
                System.out.printf(" ");
            }
            System.out.print("*");
            System.out.println();

            for (int i = 0; i < input-1; i++) {
                for (int j = 0; j < input-2-i ; j++) { // 아랫부분 공백
                    System.out.print(" ");
                }
                for (int j = 0; j < (i*2)+3; j++) { // 아랫부분 별
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else {
            System.out.print("*");
        }


    }
}
