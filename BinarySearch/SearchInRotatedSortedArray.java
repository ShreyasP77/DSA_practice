class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
//         nums = [4,5,6,7,0,1,2], target = 0
//         low  high    mid     target    nums[low]   nums[mid]   nums[high]
//         0    6       3       0               4       7               2   low = 3+1      //left part sorted
//         4    6       5       0               0       1               2   high= 5-1      //leftpart sorted
//         4    4       4       0               0       0               0       found
        while(low<=high){
            int mid =low+(high-low)/2;
            if(nums[mid]==target) return mid;
            
            if(nums[low]<=nums[mid]){ //i.e. left part of the array is sorted
                if(target>=nums[low] && target<nums[mid]) high=mid-1;
                else low=mid+1;
            }else{  // i.e. right part is sorted
              if(target>nums[mid] && target<=nums[high]) low=mid+1;
                else high=mid-1;  
            }
        }
        return -1;
    }
}
