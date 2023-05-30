package rivercastle.programmers;


public class Solution177871 {
    public String[] solution(String[] players, String[] callings) {
        for (String calling : callings) {
            int targetIdx = 0;
            for (int i = 0; i < players.length; i++) {
                if (players[i].equals(calling)) {
                    targetIdx = i;
                    break;
                }
            }
            String temp = players[targetIdx - 1];
            players[targetIdx - 1] = calling;
            players[targetIdx] = temp;
        }
        return players;
    }
}
