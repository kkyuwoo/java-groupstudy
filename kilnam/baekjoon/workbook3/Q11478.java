package kilnam.baekjoon.workbook3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q11478 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        List<String> list = Arrays.asList(input.split(""));
        HashSet<String> set = new HashSet<>();
        for(int i =1 ; i<= list.size(); i++ ){
            for(int j =0;j<=list.size()-i;j++){
                List<String> subList = list.subList(j,j+i);
                set.add(subList.toString());
            }
        }
        System.out.println(set.size());

    }
}
