    public int findPeakElement(int[] arr) {
        int s=0;
            int e=arr.length-1;
            int mid;
            while(s<e){
                    mid = s+(e-s)/2;
                    if(arr[mid] < arr[mid+1]) s=mid+1;
                    else e=mid;
            }
            return s;
    }
        
//         DRY RUN
//                 0,1,2,3,4,5,6
//         nums = [1,2,1,3,5,6,4] 
                           
//         s    e       mid     arr[mid]                arr[mid+1]      
//         0    6       3       3               <       5               //s=mid+1
//         4    6       5       6               >       4               //e=mid
//         4    5       4       5               <       6               //s=mid+1
//         5    5 end
//         return index = 5 [arr[5] = 6]
}
