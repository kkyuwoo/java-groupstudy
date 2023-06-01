package rivercastle.baekjoon.kangseong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testNum = Integer.parseInt(bufferedReader.readLine());
        int cnt = testNum;
        for (int i = 0; i < testNum; i++) {
            String[] alphabets = bufferedReader.readLine().split("");
            Stack<String> stringStack = new Stack<>();
            stringStack.push(alphabets[0]);

            for (int j = 1; j < alphabets.length; j++) {
                if (stringStack.peek() != alphabets[j] && !stringStack.contains(alphabets[j])) {
                    stringStack.push(alphabets[j]);
                } else if (!stringStack.peek().equals(alphabets[j]) && stringStack.contains(alphabets[j])){
                    cnt -= 1;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
