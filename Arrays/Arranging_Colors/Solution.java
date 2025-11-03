package Arrays.Arranging_Colors;

import java.util.*;

public class Solution {
    public static int minCost(String colors, int[] neededTime) {
        int sum = 0;
        for (int i = 1; i < colors.length(); i++) {
            if (colors.charAt(i) == colors.charAt(i - 1)) {
                sum += Math.min(neededTime[i], neededTime[i - 1]);
                if (neededTime[i] < neededTime[i - 1]) {
                    neededTime[i] = neededTime[i - 1];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter colors string (e.g., aabaa): ");
        String colors = sc.nextLine();

        System.out.print("Enter number of elements in neededTime: ");
        int n = sc.nextInt();

        int[] neededTime = new int[n];
        System.out.println("Enter " + n + " time values:");
        for (int i = 0; i < n; i++) {
            neededTime[i] = sc.nextInt();
        }

        int result = minCost(colors, neededTime); 
        System.out.println("Minimum total time to remove balloons: " + result);
    }
}
