class Solution {
    int print2largest(int arr[], int n) {
        
        if(n==0 || n==1) return -1;
        int secondLargest = -1;
        int largest = -1;
        
        for(int i=0; i<n; i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }
       
        return secondLargest;
    }
}
