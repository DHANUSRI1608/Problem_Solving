package Arrays.Specials_Floor;

import java.util.*;

public class Main {
    public static int maxConsecutive(int bottom, int top, int[] special) {
        int max = Integer.MIN_VALUE;
        
        Arrays.sort(special);
        
        max = Math.max(max, special[0] - bottom);
        
        for(int i = 1; i < special.length; i++) {
            max = Math.max(max, special[i] - special[i - 1] - 1);
        }
        
        max = Math.max(max, top - special[special.length - 1]);
        
        return max;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input bottom and top
        System.out.print("Enter bottom: ");
        int bottom = sc.nextInt();
        
        System.out.print("Enter top: ");
        int top = sc.nextInt();
        
        // Input size of special array
        System.out.print("Enter number of special elements: ");
        int n = sc.nextInt();
        
        int[] special = new int[n];
        System.out.println("Enter special elements: ");
        for(int i = 0; i < n; i++) {
            special[i] = sc.nextInt();
        }
        
        int result = maxConsecutive(bottom, top, special);
        System.out.println("Maximum consecutive floors without special: " + result);
    }
}
