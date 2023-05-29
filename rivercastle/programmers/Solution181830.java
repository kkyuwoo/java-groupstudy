package rivercastle.programmers;

public class Solution181830 {
    public int[][] solution(int[][] arr) {
        int height = arr.length;
        int width = arr[0].length;
        int difference = height - width;

        if (difference > 0) {
            int[][] answer = new int[height][height];
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
            return answer;
        } else if (difference < 0) {
            int[][] answer = new int[width][width];
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
            return answer;
        } else {
            return arr;
        }
    }
    /*
    public static void main(String[] args) {
        Solution181830 solution181830 = new Solution181830();
        int[][] arr = new int[][]{{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};
        solution181830.solution(arr);
    }
     */
}
