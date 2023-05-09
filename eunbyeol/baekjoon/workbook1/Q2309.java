package eunbyeol.baekjoon.workbook1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q2309 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] nineArr = new int[9];
        Random random = new Random();

        for(int i = 0; i < nineArr.length; i++){
            int dwarfHeight = sc.nextInt();
            nineArr[i] = dwarfHeight;
        }

        int sum = 0;
        int[] sevenArr = new int[7];
        for(int i = 0; i < sevenArr.length; i++) {
            sevenArr[i] = random.nextInt(9);
        }
        System.out.println(Arrays.toString(sevenArr));

/*        int max = arr[0];
        if(sum == 100){

        }*/
        }
}
