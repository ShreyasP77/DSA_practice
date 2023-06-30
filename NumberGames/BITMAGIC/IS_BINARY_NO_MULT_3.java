class Solution {
    int isDivisible(String s) {
        int sum = 0;
        int x=1;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                if(i%2 == 1){
                    sum += 1; 
                }else{
                    sum +=2;
                }
            }
        }
        
        return sum%3 == 0 ? 1:0;
    }
}


// Explanation 

// Consider a number 21 =    |  1 | 0 | 1 | 0 | 1 |   <-- Binary
//                           | 16 | 8 | 4 | 2 | 1 |   <-- Decimal equivalent
// Divide the numbers   |      / \     / \     / \
// equivalent to 1      |   15%3| 1  3%3| 1  0%3| 1
// in the following     |   =0  |    =0 |    =0 |
// way where one number |
// will be completely   |   From here an observation can be made that LHS is always divisible by 3 if we add
// divisible by 3 and 1 |   them up 15 + 3 + 0 = 18 will also be divisible by 3 
// is remainder after   |   The concerning part is the remainder at the RHS part  
//dividing the original |   Lets add that up 1 + 1 + 1 = 3 and 3%3=0 which is divisble by 3  
//number by 3           |   From here a conclusion can be drawn is that,
//                      |   if after adding the remainders of all the decimal equivalents of the binary 
//                      |   string where 1 is present and hence we can check if the number formed on adding 
//                      |   is divisible by 3 or not.
//                      |   Because if the remainder's addition is divisible by 3 than the entire number will 
//                      |   be divisible by 3
                        
//                      o   e   o       e   o
// Now consider 22 = |  1 | 0 | 1 |     1 | 0 |
//                   | 16 | 8 | 4 |     2 | 1 |
//                     / \     / \     / \
//                  15%3| 1  3%3| 1  0%3| 2
//                  =0  |    =0 |    =0 |
//              Adding RHS Part,
//                              15 + 3 + 0 = 18 % 3 = 0 YES  
//              Adding LHS Part,
//                              1 + 1 + 2  = 4 % 3 =  1 NO, :. Not Divisible 3, 
//                                                             which thereby stands true, bcoz 18+4=22%3=1 


// After Carefully observing the pattern it can be notice that if ONE(1) is appearing at the odd position the 
// remainder of the decimal equivalent will always be one(1). AND if ONE(1) Appears at the even position the 
// remainder of the decimal equivalent will always be two(2).
                   
                   
// So now the problem gets reduced to finding out just the two possibilities whether 1 appears at odd OR even position
// And the remainder of that has only two possible outcomes whether it can be 1 or 2 respectivily depending 
// on the position of 1 in a binary string 

// PSuedo Code 
// Loop i=0 -=> s.length() - 1
// if s[i] == 1
//      then check if i % 2 == 1 i.e odd position
//              then add 1 to your sum
//              else
//              then add 2 to your sum
// Loop exit
// Check if sum is divisible by 3 now.
                        
                       
                        
                        
