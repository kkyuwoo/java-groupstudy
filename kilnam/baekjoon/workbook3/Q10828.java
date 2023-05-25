package kilnam.baekjoon.workbook3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for(int i =0 ; i < n; i++) {
            String[] cmd = br.readLine().split(" ");
            if (cmd[0].equals("push")) {
                stack.push(Integer.valueOf(cmd[1]));
            }else if(cmd[0].equals("pop")) {
                if (!stack.empty()) {
                    int out = Integer.valueOf(stack.pop());
                    System.out.println(out);
                } else {
                    System.out.println(-1);
                }
            }
            else if(cmd[0].equals("size")){
                System.out.println(stack.size());
            }
            else if(cmd[0].equals("empty")){
                if(stack.empty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if(cmd[0].equals("top")){
                if(stack.empty()) {
                    System.out.println(-1);
                }else{
                    System.out.println(stack.peek());

                }
            }
        }

    }
}

