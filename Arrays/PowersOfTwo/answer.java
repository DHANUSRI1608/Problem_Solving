import java.util.*;
public class answer {
    public static void main(String args[])
    {
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           if(n > 0 && (n & (n-1))== 0)
           {
            System.out.print("POWER OF TWO");
           }
           else{
            System.out.print("NOT A POWER OF TWO");
           }
    }
}
