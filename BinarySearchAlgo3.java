public class BinarySearchAlgo3 {

    // floor function
    public static void main(String [] args){
        int []arr={2,3,4,5,34,66,-1,-56};
        int target=66;
        int ans=floor(arr, target);
        System.out.println(ans);


    }
    //return the index
    static int floor(int[]arr,int target){
        if(target > arr[arr.length - 1]){
           return -1; 
        }
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
        return end;
    }
    
}

    

