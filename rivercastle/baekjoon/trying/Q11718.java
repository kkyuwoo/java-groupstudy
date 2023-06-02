package rivercastle.baekjoon.trying;

import java.io.*;

public class Q11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
         BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        while ((str = bufferedReader.readLine()) != null) {
            bufferedWriter.write(str);
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
