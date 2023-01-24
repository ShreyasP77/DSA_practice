/*
Input: matrix = {{1, 2, 3, 4},
                 {5, 6, 0, 7}, 
                 {8, 9, 4, 6},
                 {8, 4, 5, 2}}
Output: {{1, 2, 0, 4}, 
         {5, 0, 20, 0},
         {8, 9, 0, 6}, 
         {8, 4, 5, 2}}
Explanation: As matrix[1][2] = 0, we will
perform the operation here. Then matrix[1][2]
= matrix[0][2] + matrix[2][2] + matrix[1][1] 
+ matrix[1][3] and matrix[0][2] = matrix[2][2] 
= matrix[1][1] = matrix[1][3] = 0.



*/



class Solution
{
    public void  MakeZeros(int[][] matrix)
    {
          
        int[][] vis = new int[matrix.length][matrix[0].length];
        for(int i=0; i<matrix.length; i++ ){
            for(int j=0; j<matrix[0].length; j++ ){
                if(matrix[i][j] == 0){ // Move on to next row as 1 is not encountered and the array is sorted that means the number in the start will only be zero not one so move on to next row .
                    int sum = 0;
                    if(i-1>=0){
                        sum += matrix[i-1][j];
                        vis[i-1][j] = -1;
                    }
                    if(i+1<matrix.length){
                        sum += matrix[i+1][j];
                        vis[i+1][j] = -1;
                    }
                    if(j-1>=0){
                        sum += matrix[i][j-1];
                        vis[i][j-1] = -1;
                    }
                    if(j+1<matrix[0].length){
                        sum += matrix[i][j+1];
                        vis[i][j+1] = -1;
                    }
                    vis[i][j] = sum;
                    
                }
            }
        }
         for(int i=0; i<matrix.length; i++ ){
            for(int j=0; j<matrix[0].length; j++ ){
                if(vis[i][j] == -1){ // Move on to next row as 1 is not encountered and the array is sorted that means the number in the start will only be zero not one so move on to next row .
                    
                    matrix[i][j] = 0;
                    
                }
                if(vis[i][j] > 0){
                    matrix[i][j] = vis[i][j];
                }
            }
        }
    }
}
