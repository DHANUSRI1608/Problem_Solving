import java.util.*;

public class answer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target=sc.nextInt();
        Arrays.sort(arr);
        int start=0,end=arr.length-1,sum=0;
        while(start<end)
        {
           sum=arr[start]+arr[end];
           if(sum==target)
           {
            System.out.println(arr[start]+" "+arr[end]);
            start++;
            end--;
           }
           if(sum<target) start++;
           else end--; 
        }
    }
}

