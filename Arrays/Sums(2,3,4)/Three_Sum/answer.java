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
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
        int start=i+1,end=arr.length-1;
        while(start<end)
        {
           sum=arr[start]+arr[end]+arr[i];
           if(sum==target)
           {
            System.out.println(arr[i]+" "+arr[start]+" "+arr[end]);
           }
           if(sum<target) start++;
           else end--; 
        }
    }
    }
}

