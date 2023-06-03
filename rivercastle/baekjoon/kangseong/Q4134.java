package rivercastle.baekjoon.kangseong;

import java.io.*;

public class Q4134 {//다음 소수
    public static boolean isPrime(long num) {
        if (num < 2) {
            return false;
        }
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(bufferedReader.readLine());

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < tests; i++){
            long longNumber = Long.parseLong(bufferedReader.readLine());
            boolean end = false;
            for (long j = longNumber; j < Long.MAX_VALUE; j++) {
                if (isPrime(j)) {
                    bufferedWriter.write(j + "\n");
                    break;
                }
            }
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
