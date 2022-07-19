    public String addStrings(String num1, String num2) {
        StringBuilder num3 = new StringBuilder();
            int i=num1.length()-1;
            int j=num2.length()-1;
            int c=0;
            while(i>=0 || j>=0){
                    int a = (i>=0) ? (num1.charAt(i)-'0'):0;
                    int b = (j>=0) ? (num2.charAt(j)-'0'):0;
                    
                    int s = c+a+b;
                    num3.insert(0,s%10);
                    c=s/10;
                    i--;
                    j--;
                    
            }
            
            if(c>0){
                    num3.insert(0,c);
            }
        return num3.toString();
    }
