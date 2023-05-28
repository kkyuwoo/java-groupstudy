package rivercastle.programmers;

import java.util.Arrays;

public class Solution181881 {
    public int[] changeArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                arr[i] /= 2;
            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                arr[i] = arr[i] * 2 + 1;
            }
        }
        return arr;
    }

    public int solution(int[] arr) {
        int answer = 0;
        while (arr != changeArr(arr)) {
            arr = changeArr(arr);
            answer += 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 100, 99, 98};
        Solution181881 solution181881 = new Solution181881();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(solution181881.changeArr(arr)));
    }
}
