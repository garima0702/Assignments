import java.util.Scanner;

public class LinerSearch {
    public static String linearSearch(int [] arr,int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return k+" found at "+ i+1+"position";
            }
        }
        return  k+" not found in array ";
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter array elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(linearSearch(arr, k));
    }
    
}
