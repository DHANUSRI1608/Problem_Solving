package Strings.LongestPallindromicSubstring;

public class answer{
    public static boolean ispallindrome(String s, int left, int right) {
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            right--;
            left++;
        }
        return true;
    }

    public static String longestPalindrome(String s) {
        String answer = "";
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (ispallindrome(s, i, j) && j - i + 1 > max) {
                    max = j - i + 1;
                    answer = s.substring(i, j + 1);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String result = longestPalindrome(s);
        System.out.println("Longest Palindromic Substring: " + result);
    }
}
