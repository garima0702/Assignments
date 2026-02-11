import java.util.Stack;
import java.util.Scanner;

public class ArrayReverseByStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        
        int [] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt(); 
        }

        Stack<Integer> st=new Stack<>();
        for (int i=0;i<n;i++){
            st.push(arr[i]);

        }
        for (int i = 0; i < n; i++) {
            arr[i]=st.pop();
            
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");


        }
            
        }
}
    
    
    

