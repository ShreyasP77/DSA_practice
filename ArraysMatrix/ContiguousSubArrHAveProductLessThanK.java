// Given an array of positive numbers, the task is to find the number of possible contiguous subarrays having product less than a given number k.

// BruteForce Method
public int countSubArrayProductLessThanK(long a[], int n, long k){
  int res = 0;
for(int i=0; i<n; i++){
  long p = 1;
  for(int j= i ; j<n; j++){
    p = p*a[j];
    if(p<k) res++;
    else break;
  }
}
return res;
}


// Sliding Window
// a[]  = 1, 2, 3, 4
// k = 10 o/p = 



public int countSubArrayProductLessThanK(long a[], int n, long k){
long p =1;
        int i=0, j=0, ans=0;
         for(;j<n;j++){
             p = p*a[j];
             while(p>=k && i<j){
                 p /= a[i];
                 i++;
             }
             
             if(p<k) ans+= j-i+1;
         }
        return ans;
  
}
