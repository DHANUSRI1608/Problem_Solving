package Arrays.Optimal_partition;
import java.util.*;
class Solution {
    public int partitionString(String s) {
        int count=1;
        int freq[] = new int[26]; 
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
            if(freq[s.charAt(i)-'a']>1)
                {
                    count++;
                    Arrays.fill(freq,0);
                    freq[s.charAt(i)-'a']++;
                }
        }
        return count;
    }
}