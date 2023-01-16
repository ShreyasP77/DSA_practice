/*
Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

There may be duplicates in the original array.

Note: An array A rotated by x positions results in an array B of the same length such that A[i] == B[(i+x) % A.length], where % is the modulo operation.

 

Example 1:

Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].
Example 2:

Input: nums = [2,1,3,4]
Output: false
Explanation: There is no sorted array once rotated that can make nums.
*/

class Solution {
    public boolean check(int[] nums) {
        int count=0;

         for(int i=1; i<nums.length; i++){
            //  why are we doing this because,
            // Intution : there will be only one breakpoint(i.e. nums[i-1]>nums[i] only occur once and after some rotastions it can be sorted consider the example - nums = [3<4<5 ''>'' 1 <2<(3)])
            // Also in case like nums = [2 ''>'' 1<3<4 ''>'' (2)]
            if(nums[i-1]>nums[i]){count++;}
        }

        if(nums[nums.length-1]>nums[0]) count++;
        return count <= 1;// will return false if count exceeds 1 because if it exceeds then  it cannot be sorted by rotating. 
    }
}
