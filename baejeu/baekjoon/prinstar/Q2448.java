package baejeu.baekjoon.prinstar;

/*

입력
첫째 줄에 N이 주어진다. N은 항상 3×2k 수이다. (3, 6, 12, 24, 48, ...) (0 ≤ k ≤ 10, k는 정수)
                       *          N=3
                      * *
                     *****

                       *          N=6
                      * *
                     *****
                    *     *
                   * *   * *
                  ***** *****



 */

import java.util.Scanner;
public class Q2448 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(input);
        sc.close();
        Solution.printtriangle();



    }
        class Solution {



            public static void printtriangle (){
                System.out.println("  *  ");
                System.out.println(" * * ");
                System.out.println("*****");
            }

        }


}
