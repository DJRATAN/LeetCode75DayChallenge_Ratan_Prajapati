/*
 * 345. Reverse Vowels of a String
 * Easy--
Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
Example 1:
Input: s = "hello"
Output: "holle"
Example 2:
Input: s = "leetcode"
Output: "leotcede"
Constraints:
1 <= s.length <= 3 * 105
s consist of printable ASCII characters.
 */
public class Solution {
    public static String reverseVowels(String s) {
        StringBuilder vowel = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                vowel.append(ch);
            }
        }
        vowel.reverse();
        int j = 0;
        StringBuilder newStr = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                newStr.append(vowel.charAt(j++));
            } else {
                newStr.append(s.charAt(i));
            }
        }
        String ans = newStr.toString();
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }
}
