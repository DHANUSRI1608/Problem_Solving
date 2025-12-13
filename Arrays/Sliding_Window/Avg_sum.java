class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;

        // Compute sum of first window of size k
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxAvg = sum;
        // Slide the window and update the sum
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k]; // Add next element, remove first of previous window
            maxAvg = Math.max(maxAvg, sum);
        }

        return maxAvg / k;
    }
}
