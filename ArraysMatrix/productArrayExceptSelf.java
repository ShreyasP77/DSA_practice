 public int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            // int[] leftproducts = new int[n];
            // int[] rightproducts = new int[n];
            int[] opArray = new int[n];
            // leftproducts[0] = 1;
            // rightproducts[n-1] = 1;
           
            // for(int i=1; i<n; i++){
            //         leftproducts[i] = nums[i-1]*leftproducts[i-1];
            // }
            // for(int i=n-2; i>=0; i--){
            //         rightproducts[i] = nums[i+1]*rightproducts[i+1];
            // }
            // for(int i=0; i<n; i++){
            //         opArray[i] = leftproducts[i]*rightproducts[i];
            // }
            
//             More Optimized Soln.
//             nums = [1,2,3,4]
            opArray[0]=1;
//        opArray =             1       0       0       0
            
//        opArray =             1       1       2       6
//             i----=>          0       1       2       3
             for(int i=1; i<n; i++){
                    opArray[i] = nums[i-1]*opArray[i-1];
            }
            int multProduct = 1;
//             nums =           1       2       3       4
//                                  /        /       /
//        multProduct =        24      12       4       1         
//                              x       x       x       x
//        opArray =             1       1       2       6
            
//      NewEntries opArray =    24     12       8       6  
            
//             i----=>          0       1       2       3
            
            for(int i=n-1; i>=0; i--){
                    opArray[i] =multProduct*opArray[i];
                    multProduct = multProduct*nums[i];
            }
            
            
            
        return opArray;
    }
