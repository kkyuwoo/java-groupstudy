package gyuri.baekjoon.workbook3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");
        List pal = new ArrayList<String>();
        int result = 1;
        for (int i = str.length-1; i >= 0; i--) {
            pal.add(str[i]);
        }
        for (int i = 0; i < str.length; i++) {
            if (pal.get(i).equals(str[i])) {
                continue;
            } else {
                result = 0;
                break;
            }
        }
        System.out.println(result);
    }
}
