package rivercastle.baekjoon.kangseong;

import java.io.*;
import java.util.StringTokenizer;

public class Q1934 {//최소공배수
    public static int getGDC(int num1, int num2) {

        int gdc = 1;
        for (int j = 1; j <= num1; j++) {
            if (num1 % j == 0 && num2 % j == 0) {
                if (j > gdc) {
                    gdc = j;
                }
            }
        }
        return gdc;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer;

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < tests; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int numberA = Integer.parseInt(stringTokenizer.nextToken());
            int numberB = Integer.parseInt(stringTokenizer.nextToken());
            int gdc = getGDC(numberA, numberB);
            bufferedWriter.write(numberA / gdc * numberB /gdc * gdc + "\n");
        }

        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();


    }
}

