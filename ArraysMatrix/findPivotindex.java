 public int pivotIndex(int[] nums) {
       int rSum = 0;
//         nums = [1,7,3,6,5,6]
//         rSum = 0+1+7+3+6+5+6 = 28
        for(int i=0; i<nums.length;i++){
            rSum += nums[i];
        }
        
        int lSum = 0;
//         i    lSum        rSum
//         0    1       !=  28-1
//         1    8       !=  27-7
//         2    11      !=  20-3
//         3    17      ==  17  return 3
        for(int i=0; i<nums.length; i++){
            lSum += nums[i];
            if(lSum == rSum)return i;
            rSum -= nums[i];
        }
      
        return -1;
    }
