class Solution {
    public boolean isAnagram(String s, String t) {
            int[] arr = new int[26];
            for(int i=0; i<s.length(); i++){
                    arr[s.charAt(i)-'a']++;
            }
            for(int i=0; i<t.length(); i++){
                    arr[t.charAt(i)-'a']--;
            }
        
            for(int e:arr){
                    if(e!=0) return false;
            }
            return true;
                            
                            
           
    }
    
}
