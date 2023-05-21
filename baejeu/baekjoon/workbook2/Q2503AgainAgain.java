package baejeu.baekjoon.workbook2;


// 숫자 야구 예측 만들기
import java.util.*;

public class Q2503AgainAgain {

    private List<Baseball> baseballs = new ArrayList<>();

    public Baseball makeABaseball(int first, int second, int third, int strike, int ball){
        return new Baseball(first, second, third, strike, ball);
    }
    // 스트라이크랑 볼 개수 차이 비교
    private int isCorrect(int a , int  b, int c){
        boolean flag = true;
        for (int i = 0; i < baseballs.size() ; i++) { // 조건식 확인하기
            int Strikecnt = 0;
            int Ballcnt = 0;
            if (a == baseballs.get(i).getFirst()) Strikecnt++;
            else if (a == baseballs.get(i).getSecond() || a == baseballs.get(i).getThird()) Ballcnt++;
            if (b == baseballs.get(i).getSecond()) Strikecnt++;
            else if (b == baseballs.get(i).getFirst() || b == baseballs.get(i).getThird()) Ballcnt++;
            if (c == baseballs.get(i).getThird()) Strikecnt++;
            else if (c == baseballs.get(i).getFirst() || c == baseballs.get(i).getSecond()) Ballcnt++;

            if (Strikecnt != baseballs.get(i).getStrike() || Ballcnt != baseballs.get(i).getBall()) {
                flag = false;
                break;
            }
        }
        if (flag==true) return 1;

        return 0;
    }

    // 리스트에 추가
    private void addBaseball(Baseball baseball){
        baseballs.add(baseball);
    }

    // 정답 출력

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        Q2503AgainAgain q2503AgainAgain = new Q2503AgainAgain();
        for (int i = 0; i < input; i++) {
            int [] value = new int[3];
            int A = sc.nextInt();
            int [] returnvalue = q2503AgainAgain.findPlaceValue(A,value);
            q2503AgainAgain.addBaseball(q2503AgainAgain.makeABaseball(returnvalue[0], returnvalue[1], returnvalue[2], sc.nextInt(), sc.nextInt()));
        } // 테스트 완료 Baseball q2503~~ - new Baseball ()
        int answer = 0;
        for (int i = 123; i <= 987 ; i++) {
            int [] test = new int[3];
            int [] returntest =  q2503AgainAgain.findPlaceValue(i, test );
            if (returntest[0]==returntest[1] || returntest[0]==returntest[2] || returntest[1]==returntest[2]) continue;
            if (returntest[0] == 0 || returntest[1] ==0 || returntest[2] == 0 ) continue;
           // System.out.println(Arrays.toString(returntest));
           // System.out.println(answer);
            answer = answer + q2503AgainAgain.isCorrect(returntest[0], returntest[1], returntest[2]);
        }
        System.out.println(answer);

    }
    // 100의자리 10의자리 1의자리 구해주는 메소드
    public int[] findPlaceValue (int A , int[] value){
            value[0] = A / 100; // 100의자리
            value[1] = (A / 10) % 10; // 10의자리
            value[2] = A % 10; // 1의자리

        return value;
    }

}
class Baseball{

    private int first; // 첫번째 숫자
    private int second;
    private int third;
    private int strike;
    private int ball;

    public Baseball(int first, int second, int third, int strike, int ball) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.ball = ball;
        this.strike = strike;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public int getThird() {
        return third;
    }

    public int getBall() {
        return ball;
    }

    public int getStrike() {
        return strike;
    }
}