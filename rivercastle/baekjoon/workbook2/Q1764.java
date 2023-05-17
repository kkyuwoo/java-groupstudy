package rivercastle.baekjoon.workbook2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int group1Number = Integer.parseInt(stringTokenizer.nextToken());
        int group2Number = Integer.parseInt(stringTokenizer.nextToken());
        int dataLength = group1Number + group2Number;
        String[] datas = new String[dataLength];
        for (int i = 0; i < dataLength; i++) {
            datas[i] = bufferedReader.readLine();
        }
        for (String data : datas) {
            System.out.println(Arrays.stream(datas).count());
        }
    }
}

