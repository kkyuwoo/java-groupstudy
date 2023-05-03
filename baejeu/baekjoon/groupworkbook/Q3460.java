package baejeu.baekjoon.groupworkbook;

/*
양의 정수 n이 주어졌을 때, 이를 이진수로 나타냈을 때 1의 위치를 모두 찾는 프로그램을 작성하시오. 최하위 비트(least significant bit, lsb)의 위치는 0이다.
첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, n이 주어진다. (1 ≤ T ≤ 10, 1 ≤ n ≤ 106)
출력
각 테스트 케이스에 대해서, 1의 위치를 공백으로 구분해서 줄 하나에 출력한다. 위치가 낮은 것부터 출력한다.

예제 입력           예제출력
1                  0 2 3
13 

13(2)= 1101(2)  // 0 2 3


 */

import java.util.*;
public class Q3460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 개수
        for (int i = 0; i < T ; i++) { // 테스트 케이스 개수만큼 반복
            int n = sc.nextInt(); // 양의 정수 n
            findBinary1locaton(n);
            System.out.println();
        }
    }

    public static void findBinary1locaton(int num){
        ArrayList<Integer> arrayList = new ArrayList<>();
        while(num>0){
            int temp;
            temp = num%2;
            arrayList.add(temp);
            num = num / 2;
        }

        for (int i = 0; i < arrayList.size() ; i++) {
            if( arrayList.get(i) == 1 ){
                System.out.printf("%d ", i);
            }
        }
    }
}
