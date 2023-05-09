package baejeu.baekjoon.workbook1;
/*
최대공약수와 최소공배수
두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.
입력
24 18
출력
6
72

최대 공약수?  둘중에 뭐가 작은 숫지인지 비교 둘다 그 숫자 만큼 나눠지는 수 구하기 나눠지는 수 비교해서 max값 찾기
최소 공배수?  두수를 곱하고 최대공약스로 나누면 최소 공배수이다. (구글링)
 */

import java.util.ArrayList;
import java.util.Scanner;
public class Q2609 {
    static int big;
    static int small;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        if (input1 > input2) {
            big = input1;
            small = input2;
        }
        else {
            big = input2;
            small = input1;
        }

        System.out.println(findMaxCommonFactor(big, small)); // 최대 공약수
        System.out.println(findMinCommonMultiple(big, small)); // 최소 공배수
    }
    static int findMaxCommonFactor(int num1 , int num2){ // num1 이 big num2 small

        ArrayList<Integer> list = new ArrayList<>();  // list= 1,2,3,6,18
        for (int i = 1; i <= num2 ; i++) {
            if(num2 % i==0) list.add(i);
        }
        ArrayList<Integer> list2 = new ArrayList<>(); // list2 = 1,2,3,4,6,8,12,24
        for (int i = 1; i <= num1 ; i++) {
            if(num1 % i==0) list2.add(i);
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if( list2.contains(list.get(i)) && list.get(i)> max) max = list.get(i); // list.contains() = boolean 값이다.
        }
        return max;
    }

    static int findMinCommonMultiple(int num1 , int num2){ // num1 이 big num2 small

        return (num1 * num2) / findMaxCommonFactor(num1 , num2) ;
    }
}
