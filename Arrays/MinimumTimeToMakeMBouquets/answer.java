package Arrays.MinimumTimeToMakeMBouquets;

import java.util.*;

class Solution {
    public static boolean canMake(int[] bloomDay, int m, int k, int days) {
        int flowersc = 0, bouquets = 0;
        for (int bloom : bloomDay) {
            if (bloom <= days) {
                flowersc++;
                if (flowersc == k) {
                    bouquets++;
                    flowersc = 0;
                }
            } else {
                flowersc = 0; 
            }
        }
        return bouquets >= m;
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) return -1; 

        int low = 1, high = 0;
        for (int day : bloomDay) {
            high = Math.max(high, day);
        }
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canMake(bloomDay, m, k, mid)) {
                ans = mid;
                high = mid - 1; 
            } else {
                low = mid + 1;  
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take number of flowers
        System.out.print("Enter number of flowers: ");
        int n = sc.nextInt();

        // take bloom days
        int[] bloomDay = new int[n];
        System.out.println("Enter bloom days: ");
        for (int i = 0; i < n; i++) {
            bloomDay[i] = sc.nextInt();
        }

        // take m and k
        System.out.print("Enter number of bouquets (m): ");
        int m = sc.nextInt();

        System.out.print("Enter flowers per bouquet (k): ");
        int k = sc.nextInt();

        // call function
        int ans = minDays(bloomDay, m, k);

        System.out.println("Minimum number of days = " + ans);
    }
}
