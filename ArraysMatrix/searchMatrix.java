class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       	int start = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int end = rows*cols-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(matrix[mid/cols][mid%cols] == target)
                return true;
            else if(target < matrix[mid/cols][mid%cols])
                end = mid-1;
            else
                start = mid+1;
            
        }
        return false; 
    }
}
