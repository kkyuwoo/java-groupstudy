package baejeu.baekjoon.groupworkbook;
/*
일곱 난쟁이

아홉 개의 줄에 걸쳐 난쟁이들의 키가 주어진다. 주어지는 키는 100을 넘지 않는 자연수이며, 아홉 난쟁이의 키는 모두 다르며, 가능한 정답이 여러 가지인 경우에는 아무거나 출력한다.

Random 클래스 사용해서 indax 0~10 사이에 중복 없이 7번 출력해서 합이 100이면
그 값들 오름차순으로 출력

 */
import java.util.Arrays;
import java.util.Random;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Q2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dwarf9 = new int[9];
        for (int i = 0; i < 9; i++) {
            dwarf9[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        int[] answer = new int[7];
        while (true) {
            int[] numbers = new int[7];
            Random random = new Random();
            for (int i = 0; i < 7; i++) {
                int randomNumber;
                do {
                    randomNumber = random.nextInt(9); // 0부터 9까지의 랜덤한 정수
                } while (contains(numbers, randomNumber)); // 중복이 있는지 검사하는 메소드
                numbers[i] = randomNumber;
            }

            int sum = 0;
            for (int i = 0; i < 7; i++) {
                sum = sum + dwarf9[numbers[i]];
                answer[i] = dwarf9[numbers[i]];
            }

            if (sum == 100) {
                Arrays.sort(answer);
                break;
            }
        }

        for (int i = 0; i < answer.length ; i++) {
            System.out.println(answer[i]);
        }
    }

    public static boolean contains (int[] numbers, int randomNumber) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == randomNumber) return true;
        }
        return false;
    }
}

