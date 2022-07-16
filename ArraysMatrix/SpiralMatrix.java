 int startingRow = 0;
            int endingRow = matrix.length-1;
            int startingCol = 0;
            int endingCol = matrix[0].length-1;
            int total = (endingRow+1) *(endingCol+1);
            int count = 0;
            
            List<Integer> list = new ArrayList<>();
            
              //matrix =[[1,2,3],
             //          [4,5,6],
            //           [7,8,9]]
//             
            while(startingRow<=endingRow && startingCol<=endingCol){
           
//          printing first row
            for(int i=startingCol; i<=endingCol;i++){
                    list.add(matrix[startingRow][i]);
            }
            startingRow++;// so that last element of first row is not included again in the array
//          list = [1,2,3]  => next run => list = [1,2,3,6,9,8,7,4,5]

//          printing ending column
            for(int i=startingRow; i<=endingRow;i++){
                    list.add(matrix[i][endingCol]);
            }
            endingCol--;// so that last element of last column is not included again in the array
//          list = [1,2,3,6,9]
                    
//          printing ending row
            if(startingRow<=endingRow){
            for(int i=endingCol; i>=startingCol;i--){
                    list.add(matrix[endingRow][i]);
            }}
            endingRow--;// so that first element of last row is not included again in the array
//          list = [1,2,3,6,9,8,7]
               
            if(startingCol<=endingCol){
            for(int i=endingRow; i>=startingRow;i--){
                    list.add(matrix[i][startingCol]);
            }}
            startingCol++;
//          list = [1,2,3,6,9,8,7,4]
                    
            }
            
                    
        return list;
    }
