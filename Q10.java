import java.util;
public class Q10 {
    static void minMaxDiff(int arr[],int n,int k){
        //q get min and max difference
        Arrays.sort(arr);
        int ans=arr[n-1]-arr[0];
        int smallest=arr[0]+k;
        int largest=arr[n-1]-k;
        for(int i=0;i<n-1;i++){
        int min=Math.min(smallest,arr[i+1]-k);
        int max=Math.max(largest,arr[i]+k);
        if(min<0)
            continue;
            ans=Math.min(ans,max-min);
        }
        return ans;
        }
        public static void main(String[]args){
            int arr={5,15,13,9};
            //int n=arr.length;
            int k=3;
            int b=minMaxDiff(arr,n,k);
            System.out.print(b);
        }
    
}
