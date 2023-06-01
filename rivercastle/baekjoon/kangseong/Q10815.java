package rivercastle.baekjoon.kangseong;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q10815 { //숫자카드
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int cardsLength = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        HashMap<Integer, Boolean> hashMap = new HashMap<>(cardsLength);

        for (int i = 0; i < cardsLength; i++) {
            hashMap.put(Integer.parseInt(stringTokenizer.nextToken()), true);
        }

        int testLength = Integer.parseInt(bufferedReader.readLine());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine()); //tests
        bufferedReader.close();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < testLength; i++) {
            if (hashMap.containsKey(Integer.parseInt(stringTokenizer.nextToken()))) {
                bufferedWriter.write(1 + "\n");
            } else {
                bufferedWriter.write(0 + "\n");
            }
        }

        bufferedWriter.flush();
        bufferedWriter.close();

    }
}
