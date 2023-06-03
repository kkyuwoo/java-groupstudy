package rivercastle.baekjoon.kangseong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Q11004 {//K번째 수
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int arrLength = Integer.parseInt(stringTokenizer.nextToken());
        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>(arrLength);
        int targetK = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < arrLength; i ++) {
            integerPriorityQueue.add(Integer.parseInt(stringTokenizer.nextToken()));
        }

        for (int i = 0; i < targetK - 1; i++) {
            integerPriorityQueue.poll();
        }

        System.out.println(integerPriorityQueue.poll());
    }
}
