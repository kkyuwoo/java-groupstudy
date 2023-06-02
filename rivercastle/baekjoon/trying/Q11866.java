package rivercastle.baekjoon.trying;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Q11866 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        int period = scanner.nextInt();

        Queue queue = new ArrayDeque();
        for (int i = 1; i <= people; i++) {
            queue.add(i);
        }
        int[] answer = new int[people];
        int idx = 0;
        while (!queue.isEmpty()) {
            for (int i = 1; i < period; i++) {
                queue.add(queue.poll());
            }
            answer[idx++] = (int) queue.poll();
        }
        System.out.print("<");
        for (int person : answer) {
            System.out.printf("%d, ",person);
        }
        System.out.print("\b\b>");
    }
}
