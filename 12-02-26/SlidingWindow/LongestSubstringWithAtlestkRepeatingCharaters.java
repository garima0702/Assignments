import java.util.Scanner;
class Solution {
    public int longestSubstring(String s, int k) {
        int n = s.length();
        int[] f = new int[26];

        for (char ch : s.toCharArray()) {
            f[ch - 'a']++;
        }

        for (int i = 0; i < n; i++) {
            if (f[s.charAt(i) - 'a'] < k) {
                int left = longestSubstring(s.substring(0, i), k);
                int right = longestSubstring(s.substring(i + 1), k);
                return Math.max(left, right);
            }
        }

        return n;
    }
}

public class LongestSubstringWithAtlestkRepeatingCharaters{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String s = sc.nextLine();

        System.out.println("Enter value of k:");
        int k = sc.nextInt();

        Solution obj = new Solution();
        int result = obj.longestSubstring(s, k);

        System.out.println("Length of longest substring: " + result);

        sc.close();
    }
}

