public class recursionQuestion1 {
    // sample input:arr[]={3,2,4,5,6,2,7,2,2}, key=2
    // output= 1 5 7 8
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        int key=2;
        allOccurence(arr, key, 0);
    }
    public static void allOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return;
        }

        if(arr[i]==key){
            System.out.println(i+" ");
        }
        allOccurence(arr, key, i+1);
    }
}
