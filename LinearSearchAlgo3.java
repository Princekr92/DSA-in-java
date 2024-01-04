public class LinearSearchAlgo3 {
    // Q. search in range
    public static void main(String[] args) {
        int [] arr={12,45,4,5,-8};
        int target=3456;
        System.out.println(linearSearch(arr,target,1,4));

        
    }
    static int linearSearch(int[]arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        // run a for loop
        for(int index= start;index<= end;index++){
           //check for element at every index if it is= target
           int element = arr[index];
           if(element==target){
            return index;

           }  
        }
        // this line excute if none of the return statements above have executed
        //hence the target not found
        return -1;
    }
    
}

    

