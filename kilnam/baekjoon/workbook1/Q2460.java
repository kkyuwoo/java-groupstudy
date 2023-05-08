package kilnam.baekjoon.workbook1;

import java.util.Scanner;

public class Q2460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max =0;
        int person =0;
        for(int i =0 ; i<10;i++){
            int exit = sc.nextInt();
            int enter = sc.nextInt();
            person += enter;
            person -= exit;
            if(max<person){
                max =person;
            }

        }
        System.out.println(max);
    }
}
