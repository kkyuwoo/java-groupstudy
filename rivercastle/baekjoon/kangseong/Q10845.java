package rivercastle.baekjoon.kangseong;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q10845 {//큐 미해결
    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new ArrayDeque<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int ordersNum = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer;
        for (int i = 0; i < ordersNum; i++) {
            String order = bufferedReader.readLine();
            if (order.equals("front")) {
                if (queue.isEmpty()) {
                    bufferedWriter.write(-1 + "\n");
                } else {
                    bufferedWriter.write(queue.element());
                }
            } else if (order.equals("back")) {
                if (queue.isEmpty()) {
                    bufferedWriter.write(-1 + "\n");
                } else {
                    bufferedWriter.write(queue.peek() + "\n");
                }
            } else if (order.equals("size")) {
                bufferedWriter.write(queue.size() + "\n");
            } else if (order.equals("empty")) {
                bufferedWriter.write((queue.isEmpty() ? 1 : 0) + "\n");
            } else if (order.equals("pop")) {
                if (queue.isEmpty()) {
                    bufferedWriter.write(-1 + "\n");
                } else {
                    bufferedWriter.write(queue.poll() + "\n");
                }
            } else {
                String[] pushOrder = order.split(" ");
                queue.add(Integer.parseInt(pushOrder[1]));
            }
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
