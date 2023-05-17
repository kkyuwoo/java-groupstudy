package gyuri.baekjoon.workbook2;

import java.util.*;

public class Q1764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        /*String[] d = new String[n];
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextLine();
        }*/
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            list.add(s);
        }
        Collections.sort(list);
        String[] ary = new String[list.size()];
        ary = list.toArray(ary);

        List<String> answerList = new ArrayList<String>();
        for (int i = 0; i < m; i++) {
            String s = sc.nextLine();
            int index = Arrays.binarySearch(ary, s);
            if (index >= 0) {
                answerList.add(s);
            }
        }
        System.out.println(answerList.size());
        Collections.sort(answerList);
        for (int i = 0; i < answerList.size(); i++) {
            System.out.println(answerList.get(i));
        }
    }
}
