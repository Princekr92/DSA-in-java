

public class ArrayList5 {
    // max method
    public static void main(String[]args){
        int [] arr ={1, 78, 4, 9, 5};
        System.out.println(maxRange(arr,1,2));

    }
    static int maxRange(int[] arr,int start,int end){
        int maxVal=arr[start];
        for(int i=1;i<arr.length;i++){
            if(arr[i]> maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;

    }
    
}
