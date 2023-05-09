package baejeu.baekjoon.workbook1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
동호는 내년에 초등학교를 입학한다. 그래서 동호 어머니는 수학 선행 학습을 위해 쉽게 푸는 문제를 동호에게 주었다.

이 문제는 다음과 같다. 1을 한 번, 2를 두 번, 3을 세 번, 이런 식으로 1 2 2 3 3 3 4 4 4 4 5 .. 이러한 수열을 만들고 어느 일정한 구간을 주면 그 구간의 합을 구하는 것이다.

하지만 동호는 현재 더 어려운 문제를 푸느라 바쁘기에 우리가 동호를 도와주자. ?ㅋㅋ
첫째 줄에 구간의 시작과 끝을 나타내는 정수 A, B(1 ≤ A ≤ B ≤ 1,000)가 주어진다. 즉, 수열에서 A번째 숫자부터 B번째 숫자까지 합을 구하면 된다.
3+4+5+6+7=
3 7 = 15 3 8 19 3 10 = 27
 */
public class Q1292 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 수열 만들기
        //  1 2 2 3 3 3 4 4 4 4 ...  구간 3~7 더하기는 15이다.
        int [] array = new int[1001];  // A, B(1 ≤ A ≤ B ≤ 1,000)
        array [0] = 0; // 구간 맞추기
        int idx = 1; // 인덱스 값
        for (int i = 1; i < array.length ; i++) {  // 1 <= i <= 1000
            for (int j = 0; j < i ; j++) {
                array[idx] = i;
                idx++;
                if (idx == 1000){
                    break;
                }
            }
            if (idx == 1000){
                break;
            }
        }
        // 구간
        String []input = br.readLine().split(" ");
        int input1= Integer.parseInt(input[0]);
        int input2= Integer.parseInt(input[1]);
        br.close();

        int sum = 0;
        for (int i = input1; i <= input2 ; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);

    }
}
