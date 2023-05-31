package Day1;
/*  
1768. Merge Strings Alternately
Easy
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.



Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s
Example 3:

Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d


Constraints:

1 <= word1.length, word2.length <= 100
word1 and word2 consist of lowercase English letters.
Accepted
210.5K

 */
class Solution {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder st1 = new StringBuilder("");
        StringBuilder st2 = new StringBuilder("");
        StringBuilder st3 = new StringBuilder("");

        st1.append(word1);
        st2.append(word2);
        int len = Math.min(word1.length(), word2.length());
        for (int i = 0; i < len; i++) {
            st3.append(st1.charAt(0));
            st1.deleteCharAt(0);
            st3.append(st2.charAt(0));
            st2.deleteCharAt(0);
        }
        while (st1.length() > 0) {
            st3.append(st1.charAt(0));
            st1.deleteCharAt(0);
        }
        while (st2.length() > 0) {
            st3.append(st2.charAt(0));
            st2.deleteCharAt(0);
        }
        String ans = st3.toString();
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abcd", "pq"));
    }
}