//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();

            Solution ob = new Solution();
            int cnt = ob.setBits(N);
            System.out.println(cnt);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
// class Solution {
//     static int setBits(int N) {
//         int count = 0;
//         while(N>0){
//             int i=N%2;
//             N=N/2;
//             count += i;
            
//         }
        
//         return count;
//     }
// }



// Brian Kernighan's Algorithm

// Subtracting 1 from a decimal number flips all the bits after the rightmost set bit(which is 1) 
// including the rightmost set bit. 
// for example : 
// 10 in binary is 00001010 
// 9 in binary is 00001001 
// 8 in binary is 00001000 
// 7 in binary is 00000111 
// So if we subtract a number by 1 and do it bitwise & with itself (n & (n-1)), 
// we unset the rightmost set bit. If we do n & (n-1) in a loop and count the
// number of times the loop executes, we get the set bit count. 
// The beauty of this solution is the number of times it loops is equal to the 
// number of set bits in a given integer.
// Performing AND Bitwise operation ON 'N' and 'N-1' Until N becomes 0000
// It can be observed using the following example that it will always unset 
// the rightmost bit on performing the above operation;
// And in this way we can get rid of all the ones in a Number N as there will  be atleast one 
// bit different in N and N-1 and performing  & bitwise operation will always unset the rigntmost bit.
// 
// 
// Consider an Example:
// N = 8 = 1000

// N-1 = 7 = 0111 

// There is no similarity in both the binary number string that is all the bits are different.
// So it by performing &  bitwise operation on N And N-1 and keeping count will give you the number of ones(set bit)
// in the 

// Loop N > 0
// N = N & (N-1)    1000
//                 &0111
//                 -----
//                  0000
// count++;
// End of Loop


//  n =  9 (1001)
//   count = 0

//   Since 9 > 0, subtract by 1 and do bitwise & with (9-1)
//   n = 9&8  (1001 & 1000)
//   n = 8
//   count  = 1

//   Since 8 > 0, subtract by 1 and do bitwise & with (8-1)
//   n = 8&7  (1000 & 0111)
//   n = 0
//   count = 2

//   Since n = 0, return count which is 2 now.




class Solution {
    static int setBits(int N) {
        int count = 0;
        while(N>0){
            
            N=N & (N-1);
            count ++;
            
        }
        
        return count;
    }
}







