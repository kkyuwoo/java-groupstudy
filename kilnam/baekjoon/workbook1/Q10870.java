package kilnam.baekjoon.workbook1;

import java.util.Scanner;

public class Q10870 {

    public static int pivo(int n){
        if (n==0 || n ==1){
            return n;
        }
        else{
            return pivo(n-1)+pivo(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(pivo(sc.nextInt()));

    }
}
