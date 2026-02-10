

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {23,54,45,76};
        sSort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }

    }
    public static void sSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        
    }
}
