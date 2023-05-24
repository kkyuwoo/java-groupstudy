package gyuri.baekjoon.workbook3;

import java.lang.reflect.Array;
import java.util.*;

public class Q11478 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet list = new HashSet<String>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                if (list.contains(s.substring(i, j))) {
                    continue;
                } else {
                    list.add(s.substring(i, j));
                }
            }
        }
        System.out.println(list.size());
    }
}
