 public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
            for(int i=0; i<strs.length; i++){
                    while(strs[i].indexOf(prefix)!=0){//This line will check if the prefix string matches with current string if not it returns -1 and if matches it returns 0
                            prefix = prefix.substring(0,prefix.length()-1);//substring will removes the last element.
                            
                    }
            }
            return prefix;
    }
