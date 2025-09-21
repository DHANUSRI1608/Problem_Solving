package Strings.SumOfBeauty;
import java.util.*;
public class answer {
    static int sum = 0;  // make sum static

    public static void answer(String s, int start, int end) {
        int freq[] = new int[26];
        for (int i = start; i <= end; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int max = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                if (freq[i] > max) max = freq[i];
                if (freq[i] < min) min = freq[i];
            }
        }

        int finalanswer = max - min;
        if (finalanswer > 0) {
            sum += finalanswer;
        }
    }

    public static int beautySum(String s) {
        sum = 0; // reset before each call
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                answer(s, i, j);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int result = beautySum(s);
        System.out.println("Beauty Sum: " + result);
    }
}


