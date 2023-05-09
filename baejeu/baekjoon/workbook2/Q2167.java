package baejeu.baekjoon.workbook2;


import java.util.Scanner;
public class Q2167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int RowSize = sc.nextInt(); // 행크기
        int ColumnSize = sc.nextInt(); // 열크기

        int [][] Array = new int[RowSize][ColumnSize]; // 2차원 배열 생성  첫째 줄 해결 완료
        for (int i = 0; i < RowSize ; i++) {
            for (int j = 0; j < ColumnSize ; j++) {
                Array[i][j] = sc.nextInt();            // 값 넣기
            }
        }

        int k = sc.nextInt(); // 합을 구할 부분의 개수 k

        for (int cnt = 0; cnt < k ; cnt++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            //System.out.printf("i = %d j = %d x = %d y = %d", i,j,x,y);
            int sum =Printsum(i, j, x, y, Array);
            System.out.println(sum);
        }
    }

    public static int Printsum (int i, int j, int x, int y, int[][]Array ){
        int sum = 0;

        for (int k = i-1; k <= x-1 ; k++) {
            for (int l = j-1; l <= y-1 ; l++) {
                sum = sum+ Array[k][l];
            }
        }


        return sum;
    }

}

/*
경우의 수 생각해보기 직사각형 출력이다.

1) i와 x는 다르지만 j와 y가 같은경우 가로 1 세로가 n 인 직사각형
2) (1,2) 부터 (2,3)이면 4개짜리 행보다 열에 포커스 맞추는게 중요하다.


 */
