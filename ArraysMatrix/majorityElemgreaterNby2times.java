class Solution {
public static int findMajority(int[] arr, int n) {
		 
//         Moore's Voting Algorithm.
        int count = 0;
        int element = 0;
        for(int arelem:arr){
//             Check if count = 0 
//                     1 1 1 5 5 6 5 
//             count = 1 2 3 2 1 0 1
//             element = 1 5

            if(count==0){element = arelem;}
            if(arelem == element){count+=1;}
            else{count-=1;}
        }
        count=0;
       for(int num : arr){
//             1 1 1 5 5 6 5 
//             N N N 1 2 N 3
           if(num == element) count++;
        }
//         count = 3 < n/2=> 7/2=> 3 No not greater.
        
        if(count<=n/2) return -1;
//         therefore return -1
       
        return element;
	}
}
