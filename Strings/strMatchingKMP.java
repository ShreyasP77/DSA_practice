//             BRUTE FORCE
    // public int strStr(String haystack, String needle) {
// //             haystack = "hello", needle = "ll" 
//         int h = haystack.length(); // h=5
//         int n = needle.length(); // n=2
//             if(n==0) return 0;
//             if(n>h) return -1;
            
//             int optimum = h-n; // 3 taking the optimum length because it might excced the length while calculating the substring if we simply take the max(h,n) 
            
            
//             for(int i=0; i<=optimum; i++){
//                     if(haystack.substring(i,i+n).equals(needle)){
//                             return i;
//                     }
//             }
//          return -1;   
            
            
    // }
        
        
        
//      KMP ALgorithmic approach 
        
         public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        int[] lps = computeKMPTable(needle);
        int i = 0, j = 0, n = haystack.length(), m = needle.length();
                 
   
        while (i < n) {
            if (haystack.charAt(i) == needle.charAt(j)) {

                i++; j++;
                if (j == m) {

                    return i - m;
                } // found solution
            } else {
                if (j != 0) {
                    System.out.println("\n!"+j+" "+lps[j-1]);
                    j = lps[j - 1];
                } // try match with longest prefix suffix
                else i++; // don't match -> go to next character of `haystack` string
            }
        }
        return -1;
    }
    private static int[] computeKMPTable(String pattern) {
        int i = 1, j = 0, n = pattern.length();

        int[] lps = new int[n];
        while (i < n) {

            if (pattern.charAt(i) == pattern.charAt(j)) {
                j++;
                lps[i] = j;
                i++;
            } else {

                if (j != 0) {
                    j = lps[j - 1];
                } // try match with longest prefix suffix
                else {
                    i++;
                } // don't match -> go to next character
            }

        }
       
        return lps;
    }
        
}
//         DRY RUN EXPLAINED
        
        
//         computeKMPTable
//                   0123              0,1,2,3
//         pattern = aabb       lps = [0,0,0,0]
//         i    j       charAt(i)               charAt(j)       lps[i]  
//         1    0       a               ==      a               1(j++)  // i++              // lps = [0,1,0,0]
//         2    1       b               !=      a               -       // j = lps[1-1] = 0 // lps = [0,1,0,0]
//         2    0       b               !=      a               -       // i++              // lps = [0,1,0,0]
//         3    0       b               !=      a               -       // i++              // lps = [0,1,0,0]
//         4 exit
     
        
        
//         strStr
        
//                                                                     0,1,2,3
//         haystack = aabaabb           needle = aabb   m=4     lps = [0,1,0,0]
        
//         i    j       haystack.charAt(i)              needle.charAt(j)
//         0    0       a                       ==      a       //i++ //j++        
//         1    1       a                       ==      a       //i++ //j++
//         2    2       b                       ==      b       //i++ //j++
//         3    3       a                       !=      b       //j = lps[3-1] = lps[2] = 0
//         3    0       a                       ==      a       //i++ //j++     
//         4    1       a                       ==      a       //i++ //j++
//         5    2       b                       ==      b       //i++ //j++
//         6    3       b                       ==      b       //i++ //j++     j=4 i=7 if j==m :. return i-m=7-4=3         
        
