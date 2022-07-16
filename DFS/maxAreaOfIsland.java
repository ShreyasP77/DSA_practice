  
         public int dfs(int area,int[][] grid,int i,int j,int row,int col){
//              Base Condition
//              
                if(i<0 || j<0 || i>=row || j>=col || grid[i][j]==0 ) return 0;
                
                area=1;
                grid[i][j]=0;
//              Consider every neighbour and add it to every neighbour. Calculate the area if the element is '1'
                area += dfs(area,grid,i+1,j,row,col);
                area += dfs(area,grid,i-1,j,row,col);
                area += dfs(area,grid,i,j+1,row,col);
                area += dfs(area,grid,i,j-1,row,col);
                return area;
        }
   
        public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
            int row = grid.length;
            int col = grid[0].length;
//          traversing thro' matrix
            for(int i=0; i<row; i++){
              for(int j=0; j<col; j++){
//                  Check if present element is 1.
                    if(grid[i][j]==1){
                            int area = 0;
                          //..Consider the MaxArea returned in every iteration.
                            maxArea = Math.max(maxArea,dfs(area,grid,i,j,row,col));
                    }
                }      
            }
                return maxArea;
          }
       
