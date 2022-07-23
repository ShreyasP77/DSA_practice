class Solution {
//     public List<String> fizzBuzz(int n) {
            
//             List<String> list = new ArrayList<>();
//             int i=1;
//             while(i<n+1){
//                     if(i%5==0 && i%3==0) list.add("FizzBuzz");
//                     else if(i%3==0) list.add("Fizz");
//                     else if(i%5==0) list.add("Buzz");
                    
//                     else list.add(String.valueOf(i));
                    
//                     i++;
//             }
           
//         return list;
//     }
        
        
//         IF THERE ARE MORE MAPPINGS OTHER THAN 3->FIZZ AND 5->BUZZ
        public List<String> fizzBuzz(int n) {
            
            List<String> list = new ArrayList<>();
                
                HashMap<Integer,String> dict = new HashMap<>(){{
                        put(3,"Fizz");
                        put(5,"Buzz");
                }};// mapping to store fizzbuzz mappings
                
                List<Integer> divisors = new ArrayList<>(Arrays.asList(3,5));
            int i=1;
            while(i<=n){
                    String str = "";
                    
                    for(Integer key : divisors){
                       if(i%key == 0){
                               str += dict.get(key);
                       }     
                    }
                    
                    if(str.equals("")) str += Integer.toString(i);
                    
                    list.add(str);
                    
                    i++;
            }
           
        return list;
    }
}
