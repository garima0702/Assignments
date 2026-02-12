import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainsDuplicate2 {

    public static boolean containsNearbyDuplicate(int[] arr, int k) {
        int st = 0;
        Set<Integer> set = new HashSet<>();
        
        for(int end = 0; end < arr.length; end++) {
            if(set.contains(arr[end])) {
                return true;
            }
            set.add(arr[end]);
            if(end - st >= k) {
                set.remove(arr[st]);
                st++;
            }
        }
        
        return false;
    }
      
    

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("size of array:");
        int n=sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter elements in array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter k :");
        int k=sc.nextInt();
        System.out.println(containsNearbyDuplicate(arr,k));
        sc.close();


    }
    
}

    

