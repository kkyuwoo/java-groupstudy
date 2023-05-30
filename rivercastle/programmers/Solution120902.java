package rivercastle.programmers;

import java.math.BigInteger;

public class Solution120902 {
    public int solution(String my_string) {
        String[] splitted = my_string.split(" ");
        if (splitted[0].contains("+")) {
            splitted[0] = splitted[0].replace("+", "");
        }
        switch(splitted[1]) {
            case "+" :
                return Integer.parseInt(splitted[0]) + Integer.parseInt(splitted[2]);
            default :
                return Integer.parseInt(splitted[0]) - Integer.parseInt(splitted[2]);
        }
    }
}
