/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).



Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
* */

object Solution {
    def findMedianSortedArrays(nums1: Array[Int], nums2: Array[Int]): Double = {
            var r: Double = 0.0
    val div:Double = 2.0
    val res = (nums1 ++ nums2).sorted
    /*res.foreach(x => println (x))*/
    if (res.length % 2 == 0) {
      val r1 = (res(res.length/2-1).toDouble)
      val r2 = (res(res.length/2).toDouble)
      r = (r1+r2)/2
      
    }
    if (res.length % 2 == 1) {
      r = (res(res.length/2))
     
    }
    return r
    }
}