package rivercastle.baekjoon.workbook3;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Q10825 {
    private List<Integer> answer = new ArrayList<>();

    private int idx = 0;
    private int pointer = 0;

    public void push(int num1) {
        answer.add(num1);
        idx++;
    }

    public int pop() {
        return answer.get(--idx);
    }

    public int size() {
        return this.idx - this.pointer;
    }

    public int empty() {
        return size() == 0 ? 0 : 1;
    }

    public int front() {
        return answer.get(pointer);
    }
    public int back() {
        return answer.get(idx - 1);
    }

    public static void main(String[] args) throws IOException {
        Q10825 q10825 = new Q10825();
        BufferedReader bufferedReader = new BufferedReader();
        StringTokenizer stringTokenizer;
        int testTime = Integer.parseInt(bufferedReader.readLine());
        String line;
        String answer = "";
        for (int i = 0; i < testTime; i++) {
            line = bufferedReader.readLine();

            if (line.contains("push")) {
                stringTokenizer = new StringTokenizer(line);
                stringTokenizer.nextToken();
                q10825.push(Integer.parseInt(stringTokenizer.nextToken()));
            } else if (line.contains("pop")) {
                answer += q10825.pop() + "\n";
            } else if (line.) {
                
            }
        }
    }
}
