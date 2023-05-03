package baejeu.baekjoon.groupworkbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Q2309HelpByChatgpt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dwarf9 = new int[9];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < 9; i++) {
            dwarf9[i] = Integer.parseInt(input[i]);
        }
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
    public static boolean contains ( int[] numbers, int randomNumber ){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == randomNumber) return true;
        }
        return false;
    }
}
