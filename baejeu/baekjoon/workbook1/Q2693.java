package baejeu.baekjoon.workbook1;

/*
N번째 큰 수
배열 A가 주어졌을 때, N번째 큰 값을 출력하는 프로그램을 작성하시오.

배열 A의 크기는 항상 10이고, 자연수만 가지고 있다. N은 항상 3이다.

 */

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2693 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        for (int i = 0; i < input ; i++) { // 테스트 케이스 개수
            int [] array = new int[10];
            String[] inputArr = br.readLine().split(" ");
            for (int j = 0; j < array.length ; j++) {
                array[j] = Integer.parseInt(inputArr[j]);
            }
            Arrays.sort(array);
            System.out.println(array[7]);
        }
    }
}

