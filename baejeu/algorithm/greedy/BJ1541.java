package baejeu.algorithm.greedy;

// https://www.acmicpc.net/problem/1541
// 잃어버린 괄호 그리디 실버2

import java.io.*;
public class BJ1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] input = br.readLine().split("-"); // split 에도 or 연산 가능하다. \\+  ,  - 기억하기
        int length = input.length;
        int sum = 0;
        for (int i = 0; i < input.length ; i++) {
           String [] split = input[i].split("\\+");
           int num = plus(split);
           if(i!=0){
               sum = sum - num;
           }
           else sum = sum + num;
        }
        System.out.println(sum);
    }
    public static int plus(String[] split){
        int sum = 0;
        for (int i = 0; i < split.length ; i++) {
            sum = sum + Integer.parseInt(split[i]);
        }
        return sum;
    }

}

/*
세준이는 양수와 +, -, 그리고 괄호를 가지고 식을 만들었다. 그리고 나서 세준이는 괄호를 모두 지웠다.
그리고 나서 세준이는 괄호를 적절히 쳐서 이 식의 값을 최소로 만들려고 한다.
괄호를 적절히 쳐서 이 식의 값을 최소로 만드는 프로그램을 작성하시오.
첫째 줄에 식이 주어진다. 식은 ‘0’~‘9’, ‘+’, 그리고 ‘-’만으로 이루어져 있고,
가장 처음과 마지막 문자는 숫자이다.
그리고 연속해서 두 개 이상의 연산자가 나타나지 않고, 5자리보다 많이 연속되는 숫자는 없다
수는 0으로 시작할 수 있다. 입력으로 주어지는 식의 길이는 50보다 작거나 같다.
00009-00009
방법: - 뒷부분 바로 ()묶기.

55-50-40

 */