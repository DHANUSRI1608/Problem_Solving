import java.util.ArrayList;
import java.util.List;

public class Max {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 1) return nums;

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i <= nums.length - k; i++) {
            int max = Integer.MIN_VALUE;   

            for (int j = i; j < i + k; j++) {
                max = Math.max(max, nums[j]);
            }
            arr.add(max);
        }

        int[] array = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            array[i] = arr.get(i);
        }

        return array;
    }
}
 