package baejeu.baekjoon.workbook3;

// 버퍼리더랑 case문으로 바꿔주기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10828Case {
    private int[] arr = new int[10001]; // push 만 10000번 들어오는거 대비
    private int pointer = 0;
    private void push(int num) { // push X: 정수 X를 스택에 넣는 연산이다.
        arr[++pointer] = num;
    }
    private int pop() { // pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        if (empty()) return -1;
        int answer = this.arr[this.pointer];
        this.arr[this.pointer] = 0;
        this.pointer--;
        return answer;
    }
    private int size() { // size: 스택에 들어있는 정수의 개수를 출력한다.
        return this.pointer;
    }
    private boolean empty() { // empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
        return this.size() == 0;
    }
    private int top() { // top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        if (this.empty()) return -1;
        return this.arr[this.pointer];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine()); // 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다.
        String order;
        int num;
        Q10828Case main = new Q10828Case();

        for (int i = 0; i < testcase; i++) {
            order = br.readLine();
            StringTokenizer st = new StringTokenizer(order);
            if (st.hasMoreTokens()) {
                String command = st.nextToken();
                switch (command) {
                    case "push":
                        num = Integer.parseInt(st.nextToken());
                        main.push(num);
                        break;
                    case "pop":
                        System.out.println(main.pop());
                        break;
                    case "size":
                        System.out.println(main.size());
                        break;
                    case "empty":
                        System.out.println(main.empty() ? 1 : 0);
                        break;
                    case "top":
                        System.out.println(main.top());
                        break;
                    default:
                        System.out.println("명령어를 좀 제대로 입력하세요");
                }
            }
        }
    }
}

