class Solution {
    public int longestConsecutive(int[] nums) {
        // Ex : nums = [100,4,200,1,3,2]
        if(nums.length==0)
            return 0;
        
        if(nums.length==1)
            return 1;
        
        Arrays.sort(nums); //TC:- O(nLogn)
        // After sorting = [1,2,3,4,100,200]
        
        int longestStreak = 0;
        int length1=1;
        
        
//     i    nums[i+1]   nums[i]   diff  longestStreak   length
//     0    2           1           1       0           2
//     1    3           2           1       0           3
//     2    4           3           1       0           4
//     3    200         100       100       4           1       //else part executed
//        
//        As i=3 == numslength-1 hence exit the loop
//        return lonestStreak
       for(int i=0;i<nums.length-1;i++){
           if(nums[i+1]-nums[i]==1)
               length1 += 1;
           else if(nums[i+1]==nums[i])continue;
           else{
               longestStreak = Math.max(length1,longestStreak);
               length1=1;
           }
        
           
       }
        return Math.max(length1,longestStreak);
        
//         if(nums.length==0)
//             return 0;
        
//         if(nums.length==1)
//             return 1;
        
//         Set<Integer> hashSet = new HashSet<Integer>();
//         for(int num : nums)
//             hashSet.add(num);
        
//         int longestStreak = 0;
//         int length1 = 0;
        
//         for(int num : hashSet){
//             if(!hashSet.contains(num-1)){
//                 length1 = 1;
//             while(hashSet.contains(num+length1)){
                
//                 length1 += 1;
                
//             }
            
//             longestStreak = Math.max(length1,longestStreak);
//         }}
        
//         return longestStreak;
        
   
        
    }
}
