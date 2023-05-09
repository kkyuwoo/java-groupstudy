package baejeu.baekjoon.workbook1;
/*
약수 구하기
6을 예로 들면

6 ÷ 1 = 6 … 0
6 ÷ 2 = 3 … 0
6 ÷ 3 = 2 … 0
6 ÷ 4 = 1 … 2
6 ÷ 5 = 1 … 1
6 ÷ 6 = 1 … 0

두 개의 자연수 N과 K가 주어졌을 때, N의 약수들 중 K번째로 작은 수를 출력하는 프로그램을 작성하시오.
 */

import java.util.*;
public class Q2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();
        int output;
        output = makemeasure(N , K);
        System.out.println(output);

    }
    public static int makemeasure(int num, int num2){  // 약수 구하는 메소드
        ArrayList<Integer> mesure = new ArrayList<>();
        int cnt = 1;
        while(num>=cnt){
            if(num%cnt==0){
                mesure.add(cnt);
            }
            cnt++;
        }

        int answer;
        if(mesure.size()>=num2){
             answer = mesure.get(num2-1);
        }
        else answer = 0;

        return answer;
    }
}
