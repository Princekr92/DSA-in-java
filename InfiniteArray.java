public class InfiniteArray {
    public static void main(String[]args){
        
         static  int findTheRange(int[] arr,int target){
            //first find the range
            //first start with a box of size 2
            int start=0;
            int end=1;
            // condition for the target to lie the range
            while(target > arr[end]){
                int newStart=end +1;
                end =end +(end - start +1) * 2;
                start = newStart;
            }

         }
     static int binarySearch(int[]arr,int target,int start,int end){

        while(start <= end){
            //find the middle element
            int mid =start + (end - start) /2;

            if(target < arr[mid]){
                end=mid -1;
            }
            else if(target >arr[mid]){
                start =mid +1;

            }
            else{
                return mid;
            }
        }
    }
        return -1;
    }
}
