package baejeu.baekjoon.workbook1;
/*
피보나치 수 5
피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.

이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.

n=17일때 까지 피보나치 수를 써보면 다음과 같다.

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
첫째 줄에 n이 주어진다. n은 20보다 작거나 같은 자연수 또는 0이다.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
public class Q10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = fibonacci(N);
        System.out.println(sum);
    }
    static int fibonacci(int N){  //
        if(N==0){
            return 0;
        }
        else if (N==1){
            return 1;
        }
        else {
            return fibonacci(N-2) + fibonacci(N-1);
        }

    }
}
