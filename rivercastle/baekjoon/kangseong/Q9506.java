package rivercastle.baekjoon.kangseong;

import java.io.*;

public class Q9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(bufferedReader.readLine());

        while (2 < num && num < 100000) {
            String answer = "" + num;
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }

            if (num == sum) {
                answer += " = ";
                for (int i = 1; i < num; i++) {
                    if (num % i == 0) {
                        answer += i + " + ";
                    }
                }
                answer += "\b\b\b\n";

            } else {
                answer += " is NOT perfect.\n";
            }

            bufferedWriter.write(answer);
            num = Integer.parseInt(bufferedReader.readLine());
        }

        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();

    }
}
