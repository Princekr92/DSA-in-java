public class CyclicSort02 {
    public static void main(String[] args){
    int arr[]={4,0,2,1,3,6};
    System.out.println(missingNumber(arr));
    }
   public static int missingNumber(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length && arr[correct]!=arr[i]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index){
                return index;
            }
        }
        return arr.length;

    }
   public static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
