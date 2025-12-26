package Arrays.valid_Parenthesis_substring;

public class Substring2 {
    public boolean checkValidString(String s) {
        int leftMin = 0, leftMax = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                leftMin++;
                leftMax++;
            } else if (c == ')') {
                leftMin--;
                leftMax--;
            } else {
                leftMin--;
                leftMax++;
            }
            if (leftMax < 0) return false;
            if (leftMin < 0) leftMin = 0;
        }
        
        return leftMin == 0;
    }
}

/*class Solution {
    public boolean checkValidString(String s) {
        char arr[]=s.toCharArray();
        int leftbracket=0,rightbracket=0,star=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='(')
            {
                leftbracket++;
            }
            else if(arr[i]==')')
            {
                rightbracket++;
            }
            else if(arr[i]=='*')
            {
                star++;
            }
        }
        //System.out.print(leftbracket+" "+rightbracket+" "+star);
        if(leftbracket==rightbracket)
        {
            return true;
        }
        else if(leftbracket>rightbracket)
        {
            if((rightbracket+star)>=leftbracket)
            {
                return true;
            }
        }
        else if(rightbracket>leftbracket)
        {
            if((leftbracket+star)>=rightbracket)
            {
                return true;
            }
        }
        return false;
    }
}*/ 
