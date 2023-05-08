package kilnam.baekjoon.workbook1;

import java.util.Scanner;

public class Q1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt =0;
        for(int i= 0;i<num;i++){
            boolean flag = false;
            int input = sc.nextInt();
            if(input ==1) continue;
            for(int j =2 ; j < input; j++){
                if(input % j == 0){
                    flag = true;
                    break;
                }
            } if(!flag) cnt++;
        }
        System.out.println(cnt);
    }
}
