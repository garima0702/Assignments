import java.util.*;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int st = 0;
        int end = k;
        double sum = 0;

        for(int i = 0; i < k; i++){
            sum += nums[i];
        }

        double maxsum = sum;

        for(int i = 1; i <= nums.length - k; i++){
            sum = sum - nums[st] + nums[end];
            maxsum = Math.max(maxsum, sum);
            st++;
            end++;
        }

        return maxsum / k;
    }
}

public class MaximumAverageSubarray1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter value of k:");
        int k = sc.nextInt();

        Solution obj = new Solution();
        double result = obj.findMaxAverage(nums, k);

        System.out.println("Maximum Average: " + result);

        sc.close();
    }
}
