/*
Input:
A[] = {1, 2, 4, 5, 7}
B[] = {5, 6, 3, 4, 8} 
X = 9 
Output: 
1 8
4 5 
5 4
Explanation:
(1, 8), (4, 5), (5, 4) are the
pairs which sum to 9.
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
*/

class Solution {
    public pair[] allPairs( long A[], long B[], long N, long M, long Sum) {
        ArrayList<pair> ans = new ArrayList<>();
        HashSet<Long> set = new HashSet<Long>();
        for( long j: B) set.add(j);
        Arrays.sort(A);
        for(int i=0; i<A.length; i++){
            if(set.contains(Sum - A[i]))
                ans.add(new pair(A[i],Sum-A[i]));
        }
        pair[] ans1 = new pair[ans.size()];
        return ans.toArray(ans1);
    }
}
