package rivercastle.baekjoon.trying;

import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Q1181 { //단어 정렬 미해결
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int wordsNum = Integer.parseInt(bufferedReader.readLine());
        PriorityQueue<String> wordsPriorityQueue = new PriorityQueue<>();
        for (int i = 0; i < wordsNum; i++) {
            wordsPriorityQueue.add(bufferedReader.readLine());
        }
        bufferedReader.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < wordsNum; i++) {
            bufferedWriter.write(wordsPriorityQueue.poll() + "\n");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
