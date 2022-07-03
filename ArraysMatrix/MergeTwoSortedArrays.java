 public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i=m-1;
        int j=n-1;
//         Dry run
        //          0,1,2,3,4,5                   0,1,2
        // nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        
//      i   j   nums1       nums2   i+j+1   nums1[i+j+1]
//      2   2   3       <   6       5       6           //  [1,2,3,0,0,6]  j-- 
//      2   1   3       <   5       4       5           //  [1,2,3,0,5,6]  j-- 
//      2   0   3       >   2       3       3           //  [1,2,3,3,5,6]  i--
//      1   0   2       =   2       2   1   2   2       //  [1,2,2,3,5,6]  i-- j-- 
//      0   -1 <--exit
        
//         but i not less than zero :.
//         i    i+j+1       nums1        |
//         0    0-1+1=0     1     //    [1,2,2,3,5,6]  
        

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[i+j+1]=nums1[i];
                i--;
            }
            else if(nums1[i]<nums2[j]){
                nums1[i+j+1]=nums2[j];
                j--;
            }
            else{nums1[i+j+1]=nums1[i];
                i--;
                nums1[i+j+1]=nums2[j];
                j--;}
            
        }
        
        while(i>=0){
            nums1[i+j+1]=nums1[i];
                i--;
        }
        while(j>=0){
            nums1[i+j+1]=nums2[j];
                j--;
        }
    }
