package kilnam.baekjoon.workbook1;

import java.util.Scanner;

public class Q1292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum =0;
        int check =0;
        for(int i =1 ;i<=num2;i++){
            int cnt =0;
            for(int j = i ; cnt++ <i; j=i ){
                check ++;
                if(num1<=check && check <= num2){
                    sum+=j;
                }
            }
        }
        System.out.println(sum);
    }
}