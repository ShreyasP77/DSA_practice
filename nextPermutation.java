import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
        int idx = -1;
        int n = permutation.size() - 1;
//         Traverse thro' an array (from back end ) get least value (which is lesser than previous element (traversing from back i.e from right side end))
//         For array [1 5 2 4 3] idx = 4
		for (int i = n; i>0; i--){
            if(permutation.get(i)>permutation.get(i-1)){
                idx = i;
                break;
            }
        }
//         If idx is not altered, means array given is last permutation possible then just reverse it (3,2,1) <==> (1,2,3)
        if(idx == -1){
             Collections.sort(permutation.subList(idx+1,n+1));
   
        }else if(idx != -1){
          int temp;   
//             Again traversing from back elments are arranged in increasing order from back [1 < 5 > 2 < 4 > 3]
        for(int i = n; i>idx-1; i--){
//             Now we just check for the permutation.get(i) > permutation.get(idx-1) i.e. 3 > 2 ?

            if(permutation.get(i) > permutation.get(idx-1)){
               
                temp = permutation.get(idx-1);
                permutation.set(idx-1,permutation.get(i));
                permutation.set(i,temp);
//             Also permutation.get(i) < permutation.get(i-1) is true, we use break before this condition becomes false.
               break;
            }
        }
//             Array => [1 < 5 > 3 < 4 > 2]
//             Now reverse the array 
            Collections.sort(permutation.subList(idx,n+1));  
//             Array => [1  5  3  2  4 ]
        }
        

        return permutation;
        
	}
}
