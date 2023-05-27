package baejeu.baekjoon.workbook3;

// https://www.acmicpc.net/problem/2164
// 카드2

import java.util.LinkedList;
import java.util.Queue; // 큐
import java.util.Scanner;
public class Q2164 { // N(1 ≤ N ≤ 500,000  scanner로 충분하게 돌아갈듯?
    public static void main(String[] args) { // 시간제한 2초!
        Queue<Integer> queue = new LinkedList<>(); // 큐
      //Queue<String> queue2 = new ArrayList<>();  에러 발생
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 1; i <=input ; i++) {
            queue.add(i);
        }
        // System.out.println(queue);

        while (queue.size()>1){
            queue.remove(); // 제일 먼저 들어간 값 삭제
            if(queue.size()==1) break;
            int move = queue.element(); // 제일 앞에 있는 값 move에 저장
            queue.remove();
            queue.add(move);
        }
        System.out.println(queue.element());
    }

}
/* Queue<String> queue2 = new ArrayList<>();  에러 발생의 이유
Queue 인터페이스는 큐 자료구조의 특성을 정의하고, 큐의 동작을 보장하는 메서드를 정의합니다.
LinkedList 클래스는 Queue 인터페이스를 구현하고 있기 때문에 Queue로 사용할 수 있습니다.
반면에 ArrayList는 List 인터페이스를 구현하는 클래스로, 리스트 자료구조의 특성과 메서드를 가지고 있습니다.
ArrayList는 요소의 순서를 유지하며 인덱스를 사용하여 요소에 접근하는 것에 적합합니다.
ArrayList는 큐의 동작을 보장하는 Queue 인터페이스의 메서드를 구현하지 않기 때문에 Queue로 사용할 수 없습니다.
 */

/* queue 인터페이스 제공 메소드 정리
boolean add(E element): 큐에 요소를 추가합니다. 큐가 가득 찬 경우 예외를 던집니다.
boolean offer(E element): 큐에 요소를 추가합니다. 큐가 가득 찬 경우 false를 반환합니다.
E remove(): 큐의 맨 앞에 있는 요소를 제거하고 반환합니다. 큐가 비어있는 경우 예외를 던집니다.
E poll(): 큐의 맨 앞에 있는 요소를 제거하고 반환합니다. 큐가 비어있는 경우 null을 반환합니다.
E element(): 큐의 맨 앞에 있는 요소를 반환합니다. 큐가 비어있는 경우 예외를 던집니다.
E peek(): 큐의 맨 앞에 있는 요소를 반환합니다. 큐가 비어있는 경우 null을 반환합니다.

 */
