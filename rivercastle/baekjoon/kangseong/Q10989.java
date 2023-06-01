package rivercastle.baekjoon.kangseong;

import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q10989 { //수 정렬하기 3 메모리초과 https://www.acmicpc.net/problem/10989
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numsLength = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer;



        for (int i = 0; i < numsLength; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            integerPriorityQueue.add(Integer.parseInt(stringTokenizer.nextToken()));
        }
        bufferedReader.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < numsLength; i++) {
            bufferedWriter.write(integerPriorityQueue.poll() + "\n");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
