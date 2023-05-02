package baejeu.baekjoon.prinstar;



/*
 *********
 *******
 *****
 ***
 *

 */

import java.util.*;
public class Q2443 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < i ; j++) { // 공백 출력 for문   0 , 1, 2, 3,
                System.out.print(" ");
            }
            for (int j= 0; j < (input*2)-1-(2*i) ; j++ ) { // 첫줄:9 두번째줄:7  input = 5 0,1,2,3,4,5,6,7,8
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
