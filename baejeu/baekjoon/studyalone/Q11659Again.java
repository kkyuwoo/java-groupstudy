package baejeu.baekjoon.studyalone;

// 스캐너로부터 입력을 받고 바로 누적합 배열에 넣기


import java.util.Arrays;
import java.util.Scanner;
public class Q11659Again {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt(); // 배열 크기
        int input2 = sc.nextInt(); // 테스트 케이스
        int [] PrefixSum = new int[input+1];
        PrefixSum[0] = 0;
        for (int i = 1; i < input +1 ; i++) {
            PrefixSum[i] = PrefixSum[i-1] + sc.nextInt();
        }
       // System.out.println(Arrays.toString(PrefixSum));

        for (int i = 0; i < input2 ; i++) { // 테스트 케이스
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(PrefixSum[b] -PrefixSum[a-1]);
        }

    }
}
