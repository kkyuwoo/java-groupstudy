package baejeu.baekjoon.workbook1;


import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2309 {
    public static void main(String[] args) throws  IOException   {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dwarf9 = new int[9];
        int dwarf9sum = 0;
        for (int i = 0; i < 9; i++) {
            dwarf9[i] = Integer.parseInt(br.readLine());
            dwarf9sum = dwarf9sum + dwarf9[i]; // 똥멍청이들 9명 키 합
        }
        br.close();

        int trash2 = dwarf9sum - 100; // 선택받지 못한 난쟁이 2명 키 합
        int a = 0;
        int b = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = i+1; j < 9 ; j++) {
                if (trash2 == dwarf9[i]+dwarf9[j]){
                    a = i;
                    b = j;
                    break;
                }
            }
        }
        dwarf9[a] = 0;
        dwarf9[b] = 0;
        Arrays.sort(dwarf9);
        for (int i = 0; i < 9 ; i++) {
            if (dwarf9[i]!=0){
                System.out.println(dwarf9[i]);
            }
        }
    }
}
