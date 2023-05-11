package kilnam.baekjoon.workbook2;

import java.util.Scanner;

public class Q2167 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();
        int row = sc.nextInt();

        int[][] arr = new int[col][row];

        for (int i =0 ; i < col; i++){
            for(int j =0 ; j< row; j++){
                arr[i][j] = sc.nextInt();
            }
        }
       int T = sc.nextInt();

        for(int k =0 ; k < T;k ++){
            int sum =0;
            int i = sc.nextInt();
            int j = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int r =j-1 ; r<=y-1;r++){
                for(int c =i-1;c<=x-1;c++){
                    sum+=arr[c][r];

                }



            }
            System.out.println(sum);
        }



    }

}
