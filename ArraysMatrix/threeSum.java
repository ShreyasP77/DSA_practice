import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> outerList = new ArrayList<>();
        int n=nums.length;
        for(int i=0; i<n; i++){
            // duplicate i
            if(i==0 || nums[i-1]!=nums[i]){
                twoSumSorted(nums,i+1,n-1,0-nums[i],outerList);
            }
        }
        return outerList;
        
    }
    public static void twoSumSorted(int[] nums, int l,int r, int target,List<List<Integer>> outerList){
        int a1 = nums[l-1];
        while(l<r){
            if(nums[l]+nums[r]>target)r--;
            else if(nums[l]+nums[r]<target)l++;
            else{
                List<Integer> innerList = new ArrayList<>();
                innerList.add(a1);
                innerList.add(nums[l]);
                innerList.add(nums[r]);
                outerList.add(innerList);
                // duplicate j
                while(l<r && nums[l]==nums[l+1])l++;
                while(l<r && nums[r]==nums[r-1])r--;
                l++;
                r--;
                
            }
        }
    }
}
