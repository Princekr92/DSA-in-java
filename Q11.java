public class Q11 {
   public static int jump(int []arr){
    //minimum no of jump to reach end of array
    if(arr.length<=1) return 0; 
    int max=arr[0];
    int step=arr[0];
    int jump=1;
    for(int i=0;i<arr.length;i++){
        if(i==arr.length-1) return jump;
        if(i+arr[i]>max) max=arr[i]+i;
        step--;
        if(step==0){
            jump++;
            step=max-i;
        }
    }
    return jump;
   } 
   public static void main(String[]args){
    int arr[]={2,4,3,6,7,9,5,1};
    int j=jump(arr);
    System.out.println(j);
   }
}
