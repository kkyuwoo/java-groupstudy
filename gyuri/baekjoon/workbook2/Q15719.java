package gyuri.baekjoon.workbook2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q15719 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        long num = Integer.parseInt(bf.readLine());
        long target = (num - 1) * (num) / 2;
        long sum = 0;
        stringTokenizer = new StringTokenizer(bf.readLine());
        for (int i = 0; i < num; i++) {

            sum+=Integer.parseInt(stringTokenizer.nextToken());
        }
        System.out.println(sum-target);
    }
}
