//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	int celeb =0;
    	int j;
    	int celebCount = 0;
    	for(int i=0; i<n; i++){
    	 for(j=0; j<n; j++){
    	    if(M[i][j] == 1)
    	    break;
    	 }
    	 if(j >= n ){
    	 celeb = i;
    // 	 celebCount++;
    	 break;
    	 }
    	}
    
    for(int i=0; i<n; i++){
        if(celeb != i && (M[celeb][i] == 1 || M[i][celeb] == 0))
            return -1;
    }
    	return celeb;
    }
}
