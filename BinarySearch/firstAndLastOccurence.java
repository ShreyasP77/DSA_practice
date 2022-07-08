class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n= nums.length;
        int[] arr ={-1,-1};
       if(n==0 || target<nums[0] || target>nums[n-1]) return arr;
        
        arr[0] = firstOccurence(nums,target);
        arr[1] = lastOccurence(nums,target);
        return arr;
    }
    public int firstOccurence(int[] nums, int target){
        int ans = -1;
        int s = 0;
        int e = nums.length-1;
        int mid = s+((e-s)/2);
        while(s<=e){
            if(nums[mid] == target){
                ans=mid; // it will stop at index 2 if e=mid-1 is not being done                    |
                e = mid-1; // to check if there's an occurrence earlier in the array for e.g nums[01112] target = 1
            }else if(nums[mid]>target) e = mid-1;
            else if(nums[mid]<target) s = mid+1;
            mid = s+(e-s)/2;
        }
        return ans;
    }
    public int lastOccurence(int[] nums, int target){
        int ans = -1;
        int s = 0;
        int e = nums.length-1;
        int mid = (s+(e-s)/2);
        while(s<=e){
            if(nums[mid] == target){
                ans=mid; // it will stop at index 2 if s=mid+1 is not being done                    |
                s = mid+1; // to check if there's an occurrence in the later stage of an array for e.g nums[01112] target = 1
            }else if(nums[mid]>target) e = mid-1;
            else if(nums[mid]<target) s = mid+1;
            mid = s+(e-s)/2;
        }
        return ans;
    }
}
