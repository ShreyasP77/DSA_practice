import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
    int count = 0;
    int rows = n;
    int cols = m;
    int total = rows * cols;
    int curr = 0;
        
        int startingRow = 0;
        int startingCol = 0;

        
        while(count<total){
            
            if(startingRow+1 == rows || startingCol+1 == cols )
                break;
// Store the first elem of next row
            int prev = mat.get(startingRow+1).get(startingCol);
                
//  Move the elements of the first row, print starting row       
            for(int idx = startingCol; idx < cols; idx++){
               count++;
                curr = mat.get(startingRow).get(idx);
                mat.get(startingRow).set(idx,prev);
                prev = curr;
            }
            startingRow++;
          
// print ending Col
            for(int idx = startingRow; idx < rows; idx++){
               count++;
                curr = mat.get(idx).get(cols-1);
                mat.get(idx).set(cols-1,prev);
                prev = curr;
            }
            
            cols--;
            
// print ending row
            if(startingRow <rows ){
            for(int idx = cols-1; idx >= startingCol; idx--){
                count++;
                 curr = mat.get(rows-1).get(idx);
                mat.get(rows-1).set(idx,prev);
                prev = curr;
            }
            }
            rows--;
           
            // print starting row
            if(startingCol < cols ){
            for(int idx = rows-1; idx >= startingRow; idx--){
                count++;
                 curr = mat.get(idx).get(startingCol);
                mat.get(idx).set(startingCol,prev);
                prev = curr;
            }
            }
        startingCol++;
            
        }
    }
}
