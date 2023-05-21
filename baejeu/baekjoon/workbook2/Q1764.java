package baejeu.baekjoon.workbook2;

// https://www.acmicpc.net/problem/1764
// 김진영이 듣도 못한 사람의 명단과, 보도 못한 사람의 명단이 주어질 때, 듣도 보도 못한 사람의 명단을 구하는 프로그램을 작성하시오. ㅋㅋ
/*
입력 첫째 줄에 듣도 못한 사람의 수 N, 보도 못한 사람의 수 N
     둘째 줄에는 N개의 줄에 걸쳐 듣도 못한 사람의 이름과 N+2 부터는 보도 못한 사람의 이름이 순서대로 주어진다.
     이름은 띄어쓰기 없이 알파벳 소문자로만 이루어지며, 그 길이는 20 이하이다.
     듣도 못한 사람의 명단에는 중복되는 이름이 없으며, 보도 못한 사람의 명단도 마찬가지이다.
 */

import java.util.*;
import java.io.*;
public class Q1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int notListen = Integer.parseInt(input[0]); // 듣도 못한 사람의 수 N
        int notSee = Integer.parseInt(input[1]); // 보도 못한 사람의 수 M

        Set<String> notListenSet = new HashSet<>(); // 듣도 못한 사람 저장
        List<String> Answer = new ArrayList<>();

        // 듣도 못한 사람의 명단을 Set에 저장
        for (int i = 0; i < notListen; i++) { // notListen 사람수
            notListenSet.add(br.readLine());
        }

        // 듣도 보도 못한 사람 Answer 리스트에 추가
        for (int i = 0; i < notSee; i++) {
            String name = br.readLine();
            if (notListenSet.contains(name)) {
                Answer.add(name);
            }
        }
        Collections.sort(Answer); // 사전순서 정렬? 알파벳?
        System.out.println(Answer.size());
        for (int i = 0; i < Answer.size() ; i++) {
            System.out.println(Answer.get(i));
        }
    }
}




