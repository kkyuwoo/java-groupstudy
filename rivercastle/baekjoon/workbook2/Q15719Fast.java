package rivercastle.baekjoon.workbook2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15719Fast {
    public long sumOfArr(String line, int num) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        stringTokenizer = new StringTokenizer(line);
        long sum = 0;
        for (int i = 0; i < num; i++) {
            sum += Integer.parseInt(stringTokenizer.nextToken());
        }
        return sum;
    }

    public long sumOfUntilN(int number) {
        return (long) (number * (number - 1)) / 2;
    }

    public static void main(String[] args) throws IOException {
        Q15719Fast q15719Fast = new Q15719Fast();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        int num = Integer.parseInt(bf.readLine());
        long target = q15719Fast.sumOfUntilN(num); // n-1 까지의 합
        System.out.println(q15719Fast.sumOfArr(bf.readLine(), num) - target);
        bf.close();
    }
}