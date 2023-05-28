package rivercastle.programmers;

public class Solution181862 {
    public String[] solution(String myStr) {
        String[] splitters = new String[] {"a", "b", "c"};

        for (String splitter : splitters) {
            myStr = myStr.replaceFirst(splitter, " ");
        }

        String[] answer = myStr.split(" ");

        return answer;
    }
}
