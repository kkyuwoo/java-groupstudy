package gyuri.baekjoon.workbook3;

import java.io.*;
import java.util.*;

public class Q18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        String last = "0";
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (!str.contains(" ")) {
                if (str.equals("front")) {
                    if(queue.isEmpty()) bw.write("-1\n");
                    else bw.write(Integer.toString(queue.peek()) + "\n");
                }
                else if (str.equals("empty")) {
                    if (queue.isEmpty()) bw.write("1\n");
                    else bw.write("0\n");
                }
                else if (str.equals("size")) bw.write(Integer.toString(queue.size()) + "\n");
                else if (str.equals("pop")) {
                    if(queue.isEmpty()) bw.write("-1\n");
                    else bw.write(Integer.toString(queue.poll()) + "\n");
                }
                else if (str.equals("back")) {
                    if(queue.isEmpty()) bw.write("-1\n");
                    else bw.write(last+"\n");
                }
            } else {
                String command[] = str.split("\\s");
                queue.add(Integer.parseInt(command[1]));
                last = command[1];
            }
        }
        bw.flush();
        bw.close();
    }
}
