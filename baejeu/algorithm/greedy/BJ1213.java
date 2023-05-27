package baejeu.algorithm.greedy;

// https://www.acmicpc.net/problem/1213
// 팰린드롬 만들기 실버3

import java.io.*;
import java.util.*;
public class BJ1213 { // 최대 50
    public static void main(String[] args) throws IOException { // String builder로 왼쪽 오른쪽 나누기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        Map<Character, Integer> map = new HashMap<>(); // 키 = 알파벳 A~Z  값 = 알파벳 freq
        for (char c = 'A'; c <= 'Z'; c++) {  // A~Z
            map.put(c, 0);  // 키값인 알파벳 집어 넣기
        }

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            map.put(c, map.get(c) + 1); // 문자열 길이만큼 돌면서 해당 알파벳 빈도수 찾기
        }

        // <홀수 문자 찾기 홀수 문자 2개이상이면 만수 출력하기>
        int odd = 0;
        char oddChar = 0;
        for (char c = 'A'; c <= 'Z'; c++) {
            if (map.get(c) % 2 == 1) {
                odd++;
                oddChar = c;
            }
        }

        if (odd > 1) {
            System.out.println("I'm Sorry Hansoo");
        } else {
            StringBuilder left = new StringBuilder(); // 왼쪽
            StringBuilder right = new StringBuilder(); // 오른쪽
            for (char c = 'A'; c <= 'Z'; c++) {
                int repeat = map.get(c) / 2; // 알파벳 개수/2 어차피 짝수
                for (int j = 0; j < repeat; j++) {
                    left.append(c); // 문자열 끝에 문자열 추가
                    right.insert(0, c); // 0인덱스에 c문자열 넣기
                }
            }
            if (odd == 1) {
                System.out.println(left.toString() + oddChar + right.toString());
            } else {
                System.out.println(left.toString() + right.toString());
            }

        }
    }

}
/*
임한수와 임문빈은 서로 사랑하는 사이이다. ????
임한수는 세상에서 팰린드롬인 문자열을 너무 좋아하기 때문에, 둘의 백일을 기념해서 임문빈은 팰린드롬을 선물해주려고 한다. ??
임문빈은 임한수의 영어 이름으로 팰린드롬을 만들려고 하는데, 임한수의 영어 이름의 알파벳 순서를 적절히 바꿔서 팰린드롬을 만들려고 한다.
임문빈을 도와 임한수의 영어 이름을 팰린드롬으로 바꾸는 프로그램을 작성하시오.
 */

// 짝수길이면  모든 요소들이 짝수여야해
// 홀수길이면  모든 요소들이 짝수 딱 1개만 홀수 즉 홀수인 알파벳 2개면 커트
// 알파벳 개수 찾기 map이용하자
// StringBuilder사용해서 팰린드로

