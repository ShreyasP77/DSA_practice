public class keyPadcombo {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printCombo(String str,int idx,String combo){
       
        if (idx == str.length()){
            System.out.println(combo);
            return;
        }
        char curChar = str.charAt(idx);
        String mapping = keypad[curChar-'0'];

        for (int i = 0; i < mapping.length(); i++) {
            System.out.println(combo);
            System.out.println("Mapping of current str["+idx+"] i.e " +curChar+" --> " + mapping);
            System.out.println("Inside the loop of '"+mapping + "' string and the current index is " + "i..e character = " + mapping.charAt(i));
            printCombo(str,idx+1,combo+mapping.charAt(i));

        }

    }
    public static void main(String[] args){
        printCombo("23",0,"");
    }
}

// OutPut
// Recursion inside loop explained easily

// Mapping of current str[0] i.e 2 --> def
// Inside the loop of 'def' string and the current index is i..e character = d
// d
// Mapping of current str[1] i.e 3 --> ghi
// Inside the loop of 'ghi' string and the current index is i..e character = g
// dg
// d
// Mapping of current str[1] i.e 3 --> ghi
// Inside the loop of 'ghi' string and the current index is i..e character = h
// dh
// d
// Mapping of current str[1] i.e 3 --> ghi
// Inside the loop of 'ghi' string and the current index is i..e character = i
// di

// Mapping of current str[0] i.e 2 --> def
// Inside the loop of 'def' string and the current index is i..e character = e
// e
// Mapping of current str[1] i.e 3 --> ghi
// Inside the loop of 'ghi' string and the current index is i..e character = g
// eg
// e
// Mapping of current str[1] i.e 3 --> ghi
// Inside the loop of 'ghi' string and the current index is i..e character = h
// eh
// e
// Mapping of current str[1] i.e 3 --> ghi
// Inside the loop of 'ghi' string and the current index is i..e character = i
// ei

// Mapping of current str[0] i.e 2 --> def
// Inside the loop of 'def' string and the current index is i..e character = f
// f
// Mapping of current str[1] i.e 3 --> ghi
// Inside the loop of 'ghi' string and the current index is i..e character = g
// fg
// f
// Mapping of current str[1] i.e 3 --> ghi
// Inside the loop of 'ghi' string and the current index is i..e character = h
// fh
// f
// Mapping of current str[1] i.e 3 --> ghi
// Inside the loop of 'ghi' string and the current index is i..e character = i
// fi
// 
// 
// 
// 
// // Leetcode problem
// class Solution {
           
//     public List<String> letterCombinations(String digits) {
//         List<String> combo = new ArrayList<>();
//         String letters2 = "";
//         // len
//         letterCombo(digits,0,combo,"");
//         return combo;
            
//     }

//     public static String[] keypad = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"}; //leters from numbers ranging from 2-9.
//     public static void letterCombo(String digits,int idx, List<String> combo,String letters){
//         if(digits.length()==0){
//             combo.remove(String.valueOf(""));
//               return;
//           }
//         if(idx == digits.length()){
              
//             combo.add(letters);
//                 return;
        
//         }
    
          
//          char curChar = digits.charAt(idx);
//         String mapping = keypad[curChar-'2'];

//         for(int i=0; i<mapping.length();i++){
//            letterCombo(digits,idx+1,combo,letters+mapping.charAt(i));

//         }
        
//     }
// }
