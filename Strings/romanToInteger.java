  public int romanToInt(String s) {
            int a,b;
            int res = 0;
//             s="IV"
//             for loop begin
//             i        a       b       res
//             0        1       5       -1
            // exit
            
//             Adding last character Value
//             res = -1 + 5 = 4
        for(int i=0; i<s.length()-1; i++){
                a = getValue(s.charAt(i));
                b = getValue(s.charAt(i+1));
                if(a<b) res-=a; // example case : IV = 5-1
                else res+=a;    // example case : II = 1+1 = 2 or VI = 5+1 = 6
        }
        res+=getValue(s.charAt(s.length()-1));// we are only adding a in the above for loop which will eventually lead to missing out the last character index.
        return res;
    }
    public int getValue(char p){
            if(p=='I') return 1;
            else if(p=='V') return 5;
            else if(p=='X') return 10;
            else if(p=='L') return 50;
            else if(p=='C') return 100;
            else if(p=='D') return 500;
            else return 1000;
    }
