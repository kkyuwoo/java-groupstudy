package baejeu.baekjoon.workbook1;

/*
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.

입력                             출력

5                               7 35
20 10 35 30 7

 */

import java.util.*;

public class Q10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] array = new int[N];
        for (int i = 0; i < N ; i++) {
            int input = sc.nextInt();
            array[i] = input;
        }
        PrintMin(array);
        PrintMax(array);
    }
    public static void PrintMax(int[] array){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length ; i++) {
            if (array[i]>max){
                max = array[i];
            }
        }
        System.out.printf("%d ", max);
    }
    public static void PrintMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length ; i++) {
            if (array[i]<min){
                min = array[i];
            }
        }
        System.out.printf("%d ", min);
    }
}
