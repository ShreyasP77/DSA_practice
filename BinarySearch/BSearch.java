
//         Recursive Approach
          public int search(int[] nums, int target) {
            int l=0,r=nums.length-1;
            
            int searched = usingRecursion(nums,l,r,target);
            return searched;

        
    }
        public int usingRecursion(int[] nums, int l, int r,int target){
                if(r>=l){
                        int mid = l+(r-l)/2;
                        if(nums[mid]==target)return mid;
                        else if(nums[mid]<target) return usingRecursion(nums,mid+1,r,target);
                    
                        else return usingRecursion(nums,l,mid-1,target);
                }
                return -1;
        }
        
        
        
//         Iterative Approach
//     public int search(int[] nums, int target) {
//             int l=0,r=nums.length-1;
//             int mid = 0;
            
//             while(l<=r){
//                     mid = l+(r-l)/2;
//                     if(nums[mid]==target) return mid;
//                     else if(nums[mid]<target) l=mid+1;
//                     else r = mid-1;
//             }
//             return -1;
        
//     }
    
