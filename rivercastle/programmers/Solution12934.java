package rivercastle.programmers;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Solution12934 {
    public long solution(long n) {
        return Math.sqrt(n) % 1 == 0 ? (long) ((Math.sqrt(n) + 1) * (Math.sqrt(n) + 1)) : -1;
    }
}
