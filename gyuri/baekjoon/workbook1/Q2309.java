package gyuri.baekjoon.workbook1;

import java.util.Arrays;
import java.util.Scanner;

public class Q2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int[] result = new int[9];
        for(int i=0; i<9; i++) {
            arr[i] = sc.nextInt();
        }
        int fake1Index = -1;
        int fake2Index = -1;
        int sum = 0;
        for(int i=0; i<9; i++) {
            sum += arr[i];
        }
        for(int i=0; i<8; i++) {
            for(int j=i+1; j<9; j++) {
                if(sum - (arr[i] + arr[j]) == 100) {
                    fake1Index = i;
                    fake2Index = j;
                    break;
                }
            }
        }
        for(int i=0; i<9; i++) {
            if (i == fake1Index || i == fake2Index) {
                continue;
            } else {
                result[i] = arr[i];
            }
        }
        Arrays.sort(result);
        for(int i=2; i<9; i++) {
            System.out.println(result[i]);
        }
    }
}
