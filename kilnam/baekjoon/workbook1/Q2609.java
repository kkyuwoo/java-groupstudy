package kilnam.baekjoon.workbook1;

import java.util.Scanner;

public class Q2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int greatestdivisor =1;
        int first = sc.nextInt();
        int second = sc.nextInt();
        int min= first > second ? second:first;
        for(int i=2; i<=min; i++){
            if(first % i==0 && second % i==0 ){
                greatestdivisor=i;
            }
        }
        System.out.println(greatestdivisor);
        System.out.println(greatestdivisor*first/greatestdivisor*second/greatestdivisor);

    }
}
