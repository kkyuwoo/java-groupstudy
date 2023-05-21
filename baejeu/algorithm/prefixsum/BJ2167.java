package baejeu.algorithm.prefixsum;

// https://www.acmicpc.net/problem/2167
// 2차원 배열의 합
// 2차원 배열이 주어졌을 때 (i, j) 위치부터 (x, y) 위치까지에 저장되어 있는 수들의 합을 구하는 프로그램을 작성하시오. 배열의 (i, j) 위치는 i행 j열을 나타낸다.


import java.util.Scanner;
public class BJ2167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(); // 행
        int column = sc.nextInt(); // 열

        int[][] arr = new int[row][column]; // 배열에 값 넣기
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < column ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] prefixsum = makePrefixSum(arr, row, column);

        int test = sc.nextInt(); // 테스트 케이스 개수

        for (int k = 0; k < test ; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(findAnswer(prefixsum, i, j, x, y));
        }
    }
    public static int [][] makePrefixSum(int[][] arr, int row ,int column){
        int [][] prefixsum =  new int[row+1][column+1];

        for (int i = 1; i < row + 1 ; i++) { // 행에서의 누적합
            for (int j = 1; j < column + 1 ; j++) {
                prefixsum[i][j] = prefixsum[i][j-1] + arr[i-1][j-1];
            }
        }
        for (int i = 2; i < row + 1; i++) { // prefixSum 완성
            for (int j = 1; j < column +1 ; j++) {
                prefixsum[i][j] = prefixsum[i][j] + prefixsum[i-1][j];
            }
        }
        return prefixsum;
    }

    public static int findAnswer(int[][] prefixsum, int i, int j, int x, int y){
        int answer = 0;
        answer =prefixsum[x][y] + prefixsum[i-1][j-1] - prefixsum[x][j-1]- prefixsum[i-1][y];

        return answer;
    }

}
