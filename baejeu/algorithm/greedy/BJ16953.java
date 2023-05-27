package baejeu.algorithm.greedy;

// A → B
// https://www.acmicpc.net/problem/16953
// 실버2
// 첫째 줄에 A, B (1 ≤ A < B ≤ 109)가 주어진다.
import java.util.*;
public class BJ16953 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong(); // B-> A로 만들기
        int cnt = 0;
        boolean flag = true;
        while (B != A){
            if (B < A) {
                flag = false;
                break;
            }
            String strB = String.valueOf(B);
            if (strB.charAt(strB.length() - 1) !='1' && B%2 != 0) {  //  3,5,7,9 거르기
                flag = false;
                break;
            }
            if (B%2== 0){
                B = B / 2;
                cnt++;
            }
            else if(B%10==1) { // 1인 경우
                strB = strB.substring(0,strB.length()-1);
                B = Long.parseLong(strB);
                cnt++;
            }
        }
        if (flag) System.out.println(cnt+1);
        else System.out.println(-1);
    }
}
/*
그래프 이론
그리디 알고리즘
그래프 탐색
너비 우선 탐색
 */
