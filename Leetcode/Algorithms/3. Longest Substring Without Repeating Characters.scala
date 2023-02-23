/*Given a string s, find the length of the longest 
substring
 without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
*/

object Solution {
    def lengthOfLongestSubstring(s: String): Int = {
    var len = 0
    if (s.length == 0 ) {return 0}
    var smax: String = s(0).toString
    var scur: String = ""
    for (i <-0 until s.length)
      {
        if (scur contains(s(i))) {
          scur = scur.substring(scur.indexOf(s(i))+1) + s(i)
        }
        else {scur = scur + s(i)}
        if(scur.length > smax.length) {smax = scur}
      }
    len = smax.length
    return len
    }

}

