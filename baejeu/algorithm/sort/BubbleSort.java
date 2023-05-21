package baejeu.algorithm.sort;

/*
버블 정렬

버블 정렬(Bubble Sort)은 간단한 정렬 알고리즘 중 하나로, 인접한 두 개의 요소를 비교하여 필요한 경우 위치를 교환하는 방식으로 동작합니다.
리스트를 순회하면서 인접한 요소를 계속해서 비교하고 교환하는 과정을 반복하여 정렬을 수행합니다.

버블 정렬의 기본 아이디어는 주어진 리스트에서 가장 큰(또는 가장 작은) 요소를 맨 뒤로 이동시키는 것입니다.
이러한 과정을 리스트에 요소가 정렬될 때까지 반복하면, 전체 리스트가 정렬된 상태가 됩니다.
버블 정렬은 간단하고 이해하기 쉽지만, 대량의 데이터에 대해서는 비효율적인 알고리즘이므로 큰 규모의 정렬에는 적합하지 않습니다.

*/

public class BubbleSort {
    public static void bubbleSort(int[] arr) { // 기본적인 버블정렬 메서드
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // 배열길이-1 * 베열길이-1 만큼 for문 반복
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    // 기본적인 버블정렬에서 개선 첫번째 정렬시 배열 마지막 인덱스에는 가장 큰 숫자가 들어간다. 그래서 반복 범위를 1씩 줄여나가는 방법
    // 반복 :  배열길이-1 + 배열길이-1-1 + .....  배열길이-배열길이(동작x)
    public static void bubbleSortimprove( int[] arr){
        for (int j = 1; j <= arr.length; j++) { // 7
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
    // 직관적인 버블정렬 가장작은 숫자를 첫번째 인덱스에 정렬 그 다음 작은 숫자를 2번째 인덱스에 정렬
    // 1,2 버블 정렬은 가장 큰 숫자를 뒤로 배치하는 정렬이었지만 이번 정렬은 가장 작은숫자를 기준으로 정렬한다.
    public static void bubbleSortintuitive(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;

                    }
                }
            }
    }
    public static void main(String[] args) {
        int[] arr = {90, 34, 25, 12, 22, 11, 64};
        // bubbleSort(arr);
        // bubbleSortimprove(arr);
        // bubbleSortintuitive(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
