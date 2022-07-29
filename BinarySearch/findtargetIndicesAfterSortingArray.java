class Solution {
//         APPROACH 1: SORTING AND BINARY SEARCH
//                           sorting     firstOcc       lastOcc     firstOcc-lastOcc
//         Time Complexity : O(NlogN)   + O(logN)    +  O(logN)   + O(first-last) 
//                                      O(NlogN + 2logN + k) ==> O(NlogN)
//     public List<Integer> targetIndices(int[] nums, int target) {
//             Arrays.sort(nums);
//             List<Integer> list = new ArrayList<>();
            
//             int last = lastOccurence(nums,target);
//             int first = firstOccurence(nums,target);
            
//             if(last-first == 0 && first!= -1 && last!= -1){ // if the target number is present at only one location and has no duplicate.
//             list.add(first);
//             }else if(first == -1 || last == -1){
//             return list; // return empty list
//             }else{
//             for(int i=first; i<=last; i++){
//                 list.add(i);
//             }
//         }
        

//         return list;
              
//     }
//     public int firstOccurence(int[] nums, int target){
//         int ans = -1;
//         int s = 0;
//         int e = nums.length-1;
//         int mid = s+((e-s)/2);
//         while(s<=e){
//             if(nums[mid] == target){
//                 ans=mid; // it will stop at index 2 if e=mid-1 is not being done                    |
//                 e = mid-1; // to check if there's an occurrence earlier in the array for e.g nums[01112] target = 1
//             }else if(nums[mid]>target) e = mid-1;
//             else if(nums[mid]<target) s = mid+1;
//             mid = s+(e-s)/2;
//         }
//         return ans;
//     }
//     public int lastOccurence(int[] nums, int target){
//         int ans = -1;
//         int s = 0;
//         int e = nums.length-1;
//         int mid = (s+(e-s)/2);
//         while(s<=e){
//             if(nums[mid] == target){
//                 ans=mid; // it will stop at index 2 if s=mid+1 is not being done                    |
//                 s = mid+1; // to check if there's an occurrence in the later stage of an array for e.g nums[01112] target = 1
//             }else if(nums[mid]>target) e = mid-1;
//             else if(nums[mid]<target) s = mid+1;
//             mid = s+(e-s)/2;
//         }
//         return ans;
//     }  
        
        
        
        
//         TC - O(N) solution 
        
        
         public List<Integer> targetIndices(int[] nums, int target) {
            
            List<Integer> list = new ArrayList<>();
                 int freq = 0;
                 int numlessthanT = 0;
                 // nums = [1,2,5,2,3], target = 3
//                  i   nums[i]         numlessthanT    freq
//                  0   1               1               0       
//                  1   2               2               0
//                  2   5               2               0
//                  3   2               3               0
//                  4   3               3               1
                 for(int i=0; i<nums.length; i++){
                         if(nums[i]==target) freq++;
                         else if(nums[i]<target) numlessthanT++;
                 }
                 
                 
//                  i   numlessthanT    list.add()
//                  1   3               3
//                  2   exit
                 for(int i=1; i<=freq;i++){
                         list.add(numlessthanT);
                         numlessthanT++;
                 }
            
        

        return list;
              
    }
}
