package kilnam.baekjoon.workbook1;

import java.util.*;
import java.util.HashSet;
import java.util.Set;


public class Q2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> mySet = new HashSet<Integer>();

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            mySet.add(sc.nextInt());

        }

        for (int num : mySet) {
            sum += num;
        }

        int target = sum - 100;
        for (int element : mySet) {
            if (mySet.contains(target - element) && target - element != element) {
                mySet.remove(Integer.valueOf(target - element));
                mySet.remove(Integer.valueOf(element));
                break;
            }


        }
        List<Integer> myList = new ArrayList<Integer>(mySet);

        // List를 정렬
        Collections.sort(myList);

        for (int element : myList) {
            System.out.println(element);
        }
    }
}

/* 리스트로 구현

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> ans = new ArrayList<Integer>();
        int sum = 0;
        boolean flag = true;
        for (int i = 0; i < 9; i++) {
            list.add(sc.nextInt());
            sum += list.get(i);
        }

        int target = sum - 100;
        for (int i = 0; i < 9; i++) {
            if (list.contains(target - list.get(i)) && target- list.get(i) != list.get(i)) {
                list.remove(Integer.valueOf(target - list.get(i)));
               list.remove(Integer.valueOf(list.get(i)));
               break;
           }


        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}

 */