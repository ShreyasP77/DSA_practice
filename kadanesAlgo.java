public static long maxSubarraySum(int[] arr, int n) {
	long curSum = 0;
    long maxSum = Integer.MIN_VALUE;
      if(n==0){
          return 0;
      }  
        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i]<0){
              count++;
            }
        }
        if(count == n){
            return 0;
        }
        for(int i=0; i<n; i++){
            curSum += arr[i];
            if(maxSum < curSum){
                maxSum = curSum;
            }
            if(curSum < 0){
                curSum = 0;
            }
        }
        return maxSum;
	}
