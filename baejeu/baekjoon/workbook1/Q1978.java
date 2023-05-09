package baejeu.baekjoon.workbook1;
/*
소수 찾기
주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        boolean flag;
        int cnt = 0;
        String[] inputnum = br.readLine().split(" ");
            for (int j = 0; j < input; j++) {
                int num = Integer.parseInt(inputnum[j]);
                if (num<2){
                    continue;
                }
                flag = findPrimeNumber(num);
                if (flag == true) {
                    cnt++;
                }
            }
        System.out.println(cnt);
        }
    public static boolean findPrimeNumber (int num){
        for (int i = 2; i <= Math.sqrt(num); i++) { //제곱근 으로 범위 줄이기
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
/*
메인 메소드에서 if (num < 2) { 코드가 있는 이유는 만약 0이나 1이 findPrimeNumber 에서  돌아가면 0%2 같은 연산 오류를 발생시켜서 이다.

 */
