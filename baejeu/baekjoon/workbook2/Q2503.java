package baejeu.baekjoon.workbook2;
/*
숫자야구 게임
 */

import java.util.*;

public class Q2503 {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int [] numbers = new int[input]; // 숫자
        int [] strike = new int[input]; // 스트라이크
        int [] ball = new int[input]; // 볼
        for (int i = 0; i < input ; i++) {
            numbers[i] = sc.nextInt(); // 123, 356. 327. 489
            strike[i] = sc.nextInt();
            ball[i] = sc.nextInt();
        }

        /* 입력값 테스트
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(strike));
        System.out.println(Arrays.toString(ball));
        */
        int answer = 0;

        for (int i = 123; i <= 987 ; i++) {
            int a = i /100; // 100의 자리
            int b = (i/10) % 10; // 10의 자리
            int c = i % 10; // 1의 자리

            if (a==b || b==c || a==c) continue; // 중복숫자는 정답이 아니다.

            boolean flag = true; //

            for (int j = 0; j < input ; j++) {
                int x = numbers[j] / 100; // 100의 자리
                int y = (numbers[j] / 10) % 10; // 10의 자리
                int z = numbers[j] % 10; // 1의 자리

                int Strikecnt = 0;
                int Ballcnt = 0;
                if ((a==x)||(b==y)||(c==z)) Strikecnt++;
                if ((a==y)||(a==z)) Ballcnt++;
                if ((b==x)||(b==z)) Ballcnt++;
                if ((c==x)||(c==y)) Ballcnt++;

                if (Strikecnt != strike[j] || Ballcnt != ball[j] ) {
                    flag = false;
                    break;
                }
                if (flag == true){
                    answer++;
                }

                }

            }
        System.out.println(answer);
        }
    }

/*
구상 게임 최솟값 123 ~ 987 최대 까지
스트라이크 와 볼 비교해서


 */
