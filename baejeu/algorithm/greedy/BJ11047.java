package baejeu.algorithm.greedy;


//https://www.acmicpc.net/problem/11047
// 동전 0
import java.util.*;
import java.io.*;
public class BJ11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N ; i++) {
           list.add(Integer.parseInt(br.readLine()));
        }
        int cnt = 0;
        for (int i = N-1; 0 <= i ; i--) {
            int A = K / list.get(i);
            K =  K - (A * list.get(i));
            cnt += A;
            if (K==0) break;
        }
        System.out.println(cnt);
    }
}
