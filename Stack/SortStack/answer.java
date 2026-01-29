import java.util.*;

public class answer {
    public static void recurs(Stack<Integer> stc, int x) {
        if (stc.isEmpty() || stc.peek() <= x) {
            stc.push(x);
            return;
        }
        int top = stc.pop();
        recurs(stc, x);
        stc.push(top);
    }

    public static void sort(Stack<Integer> stc) {
        if (stc.isEmpty()) return;
        int top = stc.pop();
        sort(stc);
        recurs(stc, top);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        Stack<Integer> stc = new Stack<>();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            stc.push(val); 
        }

        sort(stc);  // now works without object

        System.out.println("Sorted stack (top to bottom):");
        while (!stc.isEmpty()) {
            System.out.print(stc.pop() + " ");
        }
    }
}
