package rivercastle.baekjoon.kangseong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int[] buckets = new int[Integer.parseInt(stringTokenizer.nextToken())]; //N
        int testTime = Integer.parseInt(stringTokenizer.nextToken()); //M

        for (int i = 0; i < testTime; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int start = Integer.parseInt(stringTokenizer.nextToken()) - 1;
            int end = Integer.parseInt(stringTokenizer.nextToken());
            int num = Integer.parseInt(stringTokenizer.nextToken());

            for (int j = start; j < end; j++) {
                buckets[j] = num;
            }
        }
        for (int ball : buckets) {
            System.out.printf("%d ", ball);
        }
    }
}
