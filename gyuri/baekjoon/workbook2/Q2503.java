package gyuri.baekjoon.workbook2;

import java.util.Scanner;

public class Q2503 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 질문 개수

        int[][] question = new int[n][3]; //세 자리 수, 스트라이크 수, 볼 수
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                question[i][j] =sc.nextInt();
            }
        }

        int result = 0; //결과

        for(int i = 123; i <= 987; i++) {
            int[] digits = new int[3]; //i 자릿수
            digits[0] = i / 100;
            digits[1] = (i/10) % 10;
            digits[2] = i % 10;
            if (digits[1] == 0 || digits[2] == 0 || digits[0] == digits[1] || digits[0] == digits[2] || digits[1] == digits[2]) { //중복된 숫자가 있거나 0인 경우 제거
                continue;
            }

            boolean isPossible = true; //i가 결과가 될 수 있는지

            for (int j = 0; j < n; j++) {
                int[] q = question[j];
                int number = q[0]; //세 자리 수
                int strike = q[1]; //스트라이크 수
                int ball = q[2]; //볼 수

                int[] qdigits = new int[3]; //민혁이가 질문한 수의 자릿수
                qdigits[0] = number / 100;
                qdigits[1] = (number / 10) % 10;
                qdigits[2] = number % 10;

                int currentS = 0; //i의 strike
                int currentB = 0; //i의 ball

                for (int k = 0; k < 3; k++) { //자릿수 비교
                    if(digits[k] == qdigits[k]) { //i의 자릿수와 민혁이가 질문한 수의 자릿수가 같으면
                        currentS++; //i strike++
                    } else if (digits[k] == qdigits[(k+1) % 3] || digits[k] == qdigits[(k+2) % 3]) { //i의 자릿수와 민혁이가 질문한 수의 자릿수가 다르면
                        currentB++; //i ball++
                    }
                }
                if (currentS != strike || currentB != ball) { //i의 strike, ball과 영수가 말한 strike, ball과 다르면
                    isPossible = false;
                    break;
                }
            }
            if (isPossible) {
                result++;
            }
        }
        System.out.println(result);
    }
}
