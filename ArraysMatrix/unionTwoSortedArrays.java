


import java.util.*;
import java.io.*;
import java.lang.*;

class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
         int i=0, j=0;
        while(i<n && j<m){
//           Sorting and putting the elements in the arraylist.
            if(arr1[i] <= arr2[j]){ 
                if(ans.size() == 0 || ans.get(ans.size()-1) != arr1[i]) // checking the peek or the end element of arrayList with the current element of arr1
                                                                        // because it is sorted.
                    ans.add(arr1[i]);
                i++;
            }else {
                if(ans.size() == 0 || ans.get(ans.size()-1) != arr2[j])
                    ans.add(arr2[j]);
                j++;
            }
            
        }
        
        while(i<n){
           if(ans.size() == 0 || ans.get(ans.size()-1) != arr1[i])
                ans.add(arr1[i]);
            i++; 
        }
        
        while(j<m){
            if(ans.size() == 0 || ans.get(ans.size()-1) != arr2[j])
                ans.add(arr2[j]);
            j++;
        }
        
        return ans;
    }
}



