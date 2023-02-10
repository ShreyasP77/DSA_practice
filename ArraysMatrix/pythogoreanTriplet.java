
// Check if pythogorean triplwt exists in 
class Solution {    
    boolean checkTriplet(int[] arr, int n) {
        
        for(int i=0; i<n; i++)
            arr[i] = arr[i]*arr[i];
        Arrays.sort(arr);
        // loop to find c
        // Running loop from last element to 3rd element because any how the first two elements will 
        // contribute in forming a and b inside while loop.
      
      for(int c=n-1; c>=2; c--){
          int a = 0;
          int b= c-1;
          while(a<b){
            //      a^2 +   b^2   =  c^2
              if(arr[a] + arr[b] == arr[c])
                return true;
              else if(arr[a] + arr[b] > arr[c])
                b--;
              else a++;
          }
            
      }
       
       
      return false;
    
    
    }
}
