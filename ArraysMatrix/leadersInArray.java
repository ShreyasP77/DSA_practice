class Solution {
    public int[] replaceElements(int[] arr) {
//         [17,18,5,4,6,1]
        int largest = arr[arr.length-1];
//         largest = 1
        arr[arr.length-1] =-1;
//         [17,18,5,4,6,-1]
        for(int i=arr.length-2;i>=0;i--){
            
          int temp = arr[i];
//             temp = 6 4 5 18
            arr[i]=largest;
//             [17,18,5,4,1,-1] i = 4
//             [17,18,5,6,1,-1] i = 3
//             [17,18,6,6,1,-1] i = 2
//             [17,6,6,6,1,-1]  i = 1
//             [18,6,6,6,1,-1]  i = 0
            if(temp>largest)
            {
                
               largest = temp;
//                 largest = 6
//                 largest = 18
            }
            
          
        }
        
        return arr;
    }
}
