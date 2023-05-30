package rivercastle.programmers;

public class Solution181913 {
    public String solution(String my_string, int[][] queries) {
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];

            my_string = my_string.substring(0,start - 1) + my_string.substring(start, end) + my_string.substring(end + 1);

        }

        return my_string;
    }
}
