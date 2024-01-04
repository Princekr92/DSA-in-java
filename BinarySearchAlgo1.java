public class BinarySearchAlgo1 {
    public static void main(String [] args){
        int []arr={2,3,4,5,34,66,-1,-56};
        int target=66;
        int ans=binarySearch(arr, target);
        System.out.println(ans);


    }
    //return the index
    static int binarySearch(int[]arr,int target){
        int start=0;
        int end=arr.length -1;

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
        return -1;
    }
    
}
