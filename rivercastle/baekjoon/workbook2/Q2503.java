package rivercastle.baekjoon.workbook2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2503 {

    public int getHundNum(int num) {
        return num / 100;
    }
    public int getTenNum(int num) {
        return num / 10 % 10;
    }
    public int getOneNum (int num) {
        return num % 10;
    }
    public static void main(String[] args) throws IOException {
        Q2503 q2503 = new Q2503();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        int questionsNumber = Integer.parseInt(bufferedReader.readLine());
        int[][] questions = new int[questionsNumber][3];
        for (int i = 0; i < questionsNumber; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < 3; j++) {
                questions[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        //1자리
    }
}
