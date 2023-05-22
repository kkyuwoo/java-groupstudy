package eunbyeol.baekjoon.workbook2;

import java.io.*;
import java.util.StringTokenizer;

public class Q15719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long length = Integer.parseInt(br.readLine());
        //1부터 N - 1까지의 정수가 하나씩 정렬되지 않은 채로 저장
        StringTokenizer st = new StringTokenizer(br.readLine());


        long seq = length * (length - 1) / 2;    //등차수열
        long sum = 0;

        for (int i = 0; i < length; i++) {
            sum += Integer.parseInt(st.nextToken());
        }

        //배열 합에서 등차수열 합을 빼면 중복 값 나옴
        System.out.println(sum - seq);

    }
}

    //중첩 for문 사용하면 시간초과됨
/*      public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int length = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                    if(arr[i] == arr[j]){
                        System.out.println(arr[i]);
                        break;
                    }else continue;
            }
        }
        bw.flush();
        bw.close();

    }*/

