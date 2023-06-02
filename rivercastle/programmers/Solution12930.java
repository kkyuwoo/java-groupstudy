package rivercastle.programmers;

public class Solution12930 {
    public String solution(String s) {//미해결
        String answer = "";
        String[] words = s.split(" ");
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (i % 2 == 0) {
                    answer += word.substring(i, i+1).toUpperCase();
                } else {
                    answer += word.charAt(i);
                }
            }
            answer += " ";
        }

        return answer.trim();
    }

}
