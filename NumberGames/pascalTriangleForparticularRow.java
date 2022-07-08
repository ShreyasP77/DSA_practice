 public List<Integer> getRow(int rowIndex) {
        long prev = 1; // nC0 == nCn //3C0
        List<Integer> pascalRow = new ArrayList<>(); 
        pascalRow.add((int)prev);
//         General Formula
//         row = [3C0,3C1,3C2,3C3]
//               [  1,  3,  3,  1]
//         r        prev    cur                     nCr equivalent   pascalRow (already has 1 in it)
//         1        1       1*(3-1+1)/1=3/1         3C1                 3
//         2        3       3*(3-2+1)/2=6/2=3/1     3C2                 3
//         3        3       3*(3-3+1)/3=3/3=1       3C3                 1
        // exit
        for(int r=1; r<=rowIndex;r++){
            long curr = (prev*(rowIndex-r+1))/r;
            pascalRow.add((int)curr);
            prev = curr;
        }
        return pascalRow;
        
    }
