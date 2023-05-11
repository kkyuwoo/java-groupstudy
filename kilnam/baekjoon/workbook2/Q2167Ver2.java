package kilnam.baekjoon.workbook2;

import java.util.Arrays;
import java.util.Scanner;

public class Q2167Ver2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();
        int row = sc.nextInt();

        int[][] arr = new int[col][row];
        int[][] preFixSum = new int[col + 1][row + 1];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //초기화 과정
        preFixSum[1][1] = arr[0][0];
        for (int i = 2; i <= col; i++) {
            preFixSum[i][1] = preFixSum[i - 1][1] + arr[i - 1][0];
        }
        for (int j = 2; j <= row; j++) {
            preFixSum[1][j] = preFixSum[1][j - 1] + arr[0][j - 1];
        }

        //누적합 만들기
        for (int i = 2; i <= col; i++) {
            for (int j = 2; j <= row; j++) {
                preFixSum[i][j] = preFixSum[i - 1][j] + preFixSum[i][j - 1] - preFixSum[i - 1][j - 1] + arr[i-1][j-1];

            }
        }

        int T = sc.nextInt();
        for (int n = 0; n < T; n++) {
            int i = sc.nextInt(); //행
            int j = sc.nextInt();//열
            int x = sc.nextInt();//행
            int y = sc.nextInt();//열
            System.out.println(answer(i,j,x,y,preFixSum));


            }


        }

       public static int answer(int i, int j, int x, int y, int[][] preFixSum){


            int ans = preFixSum[x][y] - preFixSum[x][j-1] - preFixSum[i-1][y] + preFixSum[i - 1][j - 1];
            return ans;
        }



    }



