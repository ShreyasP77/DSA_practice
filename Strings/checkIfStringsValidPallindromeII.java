       private boolean isPalindrome(String s,int i,int j){
                 while(i<j){
                    if(s.charAt(i)==s.charAt(j)){
                            i++;
                            j--;
                    }else{
                            return false;
                    }
            }
            return true;
        }
    public boolean validPalindrome(String s) {
        
            int i=0;
            int j=s.length()-1;
            while(i<j){
                    if(s.charAt(i)==s.charAt(j)){
                            i++;
                            j--;
                    }else{  // try skipping current ith and jth element one by one and again check similarly for rest of the string.
                            return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
                    }
            }
            return true;
        
    }
       
