package gyuri.baekjoon.workbook2;

import java.util.*;

public class Q1205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int news = sc.nextInt();
        int p = sc.nextInt();
        Integer[] arr = new Integer[n];
        int result = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        if(n == p && news <= arr[arr.length-1])
            System.out.print(-1);
        else{
            int rank = 1;
            for(int i=0; i<arr.length; i++){
                if(news < arr[i])
                    rank++;
                else
                    break;
            }
            System.out.print(rank);
        }
    }
}
