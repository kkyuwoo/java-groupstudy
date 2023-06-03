package rivercastle.baekjoon.kangseong;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Q2161 { //카드1
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int cards = scanner.nextInt();
        Queue<Integer> cardsQueue = new ArrayDeque<>();
        for (int i = 1; i <= cards; i++) {
            cardsQueue.add(i);
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        while (cardsQueue.size() != 1) {
            bufferedWriter.write(cardsQueue.poll() + " ");
            cardsQueue.add(cardsQueue.poll());
        }
        bufferedWriter.write(cardsQueue.poll());
        bufferedWriter.close();
    }
}
