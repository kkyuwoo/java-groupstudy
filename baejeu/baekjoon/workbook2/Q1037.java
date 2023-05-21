package baejeu.baekjoon.workbook2;

//https://www.acmicpc.net/problem/1037

import java.util.*;

// 양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아니어야 한다. 어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.
// 첫째 줄에 N의 진짜 약수의 개수가 주어진다. 이 개수는 50보다 작거나 같은 자연수이다. 둘째 줄에는 N의 진짜 약수가 주어진다. 1,000,000보다 작거나 같고, 2보다 크거나 같은 자연수이고, 중복되지 않는다.
public class Q1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // 약수의 개수
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < num ; i++) { // 약수의 개수만큼 반복
            numbers.add(sc.nextInt());
        }
        if(num>1) System.out.println(Collections.max(numbers)*Collections.min(numbers));
        else if (num == 1){
            System.out.println(numbers.get(0) * numbers.get(0));
        }
    }
}
