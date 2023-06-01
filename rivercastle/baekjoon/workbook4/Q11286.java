package rivercastle.baekjoon.workbook4;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> absQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1) > Math.abs(o2)) {
                    return 1;
                } else if (Math.abs(o1) == Math.abs(o2)) {
                    return o1 - o2;
                } else {
                    return -1;
                }
            }
        });

        int time = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < time; i++) {
            int num = Integer.parseInt(bufferedReader.readLine());
            if (num == 0) {
                if (absQueue.size() == 0) {
                    bufferedWriter.write(0);
                } else {
                    bufferedWriter.write(absQueue.poll());
                }
            } else {
                absQueue.add(num);
            }
        }

        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
