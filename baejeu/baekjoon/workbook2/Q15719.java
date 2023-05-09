package baejeu.baekjoon.workbook2;
/*

10
1 2 2 5 6 4 3 7 8 9
중복된 숫자 출력

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Q15719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        long realSum = (input) * (input-1) / 2;  // 1~n-1까지(n-1)포함 더하는 값

        StringTokenizer st = new StringTokenizer(br.readLine());

        long sum =0;
        for (int i = 0; i < input ; i++) {
            sum += Long.parseLong(st.nextToken());
        }

        long answer = sum - realSum;
        System.out.println(answer);

    }
}
/*
1)배열에 넣어서 정렬해서 중복된 숫자 찾기 = 메모리 초과
2)Hashset 에 숫자 받으면 바로 넣어서 만약 Hashset의 크기가 숫자를 받았는데도 커지지 않으면 그 숫자 (Hashset은 정렬x 중복숫자 x) 출력 = 메모리 초과
3)음.. 수열의 크기가 10(1~9)이면 45인데 현재는 47 47-45 = 2 이런식으로 더하고 빼서 풀기 // 시간 초과
4) 3) BuffereReader로 변환해서 풀면 메모리 초과
 public class Q15719 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int sum1 =0;
        for (int i = 1; i < input ; i++) {
            sum1 = sum1+ i;
        }
        int sum2 =0;
        for (int i = 0; i < input ; i++) {
            sum2 = sum2 + sc.nextInt();
        }
        System.out.println(sum2-sum1);

    }
}
5) 2) 버퍼리더로 해도 메모리 초과
6) 3)을 등차수열의 합을 통해 풀어보기
1~n 까지 더하는 등차수열의 합 공식 n*(n-1) /2
1~10  10*9/2 = 45


 */
