package kilnam.baekjoon.workbook2;

import java.util.*;

public class Q1764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashSet<String> hashSet1 = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        List<String> ans = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            hashSet1.add(sc.nextLine());
        }
        for (int j = 0; j < m; j++) {
            hashSet2.add(sc.nextLine());

        }
        for (String elem : hashSet1) {
            if (hashSet2.contains(elem)) {
                ans.add(elem);

            }

        }
        Collections.sort(ans);
        System.out.println(ans.size());


        for (String person : ans) {
            System.out.println(person);
        }
    }


}


