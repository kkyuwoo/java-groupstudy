package baejeu.algorithm.prefixsum;

// https://www.acmicpc.net/problem/11660
// 구간 합 구하기 5

import java.util.Scanner;
import java.util.Arrays;
public class BJ11660 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 표의 크기 N
        int M = sc.nextInt(); // 구해야 하는 횟수 M

        int [][] arr = new int[N][N];
        for (int i = 0; i < N ; i++) {  // 배열에 값 넣기
            for (int j = 0; j < N ; j++) {
                arr[i][j] = sc.nextInt();;
            }
        }
        int [][] prefixsum = makePrefixSum(arr , N);
        System.out.println(Arrays.deepToString(prefixsum));
        for (int i = 0; i < M ; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            System.out.println(findAnswer(x1,x2,y1,y2, prefixsum));
        }
    }
    public static int [][] makePrefixSum (int [][] arr, int N){
        int [][] prefixsum = new int[N+1][N+1];
        for (int i = 1; i < N + 1 ; i++) { // 행에서의 누적합
            for (int j = 1; j < N+1 ; j++) {
                prefixsum[i][j] = prefixsum[i][j-1] + arr[i-1][j-1];
            }
        }
        for (int i = 1; i < N+1 ; i++) { // 열에서의 누적합
            for (int j = 1; j < N+1; j++) {
                prefixsum[i][j] = prefixsum[i][j] + prefixsum[i-1][j];
            }
        }
        return prefixsum;
    }
    public static int findAnswer (int x1, int x2, int y1, int y2 , int[][] prefixsum){
        int answer = 0;
        answer = prefixsum[y1][y2] + prefixsum[x1-1][x2-1]- prefixsum[x1-1][y2]-prefixsum[y1][x2-1];

        return answer;
    }
}
