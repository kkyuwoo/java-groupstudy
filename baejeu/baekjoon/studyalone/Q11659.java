package baejeu.baekjoon.studyalone;

//https://www.acmicpc.net/problem/11659
/*
구간 합 구하기 4
알고리즘 분류: 누적 합
누적 합?
Prefix Sum의 각 요소는 해당 해당 인덱스까지의 부분 합(Partial Sum)을 의미한다

ex)
{1, 2, 3, 4, 5}
{1, 3, 6, 10 ,15}

 */
import java.util.Arrays;
import java.util.Scanner;
public class Q11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt(); // 배열 크기
        int input2 = sc.nextInt(); // 테스트 케이스
        int [] array = new int[input];
        for (int i = 0; i < input ; i++) { // 배열 값 받기
            array[i] = sc.nextInt();
        }
        // System.out.println(Arrays.toString(array));
        for (int i = 0; i < input2 ; i++) { // 테스트 케이스
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(sum(a, b, array));
        }
    }

    public static int sum(int a, int b, int[]array){
        int sum = 0;
        int [] PrefixSum = new int[array.length +1]; // 5
        PrefixSum[0]= 0;
        PrefixSum[1] = array[0];
        for (int i = 2; i < array.length + 1; i++) {
            PrefixSum[i] = PrefixSum[i-1] + array[i-1];
        }
        // System.out.println(Arrays.toString(PrefixSum)); // [0 5 9 12 14 15]
        sum = PrefixSum[b] -PrefixSum[a-1];
        return sum;
    }

}
