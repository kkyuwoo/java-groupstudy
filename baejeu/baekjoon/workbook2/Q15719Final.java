package baejeu.baekjoon.workbook2;
import java.io.*;
public class Q15719Final { // 하..
    private static byte[] buffer = new byte[78888905]; // byte 배열로서 입력을 저장하는 용도
    private static int next; // 버퍼의 인덱스를 저장하는 변수
    private static int b; // buffer에서 읽근 값을 저장하는 변수.
    public static void main(String args[]) throws IOException {
        System.in.read(buffer, 0, buffer.length); // 사용자의 입력을 buffer 배열에 저장
        long N = nextInt();
        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum += nextInt();
        }
        // sum - n(n - 1) / 2 = m
        System.out.println(sum - (N * (N - 1) / 2));
    }
    private static long nextInt() {
        long n = buffer[next++] - '0'; // 문자에서 숫자로 변환
        while ((b = buffer[next++]) >= '0')
            n = (n * 10) + (b - '0');
        return n;
    }
}
/*
입력된 숫자를 모두 저장할 필요가 없는게 아닐까..? ㅋㅋ 배열이든 HashSet이든 결국 저장해서 값을 찾아내는 방식이잖아
버퍼에 저장을 하고 저장한 부분을 일부분씩 나누어 처리가 가능한가? (y/s) => y

그럼 등차수열로 합구해서 빼는 방법 사용하기 sum = N * (N - 1) / 2 (1~ N-1) 까지의 합
버퍼에 저장을하고 저장한 부분을 일부분씩 나누어 처리는 어떻게 구현?
블로그 https://ksh-code.tistory.com/295
byte[] buffer = new byte[78888905] ?

import 문은 필요한 클래스들을 개별적으로 import 하였습니다.

byte[] buffer = new byte[78888905];는 입력을 한 번에 받기 위한 버퍼 배열입니다. 배열의 크기는 문제의 입력 범위에 맞게 설정된 것으로 보입니다.

static int next;는 다음에 읽어올 인덱스를 저장하는 변수입니다.

static int b;는 버퍼에서 읽은 바이트를 저장하는 변수입니다.

System.in.read(buffer, 0, buffer.length);을 통해 입력을 버퍼에 저장합니다. buffer 배열의 크기만큼 바이트를 읽어와 저장합니다.

long N = nextInt();를 통해 버퍼에서 다음에 읽어올 정수를 가져옵니다. nextInt() 메서드에서는 숫자를 하나씩 읽어오며, buffer 배열의 next 인덱스부터 시작하여 숫자를 읽어옵니다.

long sum = 0;은 입력받은 숫자들의 합을 저장하는 변수입니다.

반복문을 통해 숫자를 하나씩 읽어온 뒤, sum 변수에 더해줍니다.

sum - (N * (N - 1) / 2)를 통해 중복된 숫자를 찾습니다. 이는 등차수열의 합 공식을 활용하여 중복된 숫자를 구하는 방식입니다.

System.out.println(...);을 통해 중복된 숫자를 출력합니다.

위의 코드는 입력을 한 번에 읽어오지 않고, 버퍼를 통해 일부분씩 읽어온 뒤 숫자를 처리하는 방식을 사용합니다. 이를 통해 메모리 사용을 줄일 수 있습니다.

 */