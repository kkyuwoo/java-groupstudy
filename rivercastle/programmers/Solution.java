package rivercastle.programmers;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();

        for (String intStr : intStrs) {
            List<Integer> temp = new ArrayList<>();
            System.out.println("intStr = " + intStr);
            System.out.println("intStr.length() = " + intStr.length());
            for (int i = s; i <= intStr.length() - l; i++) {
                int num = Integer.parseInt(intStr.substring(i, i + l));
                System.out.println("num = " + num);
                if (num > k) {
                    temp.add(num);
                }
            }
            for (int num : temp) {
                if (!answer.contains(num)) {
                    answer.add(num);
                }
            }
        }
        return answer;
    }
}