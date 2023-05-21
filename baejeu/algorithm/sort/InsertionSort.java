package baejeu.algorithm.sort;

// 삽입정렬
public class InsertionSort {

    public static void sort (int [] arr){
        for (int i = 1; i < arr.length ; i++) {
            for (int j = i; j > 0 ; j--) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {90, 34, 25, 12, 22, 11, 64};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
