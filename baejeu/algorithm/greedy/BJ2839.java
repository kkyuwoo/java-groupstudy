package baejeu.algorithm.greedy;

// https://www.acmicpc.net/problem/2839
// 설탕 배달 실버 IV
import java.util.*;
public class BJ2839 {
    public static void main(String[] args) {
        // N킬로그램의 설탕봉지 3 / 5 나누기
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        while(N>2){
            if(N % 5 == 0){
                int cnt5 = N / 5;
                cnt = cnt+ cnt5;
                N = 0;
                break;
            }
            else{
                N = N-3;
                cnt++;
            }
        }
        if( N==0) System.out.println(cnt);
        else System.out.println(-1);

        /*
         1. 나머지가 없는게 첫번째 목표 2. 최소한의 설탕봉지로 담기
         */
    }
}
