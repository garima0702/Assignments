//package Sorting.Insertion Sort;

public class Problem1 {
    public static void main(String[] args) {
        int[] arr = {3,4,2,7,5};
        Isort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
    public static void Isort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] =arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
