/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 

Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
*/

object Solution {
    def singleNumber(nums: Array[Int]): Int = {
    var i = 1
    val a = (nums.toList.sorted)
    val l = a.length-1
    var n = 0 
    if (l == 0) {return a(0)}
    if (a.head != a(1)) {return  a.head}
    if ((l > 0)) {
        if (a(l) != a(l-1)) {return a(l)} 
        }
    for ( i <-1 until l )
         {
            if (a(i) != a(i+1) && a(i) != a(i-1)) {
                     
                     return a(i)
                     }
        }
    return 1   
    }
}