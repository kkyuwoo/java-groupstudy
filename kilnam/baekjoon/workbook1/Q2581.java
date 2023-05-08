package kilnam.baekjoon.workbook1;

import java.util.Scanner;

public class Q2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        boolean flag;
        int sum = 0;
        int tmp = 0;
        int cnt=0;





        for (int i = min; i <= max; i++) {
            flag = false;
            if (i ==1){
                continue;
            }

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    //System.out.printf("%d %d\n",i,j);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                sum += i;



                if (cnt== 0) {
                    tmp = i;
                    cnt++;
                }
            }


        }
        if (sum == 0 ) {
            System.out.println(-1);
        }
        if ( sum !=0){
            System.out.println(sum);
            System.out.println(tmp);
        }


        }
    }

