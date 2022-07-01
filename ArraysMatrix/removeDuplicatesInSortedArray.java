  public int removeDuplicates(int[] nums) {
           // 0,1,2,3,4
//      nums=[0,0,1,1,2]
        int i=0;
        int j=1;
        int n=nums.length;
//         n=5
        while(j<n){
            //       0,1,2,3,4   i  j
            // nums=[0,0,1,1,2]  0  1  <---initial state
            // nums=[0,1,1,1,2]  0  2
            // nums=[0,1,1,1,2]  1  3
            // nums=[0,1,1,1,2]  1  4
            // nums=[0,1,2,1,2]  2  5
            //    i=0 0 1 1 2
            //    j=1 2 3 4 5
            // nums[0]==nums[1] j++
            // nums[0]!=nums[2] nums[1]=nums[2] i++ j++
            // nums[1]==nums[3] j++
            // nums[1]!=nums[4] nums[2]=nums[4] i++ j++
            if(nums[i]!=nums[j]){
                
                nums[i+1]=nums[j];
                i++;
            }
            j++;
        }
        // i=2+1 <<- 3 unique elements
    
        return i+1;
    }
