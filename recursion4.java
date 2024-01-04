public class recursion4 {
    // find the unique no
    public static void main(String[] args) {
        int arr[]={2,4,3,2,5,7,5,4,3};
        System.out.println(findUnique(arr));
    }
     static int findUnique(int [] arr){
        int unique=0;
        for(int n : arr ){
            unique^=n;
        }
        return unique;
     }
}
