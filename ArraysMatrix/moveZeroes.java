class Solution {
    public void moveZeroes(int[] nums) {
        // nums = [0,1,0,3,12]
        int index = 0;
        int count = 0;
        int n= nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]!=0){
              
                nums[index] = nums[i];
                index++;
            }
            else{count++;}
        }
        
        // WorkFlow of above for loop 
        //      i   nums[i]  nums[index]    index   count
        //      0       0                   0       1          //'0' found hence count++
        //      1       1    nums[0]=1      1       1          // if statement executed.
        //      2       0                   1       2
        //      3       3    nums[1]=3      2       2
        //      4       12   nums[2]=12     3       2
        
        // count = 2 
        // nums = [1,3,12,3,12]    // After for loop
        while(count>0){
            nums[n-count] = 0;
                count--;
        }
        // WorkFlow of above while loop
        //  Changing these two elements            ? ?
        //                                  0,1,2 ,3,4
        //                          nums = [1,3,12,3,12]  
        //  count   index position = 'n-count'
        //  2           5-2 = 3
        //  1           5-1 = 4
        //  0 <--- stop
        // nums = [1,3,12,0,0]
    }
}
