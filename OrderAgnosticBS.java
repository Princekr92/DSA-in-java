public class OrderAgnosticBS {
    public static void main(String []args){
        int arr[]={-12,5,16,36,57,64,69,78};
        int target=5;
        int ans=orderAgnosticBS(arr,target);
        System.out.println(ans);

    }
    static int orderAgnosticBS(int[] arr,int target){
        int start=0;
        int end=arr.length -1;
        boolean isAsc=arr[start]<arr[end];

        while(start <= end){
            // find the middile element
            //find the whether the array is sorted in ascending or descending
             

            int mid =start + (end - start) /2;

            if(arr[mid]==target){
                return mid;
            }
             if(isAsc){
            if(target < arr[mid]){
                end=mid -1;
            }
            else {
                start =mid +1;

            }
        }
            else{
                if(target > arr[mid]){
                    end= mid -1;
                }
                else {
                    start =mid +1;
    
                }
            }
        }
        return -1;
        
    }
}   

