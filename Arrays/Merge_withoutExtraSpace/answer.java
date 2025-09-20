package Arrays.Merge_withoutExtraSpace;

import java.util.*;

public class answer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] arr1 = new int[m+n];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }    
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        int index = 0;
        for (int i = m; i < m + n; i++) {
            arr1[i] = arr2[index++];
        }
        Arrays.sort(arr1);
        for(int i=0;i<m+n;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}

