
class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int i=0, j=m-1; 
        int rowNo = -1;
        while(i<n && j>=0){
            if(arr[i][j] == 1){ // Move on to next row as 1 is not encountered and the array is sorted that means the number in the start will only be 
                                //zero not one so move on to next row .
                
                rowNo = i;
                j--; 
                
            }else i++;
        }
        
        return rowNo;
    }
}
