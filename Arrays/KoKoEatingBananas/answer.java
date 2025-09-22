import java.util.*;

class answer {
    public static boolean ispossible(int time,int h,int[] piles){
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + time - 1) / time; 
            if (hours > h) return false; 
        }
        return true;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i=0;i<piles.length;i++){
            if(max<piles[i]){
                max=piles[i];
            }
        }
        int low=1;
        int high=max;
        int lowestTime=0;
        while(low <= high){
            int mid = low + ( high - low )/2;
            if(ispossible(mid,h,piles)){
                high=mid-1;
                lowestTime=mid;
            }else{
                low=mid+1;
            }
        }
        return lowestTime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take number of piles
        System.out.print("Enter number of piles: ");
        int n = sc.nextInt();

        // take pile values
        int[] piles = new int[n];
        System.out.println("Enter pile values: ");
        for(int i=0; i<n; i++){
            piles[i] = sc.nextInt();
        }

        // take total hours h
        System.out.print("Enter hours (h): ");
        int h = sc.nextInt();

        // call function directly without object
        int ans = minEatingSpeed(piles, h);

        System.out.println("Minimum eating speed = " + ans);
    }
}
