package gyuri.baekjoon.workbook1;

import java.util.Scanner;

public class Q3460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            int n = sc.nextInt();
            String nb = Integer.toBinaryString(n);
            String reversenb = "";
            for (int k = nb.length()-1; k >= 0; k--) {
                reversenb = reversenb + nb.charAt(k);
            }
            for(int j = 0; j < nb.length(); j++) {
                if (reversenb.charAt(j) == '1') {
                    System.out.print(j + " ");
                }
            }
        }
    }
}
