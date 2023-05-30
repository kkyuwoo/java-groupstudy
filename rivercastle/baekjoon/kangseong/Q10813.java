package rivercastle.baekjoon.kangseong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int[] buckets = new int[Integer.parseInt(stringTokenizer.nextToken())]; //N
        int testTime = Integer.parseInt(stringTokenizer.nextToken()); //M

        for (int i = 1; i <= buckets.length; i++) {
            buckets[i-1] = i;
        }

        for (int i = 0; i < testTime; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int first = Integer.parseInt(stringTokenizer.nextToken()) - 1;
            int second = Integer.parseInt(stringTokenizer.nextToken()) - 1;
            int temp = buckets[first];

            buckets[first] = buckets[second];
            buckets[second] = temp;
        }

        for (int i = 0; i < buckets.length; i++) {
            System.out.printf("%d ", buckets[i]);
        }
    }
}
