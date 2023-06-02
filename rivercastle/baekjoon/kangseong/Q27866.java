package rivercastle.baekjoon.kangseong;

import java.io.*;

public class Q27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String word = bufferedReader.readLine();

        int order = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        bufferedWriter.write(word.charAt(order - 1));

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
