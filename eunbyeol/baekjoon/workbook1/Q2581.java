package eunbyeol.baekjoon.workbook1;

import java.util.Scanner;

public class Q2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int min = -1;

        boolean isPrime = true;
        int sum = 0;

        for(int i = start; i <= end; i++){
            if(i == 1) continue;

            for(int j = 2; j <= i / 2 ; j++){
                //소수가 아닐 때
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            //소수들의 합
            if(isPrime){
                sum += i;
                // 소수들 중 최솟값 구하기
                if(min == -1) min = i;

            }
        }

        if(sum == 0){
            System.out.println("-1");
        }else{
            System.out.println(sum);
            System.out.println(min);
        }

    }
}
