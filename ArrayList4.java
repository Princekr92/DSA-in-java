import java.util.Arrays;

public class ArrayList4 {
    
    // 1 swap method means replace element and fill other element
    public static void main(String [] args){
    //     int [] arr ={1, 3, 23, 9, 18};
    //     swap(arr, 1 ,4);

    //     System.out.println(Arrays.toString(arr));
    // }
    // static void swap(int[] arr,int index1, int index2){
    //     int temp=arr[index1];
    //     arr[index1]=arr[index2];
    //     arr[index2]=temp;
    // }

 
    // 2 reverse the swap
    int [] arr ={1, 3, 23, 9, 18};
         reverse(arr);

        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start =0;
        int end= arr.length-1;
        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
         
    }
    static void swap(int[] arr,int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    
}
