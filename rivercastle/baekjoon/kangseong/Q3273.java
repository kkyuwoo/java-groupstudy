package rivercastle.baekjoon.kangseong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3273 {//두 수의 합
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int arrLength = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int target = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();

        int[] numArr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            numArr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int cnt = 0;

        for (int i = 0; i < arrLength; i++) {
            for (int j = i; j < arrLength; j++) {
                if (numArr[i] + numArr[j] == target) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
