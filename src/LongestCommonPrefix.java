/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".


Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
*/
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"}; //fl
        String result = longestCommonPrefix(strs);
        System.out.println(result);
    }

    public static String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (len == 0)
            return "";
        int minlen = 0x7fffffff;
        /* 0x7FFFFFFF is a number in hexadecimal (2,147,483,647 in decimal)
           that represents the maximum positive value for a 32-bit signed binary integer.
        */
        for (String str : strs)
            minlen = Math.min(minlen, str.length());
        for (int j = 0; j < minlen; ++j)
            for (int i = 1; i < len; ++i)
                if (strs[0].charAt(j) != strs[i].charAt(j))
                    return strs[0].substring(0, j);
        return strs[0].substring(0, minlen);
    }
}
