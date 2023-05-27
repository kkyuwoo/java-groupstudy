package baejeu.algorithm.greedy;
// https://www.acmicpc.net/problem/11399
// ATM
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class BJ11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < testcase ; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        int[] prefixsum = new int[testcase];
        prefixsum[0] = list.get(0);
        for (int i = 1; i < testcase ; i++) {
            prefixsum[i] = prefixsum[i-1] + list.get(i);
        }
        int sum = 0;
        for (int i = 0; i < testcase ; i++) {
            sum = sum + prefixsum[i];
        }
        System.out.println(sum);

    }
}
/*
인하은행에는 ATM이 1대밖에 없다  지금 이 ATM앞에 N명의 사람들이 줄을 서있다.

3 1 4 3 2
1 2 3 3 4

누적합 전체 더하기



 */
