package rivercastle.programmers;

public class Solution181871 { //문자열이 몇 번 등장하는지 세기
    public int solution(String myString, String pat) {
        int answer = 0;
        int lengthMyString = myString.length();
        int lengthPat = pat.length();
        for (int i = 0; i <= lengthMyString - lengthPat; i++) {
            if (myString.substring(i, i + lengthPat).equals(pat)) {
                answer += 1;
            }
        }
        return answer;
    }
}
