class Solution {
    public int[] sortedSquares(int[] nums) {
        // [-4,-1,0,3,10]
        int n=nums.length-1;
        int[] res = new int[nums.length];
        int index = nums.length-1;
        
//         i    n   index   nums[i]^2       nums[n]^2   res[index]
//         0    4   4       16          <   100         100 @ index 4   n-- index--
//         0    3   3       16          >   9           16 @ index 3    i++ index--
//         1    3   2       1           <   9           9 @ index 2     n-- index--
//         1    2   1       1           >   0           1 @ index 1     i++ index--
//         2    2   0       0           =   0           0 @ index 0     n-- index--
//         2    1 exit
//         
        for(int i=0;i<=n;){
            
            if(nums[i]*nums[i]>nums[n]*nums[n]){ 
                res[index] = nums[i]*nums[i];
                index--;
                i++;
               
             }
            else{res[index] = nums[n]*nums[n];
                 n--;
                 index--;
            } 
            
        }
        // Arrays.sort(nums);
        return res;
    }
}
