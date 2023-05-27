package baejeu.baekjoon.workbook3;

// https://www.acmicpc.net/problem/10988
// 팰린드롬인지 확인하기
// 팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.
//  팰린드롬이면 1 아니면 0 출력한다.
//  level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.

import java.util.Scanner;
public class Q10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int pivot = input.length()/2;

        // sub string 사용하기
        if(input.length()%2==0){ // 문자열길이 = 짝수
           String A = input.substring(0,pivot);
            //System.out.println(A);
           String B = input.substring(pivot);
            //System.out.println(B);
           StringBuilder rv = new StringBuilder(B);
           rv.reverse();
           String Breversed = rv.toString();
           //System.out.println(Breversed);
           if (A.equals(Breversed)) System.out.println(1);
           else System.out.println(0);

        }
        else if (input.length()%2 ==1) { // 홀수
            String A = input.substring(0,pivot);
            //System.out.println(A);
            String B = input.substring(pivot+1);
            //System.out.println(B);
            StringBuilder rv = new StringBuilder(B);
            rv.reverse();
            String Breversed = rv.toString();
             //System.out.println(Breversed);
            if (A.equals(Breversed)) System.out.println(1);
            else System.out.println(0);
        }
        /*
        1. 문자열의 길이가 짝수인가 홀수 인가?
        2. substring으로 정확하게 반반 나누기
        3. 나눠진 뒤쪽 문자열을 뒤집기 ?? 어떻게 문자열 뒤집기?
        4. 앞쪽 문자열과 뒤쪽 뒤집은 문자열 서로 비교하기 같으면 1 다르면 0
         */

    }
}
/*
StringBuilder 클레스 사용하기 블로그에 정리하자
StringBuilder rv = new StringBuilder(뒤집고 싶은 문자열); // rv 라는 객체 생성
rv.reverse(); 객제를 반환한다. 역순으로 뒤집힌 문자열을 포함하는 StringBuilder 객체를 반환
String reversedSTR = rv.toString(); StringBuilder 객체를 문자여로 변환하고 문자열 변수에 할당

 */