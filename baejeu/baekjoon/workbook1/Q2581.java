package baejeu.baekjoon.workbook1;
/*
소수
 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.*;
public class Q2581 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine()); // 구간 받기
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = M; i <= N; i++) {  // M~N 이상 이하 ㅇㅇ..
            if (findPrime(i)) list.add(i); // 소수면 리스트에 추가하기
        }
        if (list.size() == 0) {
            System.out.println(-1);
        }
        else {
            // System.out.println(list); // 리스트 출력
            // 리스트에 있는 값 모두 더하기
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum = sum + list.get(i);
            }
            System.out.println(sum);
            // 최솟값 찾기
            int min = Collections.min(list);
            System.out.println(min);
        }
    }
    static  boolean findPrime(int num) { // 소수 구하는 메소드
        if (num < 2) {
            return false;
        } else if (num == 2) return true;

        else {
            int cnt = 0;
            for (int i = 2; i <=num; i++) { //
                if (num % i == 0) {
                    cnt++;
                }
                if (cnt>1){
                    return false;
                }
            }
            return true;
        }
    }
}
// 0 10 이면  2 3 5 7