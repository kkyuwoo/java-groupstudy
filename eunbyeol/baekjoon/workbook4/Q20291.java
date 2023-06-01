package eunbyeol.baekjoon.workbook4;

import java.io.*;
import java.util.*;

public class Q20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        //<파일 이름, 중복된 파일 갯수>
        Map<String, Integer> hsm = new HashMap<>();

        String fileName;

        for (int i = 0; i < N; i++) {
            fileName = br.readLine().split("\\.")[1];

            if (hsm.containsKey(fileName)) {
                hsm.put(fileName, hsm.get(fileName) + 1);
            } else {
                hsm.put(fileName, 1);
            }
        }
        //TreeMap은 SortedMap 인터페이스를 상속받는 클래스
        //사전순으로 키 정렬
        //Comparator에서 문자열을 비교하는 경우 compareTo() 메서드가 실행됩니다.
        // 이 메서드는 문자열을 사전 순으로 비교하고 오름차순으로 정렬
        Map<String, Integer> sortedMap = new TreeMap<>(hsm);

        //Map key,value 출력
        // Set 형태로 전체 key 값을 얻는다
        //keySet() 메서드는 map이 가지고 있는 전체 key를 모아 Set 형태로 반환
        Set<String> keySet = sortedMap.keySet();
        for (String key : keySet) {
            bw.write(key + " " + sortedMap.get(key) + "\n");
        }
/*        for (String key:sortedMap.keySet()) {
            System.out.println(key + " " + sortedMap.get(key));
        }*/

        bw.flush();
        bw.close();
    }


}


