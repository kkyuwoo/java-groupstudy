package baejeu.baekjoon.groupworkbook;

/*
지능형 기차 2


 */

import java.util.*;

public class Q2460 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] down = new int[10];
        int[] up = new int[10];
        int[] people = new int[10];

        for (int i = 0; i < 10 ; i++) {
            int input;
            input = sc.nextInt();
            down[i] = input;
            input = sc.nextInt();
            up[i] = input;
        }
        people[0] = up[0] - down[0];
        for (int i = 1; i < 10 ; i++) {
            people[i] = up[i] - down[i] +people[i-1];
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 10 ; i++) {
            if (people[i]>max){
                max = people[i];
            }
        }
        System.out.println(max);
    }
}
