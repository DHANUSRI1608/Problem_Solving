package Strings.ReplaceWords;
import java.util.*;
class Solution {
    /**
     * @param dictionary
     * @param sentence
     * @return
     */
    public String replaceWords(List<String> dictionary, String sentence) {

        Collections.sort(dictionary, (a, b) -> a.length() - b.length());

        String arr[] = sentence.split(" ");
        String finalarr[] = new String[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            int flag = 0;

            for (int j = 0; j < dictionary.size(); j++) {
                if (arr[i].startsWith(dictionary.get(j))) {
                    finalarr[index++] = dictionary.get(j);
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                finalarr[index++] = arr[i];
            }
        }
        return String.join(" ", finalarr);
    }
}
