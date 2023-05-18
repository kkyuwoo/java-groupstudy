package rivercastle.baekjoon.workbook2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        int factorsNumber = Integer.parseInt(bufferedReader.readLine()); // 약수의 개수
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int firstNum = Integer.parseInt(stringTokenizer.nextToken()); // 첫 번째 약수14
        int max = firstNum; //14
        int min = firstNum; //14
        //14 26456 2 28 13228 3307 7 23149 8 6614 46298 56 4 92596


        for (int i = 1; i < factorsNumber; i++) { //약수의 개수 - 1만큼 반복
            int num = Integer.parseInt(stringTokenizer.nextToken());
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min * max);
    }
}

