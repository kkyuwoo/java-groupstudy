package baejeu.baekjoon.workbook3;
// 큐 2
// https://www.acmicpc.net/problem/18258
// 정적 어레이인 배열로 큐 구현하기
//1. 메서드로 구현 2. 게시판 보고 메서드에서의 연산을 switch 문으로 옮김 3. 게시판 보고 system.out이 매우 느린 출력이라는걸 알게 됨 그래서 BufferedWriter로 바꿈.

import java.util.*;
import java.io.*;
public class Q18258 {
    private static int[] arr = new int[2000001]; // push만 2000000번 대비
    private static int first = 0; // 첫번째 숫자 위치 저장 변수
    private static int last = 0; // 마지막 숫자 위치 저장 변수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int test = Integer.parseInt(br.readLine()); // 명령어 몇번? 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 2,000,000)
        String order;
        int num; // order가 push면 넣는 값

        for (int i = 0; i < test ; i++) {
            order = br.readLine();
            StringTokenizer st = new StringTokenizer(order);
            if (st.hasMoreTokens()) {
                String command = st.nextToken();
                switch (command) {
                    case "push":
                        num = Integer.parseInt(st.nextToken());
                        arr[last++] = num;
                        break;
                    case "pop":
                        if (first == last)
                            bw.write("-1\n");
                        else
                            bw.write(arr[first++] + "\n");
                        break;
                    case "size":
                        bw.write((last - first) + "\n");
                        break;
                    case "empty":
                        if (first == last)
                            bw.write("1\n");
                        else
                            bw.write("0\n");
                        break;
                    case "front":
                        if (first == last)
                            bw.write("-1\n");
                        else
                            bw.write(arr[first] + "\n");
                        break;
                    case "back":
                        if (first == last)
                            bw.write("-1\n");
                        else
                            bw.write(arr[last - 1] + "\n");
                        break;
                    default:
                        bw.write("명령어를 좀 제대로 입력하세요\n");
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

/*
1단계
import java.util.*;
import java.io.*;
public class Q18258 {
    private int [] arr = new int[2000001];  // push만 2000000번 대비
    private int first =0; // 첫번째 숫자 위치 저장 변수
    private int last =0; // 마지막 숫자 위치 저장 변수
    private void push(int num){
        if(!empty()) {
            arr[this.last] = num;
            this.last++;
        }
        else {
            this.arr[this.first] = num;
            this.last++;
        }
    }
    private int pop(){
        if (empty()) return -1;
        else {
            return this.arr[this.first++];
        }
    }
    private int size(){
        return this.last - this.first;
    }
    private boolean empty(){
        if (size()==0) return true;
        return false;
    }
    private int front(){
        if(empty()) return -1;
        return this.arr[this.first];
    }
    private int back(){
        if(empty()) return -1;
        return this.arr[this.last-1];
    }
    public static void main(String[] args) throws IOException {
        Q18258 main = new Q18258(); // 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine()); // 명령어 몇번? 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 2,000,000)
        String order;
        int num; // order가 push면 넣는 값
        for (int i = 0; i < test ; i++) {
            order = br.readLine();
            StringTokenizer st = new StringTokenizer(order);
            if (st.hasMoreTokens()) {
                String command = st.nextToken();
                switch (command) {
                    case "push":
                        num = Integer.parseInt(st.nextToken());
                        main.push(num);
                        break;
                    case "pop":
                        System.out.println(main.pop()); // 가장 앞에 있는 정수를 빼고, 그 수를 출력 없으면 -1 출력
                        break;
                    case "size":
                        System.out.println(main.size());
                        break;
                    case "empty":
                        System.out.println(main.empty() ? 1 : 0);
                        break;
                    case "front":
                        System.out.println(main.front());
                        break;
                    case "back":
                        System.out.println(main.back());
                        break;
                    default:
                        System.out.println("명령어를 좀 제대로 입력하세요");
                }
            }
        }
    }
}

 */

/*
2단계
import java.util.*;
import java.io.*;

public class Q18258 {
    private int[] arr = new int[2000001]; // push만 2000000번 대비
    private int first = 0; // 첫번째 숫자 위치 저장 변수
    private int last = 0; // 마지막 숫자 위치 저장 변수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine()); // 명령어 몇번? 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 2,000,000)
        String order;
        int num; // order가 push면 넣는 값
        int[] arr = new int[2000001];
        int first = 0;
        int last = 0;

        for (int i = 0; i < test ; i++) {
            order = br.readLine();
            StringTokenizer st = new StringTokenizer(order);
            if (st.hasMoreTokens()) {
                String command = st.nextToken();
                switch (command) {
                    case "push":
                        num = Integer.parseInt(st.nextToken());
                        arr[last++] = num;
                        break;
                    case "pop":
                        System.out.println((first == last) ? -1 : arr[first++]);
                        break;
                    case "size":
                        System.out.println(last - first);
                        break;
                    case "empty":
                        System.out.println((first == last) ? 1 : 0);
                        break;
                    case "front":
                        System.out.println((first == last) ? -1 : arr[first]);
                        break;
                    case "back":
                        System.out.println((first == last) ? -1 : arr[last - 1]);
                        break;
                    default:
                        System.out.println("명령어를 좀 제대로 입력하세요");
                }
            }
        }
    }
}
 */
