package rivercastle.baekjoon.kangseong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q25206 {//너의 평점은
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String gradeData = bufferedReader.readLine();
        double sum = 0.0;
        int cnt = 0;
        for (int i = 0; i < 20; i++) {
            String[] dataArr = gradeData.split(" ");
            double credit = Double.parseDouble(dataArr[1]);

            if (dataArr[2].equals("A+")) {
                sum += 4.5 * credit;
                cnt += credit;
            } else if (dataArr[2].equals("A0")) {
                sum += 4.0 * credit;
                cnt += credit;
            } else if (dataArr[2].equals("B+")) {
                sum += 3.5 * credit;
                cnt += credit;
            } else if (dataArr[2].equals("B0")) {
                sum += 3.0 * credit;
                cnt += credit;
            } else if (dataArr[2].equals("C+")) {
                sum += 2.5 * credit;
                cnt += credit;
            } else if (dataArr[2].equals("C0")) {
                sum += 2.0 * credit;
                cnt += credit;
            } else if (dataArr[2].equals("D+")) {
                sum += 1.5 * credit;
                cnt += credit;
            } else if (dataArr[2].equals("D0")) {
                sum += 1.0 * credit;
                cnt += credit;
            } else if (dataArr[2].equals("F")) {
                cnt += credit;
            }
            gradeData = bufferedReader.readLine();
        }
        bufferedReader.close();
        System.out.println(sum / cnt);
    }
}
