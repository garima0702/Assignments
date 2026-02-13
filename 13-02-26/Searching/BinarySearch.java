import java.util.Scanner;

public class BinarySearch {
    public static String binarySearch(int [] arr, int k){
        int low=0;
        int high=arr.length;
        while(high>low){
            int mid=(low+high)/2;

            if(arr[mid]==k){
                return k+" found at "+mid+" index";
            }

            if(k>arr[mid]){
                low=mid;
                mid=(low+high)/2;
            }
            if(k<arr[mid]){
                high=mid;
                mid=(low+high)/2;
            }
        }
        return k+"not found";
    }






    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter  sorted array elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(binarySearch(arr, k));
        sc.close();
        
    }
}  

