class Solution {
    public int minimumMoves(String s) {

          return minMoves(s,s.length(),0);
       
    }
    
    public static int minMoves(String s, int len, int idx){
       if(len == 0){return 0; }
        
        if(idx >= len){ return 0;}
        if(s.charAt(idx) == 'X'){
            return minMoves(s,len,idx+3) +1;//It returns count how many times finctions is being called.
            
        }
        return minMoves(s,len,idx+1);//If character's not 'X' than move index forward.
            
       
    }
    
}
