import java.util.*;

public class answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        Arrays.sort(arr);

        for (int i = 0; i < n - 3; i++) {
            if(i>0 && arr[i]==arr[i-1]) continue;
            for (int j = i + 1; j < n - 2; j++) {
              if(j>i+1 && arr[j]==arr[j-1]) continue;
                int start = j + 1, end = n - 1;
                while (start < end) {
                    int sum = arr[i] + arr[j] + arr[start] + arr[end];
                    if (sum == target) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[start] + " " + arr[end]);
                        start++;
                        end--;

                        // skip duplicates for third and fourth numbers
                        while (start < end && arr[start] == arr[start - 1]) start++;
                        while (start < end && arr[end] == arr[end + 1]) end--;
                    } else if (sum < target) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }
    }
}
