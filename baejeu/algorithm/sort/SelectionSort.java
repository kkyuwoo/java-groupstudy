package baejeu.algorithm.sort;

public class SelectionSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int target = arr[i];
            int targetidx = i;
            for (int j = i+1; j < arr.length; j++) {
                if (target > arr[j]) {
                    target = arr[j];
                    targetidx = j;
                }
            }
            // swap data
            int temp = arr[i];
            arr[i] = target;
            arr[targetidx] = temp;
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
