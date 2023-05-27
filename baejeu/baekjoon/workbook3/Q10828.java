package baejeu.baekjoon.workbook3;

// 스택
// https://www.acmicpc.net/problem/10828
// 시간 제한 0.5 초 5000만번 연산

import java.util.*;
public class Q10828 {
    private int[] arr = new int[10001]; // push 만 10000번 들어오는거 대비
    private int pointer = 0;
    private void push(int num){ // push X: 정수 X를 스택에 넣는 연산이다.
        arr[++pointer] = num;
    }
    private int pop(){ // pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        if (empty()) return -1;
        int answer = this.arr[this.pointer];
        this.arr[this.pointer] = 0;
        this.pointer--;
        return answer;
    }
    private int size(){ // size: 스택에 들어있는 정수의 개수를 출력한다.
        return this.pointer;
    }
    private boolean empty(){ // empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
        if(this.size() == 0) return true;
        else return false;
    }
    private int top(){ // top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        if (this.empty()) return -1;
        return this.arr[this.pointer];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt(); // 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다.
        sc.nextLine();
        String order;
        int num;
        Q10828 main = new Q10828();
        for (int i = 0; i < testcase ; i++) {
            order = sc.next();
           // System.out.println(order);
            if (order.equals("push")){
                num = sc.nextInt();  // 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다.
             //   System.out.println(num);
                main.push(num);
            }
            else if (order.equals("pop")){
                System.out.println(main.pop());
            }
            else if (order.equals("size")){
                System.out.println(main.size());
            }
            else if (order.equals("empty")){
                if (main.empty()) System.out.println(1);
                else System.out.println(0);
            }
            else if (order.equals("top")){
                System.out.println(main.top());
            }
            else System.out.println("명령어를 좀 제대로 입력하세요");
        }
    }
}
