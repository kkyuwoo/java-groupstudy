package rivercastle.programmers;

public class Solution181943 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s - 1 + overwrite_string.length() + 1);
        return answer;
    }

    public static void main(String[] args) {
        Solution181943 solution181943 = new Solution181943();
        System.out.println(solution181943.solution("He11oWor1d","lloWorl", 2));
    }
}
