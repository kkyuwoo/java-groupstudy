package kilnam.baekjoon.workbook1;

import java.util.Scanner;
import java.lang.*;
/*public class Q3460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i =0 ;i<test;i++){
        int num = sc.nextInt();
            if (num==1) {
                System.out.println(0);
                break;
            }

        String binaryString = Integer.toBinaryString(num);
            System.out.println(binaryString);
        char[] charArray = binaryString.toCharArray();
        for(int j =charArray.length-1; j >=0;j--){
            if (charArray[j]=='1'){
                System.out.printf("%d ",charArray.length-j-1);
            }

        }

        }
    }
}
*/

import java.util.Scanner;

public class Q3460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int num = sc.nextInt();
            if (num == 1) {
                System.out.println(0);
                continue;  // 입력값이 1인 경우에는 다음 입력값으로 넘어감
            }
            String binaryString = Integer.toBinaryString(num);

            char[] charArray = binaryString.toCharArray();
            for (int j = charArray.length - 1; j >= 0; j--) {
                if (charArray[j] == '1') {
                    System.out.printf("%d ", charArray.length - j - 1);
                }
            }
            System.out.println();  // 각 입력값에 대한 결과 끝에 개행 추가
        }
    }
}
