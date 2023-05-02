package baejeu.baekjoon.prinstar;



/*
     *
    ***
   *****
  *******     7
 *********    9
  *******
   *****
    ***
     *

출력하기
 */
import java.util.*;
public class Q2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 0; i < input ; i++) {
            for (int j = 1 ; j < input - i ; j++) {  // 윗부분 5기준 공백: 4->3
                System.out.print(" ");
            }
            for (int k = 0; k < 1+ i*2; k++) { // 윗부분 별 출력 1->3->5->7->9
                System.out.print("*");
            }
            System.out.println();
        }  // 윗부분 끝
        for (int i = 0; i < input-1 ; i++) { // 아랫부분 4번 반복
            for (int j = 0; j < i+1 ; j++) {  // 아랫부분 공백 1->2->3->4
                System.out.print(" ");
            }
            for (int k = 0; k < (input*2)-3-(2*i) ; k++) { // 아랫부분 별 7->5 (5기준)    9->7 (6기준)
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
