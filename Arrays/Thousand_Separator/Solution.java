package Arrays.Thousand_Separator;

import java.util.*;

public class Solution {
    public String thousandSeparator(int n) {
        String s = String.valueOf(n);
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i));
            count++;
            if (count % 3 == 0 && i > 0) {
                result.append('.');
            }
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int n = sc.nextInt();             

        Solution obj = new Solution();
        String output = obj.thousandSeparator(n);

        System.out.println("Formatted Output: " + output);
    }
}
