import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        //    Boyer Moore's Voting Algorithm.
        int count1 = 0;
        int count2 = 0;
        int element1 = -1;
        int element2 = -1;
         
        for(int arelem:arr){

if(arelem == element1){count1 += 1;}
            else if(arelem == element2){count2 += 1;}
            else{
            if(count1==0){
                element1 = arelem;
                count1 = 1;
                         }
           else if(count2==0){
                element2 = arelem;
                count2 = 1;
            }
            
            else{
                count1 -= 1;
                count2 -= 1;
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList <Integer>();
        count1=count2=0;
       for(int num : arr){

           if(num == element1) count1++;
           else if(num == element2) count2++;
        }

        
        if(count1>arr.size()/3) ans.add(element1);
       if(count2>arr.size()/3) ans.add(element2);

       
        return ans;
    }
}
