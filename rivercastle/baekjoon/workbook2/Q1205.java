package rivercastle.baekjoon.workbook2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1205 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int scores = Integer.parseInt(stringTokenizer.nextToken());
        int taesooScore = Integer.parseInt(stringTokenizer.nextToken());
        int prized = Integer.parseInt(stringTokenizer.nextToken());
        //데이터 입력받기

        int ranking = 1;
        int sameScore = 0;
        if (scores != 0) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int i = 0; i < scores; i++) {
                int score = Integer.parseInt(stringTokenizer.nextToken());
                if (taesooScore <= score) {
                    ranking++;
                }
                if (taesooScore == score) {
                    sameScore++;
                }
            }
            if (prized >= ranking) {
                System.out.println(ranking - sameScore);
            } else {
                System.out.println(-1);
            }

        } else {
            System.out.println(1);
        }
    }
}