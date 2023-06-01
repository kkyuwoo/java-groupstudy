package gyuri.baekjoon.workbook4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String str = s.substring(s.indexOf(".")+1);
            //맵의 key에 해당하는 value가 없을 경우에 get 메서드를 사용하면 null이 리턴
            //null 대신 디폴트 값을 얻고 싶은 경우에는 getOrDefault 메서드를 사용
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        //사전순 정렬을 위해 keyset 리스트로 변환
        List<String> keyset = new ArrayList<>(map.keySet());
        Collections.sort(keyset);

        for (int i = 0; i < keyset.size(); i++) {
            System.out.println(keyset.get(i) + " " + map.get(keyset.get(i)));
        }
    }
}