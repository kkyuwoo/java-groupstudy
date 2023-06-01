package gyuri.baekjoon.workbook4;

import org.w3c.dom.html.HTMLButtonElement;

import java.io.*;
import java.util.*;

public class Q10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int key = Integer.parseInt(st.nextToken());
            if(map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int key = Integer.parseInt(st.nextToken());
            if(map.containsKey(key)) {
                bw.write(map.get(key) + " ");
            } else {
                bw.write(0 + " ");
            }
        }
        bw.flush();
        bw.close();
    }
}
