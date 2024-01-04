public class LinearSearchAlgo1 {
    public static void main(String[]args){
        int [] nums={23,5,4,78,89,4,6,-11};
        // Q. find the index no is 78
        int target=78;
        int ans=linearSearch(nums,target);
        System.out.println(ans);


    }
    // search in the array return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[]arr,int target){
        if(arr.length==0){
            return -1;
        }
        // run a for loop
        for(int index=0;index<arr.length;index++){
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
