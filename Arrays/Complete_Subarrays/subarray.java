package Arrays.Complete_Subarrays;

import java.util.HashSet;
import java.util.Set;

public class subarray {
    public int countCompleteSubarrays(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) set.add(num);
    int distinct = set.size(), res = 0;

    for (int i = 0; i < nums.length; i++) {
        set.clear();
        for (int j = i; j < nums.length; j++) {
            set.add(nums[j]);
            if (set.size() == distinct) res++;
        }
    }
    return res;
    }
}

