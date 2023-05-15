package rivercastle.baekjoon.workbook2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15719Fast {

    public long sumToNMinus1(int givenNumber) {
        long sum = 0;
        for (int i = 1; i < givenNumber; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        Q15719Fast q15719Fast = new Q15719Fast();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;

        int givenNumber = Integer.parseInt(bufferedReader.readLine());
        long sumToMinus1 = q15719Fast.sumToNMinus1(givenNumber);

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        long sum = 0;

        for (int i = 0; i < givenNumber; i++) {
            sum += Integer.parseInt(stringTokenizer.nextToken());
        }

        System.out.println(sum - sumToMinus1);
        bufferedReader.close();
    }
}

