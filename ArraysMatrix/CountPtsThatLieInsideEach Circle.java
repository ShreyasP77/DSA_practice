class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {

        int[] noOfPtsLieInsideCircle = new int[queries.length];

         int count;

        for(int i=0; i<queries.length; i++){
            count = 0;
            for(int j=0; j<points.length; j++){

                    // formula:(a-x)^2 + (b-y)^2 <= r^2 .......... general formula of circle ........ here a and b are the center points of the circle which are given in the queries array a = queries[i][0],b = queries[i][1], r = queries[i][2], x = points[i][0],   y = points[i][1]
                    // the above formula stands true if point lies inside certain particular circle. 
                if((queries[i][0]-points[j][0])*
                  (queries[i][0]-points[j][0])+
                  (queries[i][1]-points[j][1])*
                  (queries[i][1]-points[j][1])
                  <=queries[i][2]*queries[i][2])
                    count++;

                
            } 
          noOfPtsLieInsideCircle[i] = count;  
        }

        return noOfPtsLieInsideCircle;
    }
}
