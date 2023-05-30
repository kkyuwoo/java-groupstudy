package rivercastle.programmers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Solution42586 {
    public int sum(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        int idx = 0; //다음 배포 인덱스
        while (sum(answer) != speeds.length) {
            System.out.println("start");
            for (int j = idx; j < speeds.length; j++) {
                if (progresses[j] <= 100) {
                    progresses[j] += speeds[j];
                }
                System.out.printf("progresses = ");
                System.out.println(Arrays.toString(progresses));
            }
            int cnt = 0;
            for (int j = 0; j < speeds.length; j++) {
                if (progresses[idx] >= 100) {
                    idx++;
                    cnt++;
                } else if (idx == speeds.length || progresses[idx] < 100) {
                    System.out.printf("cnt = %d\n", cnt);
                    if (cnt != 0) {
                        answer.add(cnt);
                        break;
                    }
                }
            }
            System.out.printf("answer = ");
            System.out.println(answer);
        }
        System.out.println("end");
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        Solution42586 solution42586 = new Solution42586();
        int[] progresses = new int[]{93, 30, 55};
        int[] speeds = new int[]{1, 30, 5};
        solution42586.solution(progresses, speeds);
    }
}
