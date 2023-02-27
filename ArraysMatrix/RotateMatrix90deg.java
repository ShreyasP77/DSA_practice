class Solution {
    public void rotate(int[][] matrix) {
      for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                int swap = 0;
                swap = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                 matrix[j][i] = swap;
            }
        }
        
//         This is to mirror the matrix or flip thwe matrix according to requirement.
//         Below is the case of vertical flip.
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length/2;j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                 matrix[i][matrix.length-1-j] = temp;
            }
        }
        
//           Below is the case of horizontal flip.
        for(int i=0;i<matrix.length/2;i++){
            for(int j=0;j<matrix.length;j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length-1-i][j];
                 matrix[matrix.length-1-i][j] = temp;
            }
        }
        
    }
