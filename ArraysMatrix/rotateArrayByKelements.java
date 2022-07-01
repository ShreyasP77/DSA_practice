  public void rotate(int[] nums, int k) {
//       nums = [1,2,3,4,5,6,7], k = 3
        int n=nums.length;
        k=k%n;
//         
//     rotate first "0" to (n-k-1 => 7-3-1 )=> "3" elements
       reverse(nums,0,n-k-1);
//         After rotating nums = [4,3,2,1,5,6,7]
        
//     rotate next (n-k => 7-3)=> "4" to (n-1)=> "6" elements   
       reverse(nums,n-k,n-1);
//         After rotating nums = [4,3,2,1,7,6,5]
//     rotate entire array
       reverse(nums,0,n-1);
//         After rotating nums = [5,6,7,1,2,3,4]
        
    }
    public static void reverse(int[] nums,int low, int high){
        while(low<=high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
