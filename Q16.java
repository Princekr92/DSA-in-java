public class Q16 {
    static long maxfactor(int a[],int n){
        if(n==0)
        return 0;
        long res=1,max=1,min=1;
        for(int i=0;i<n;i++){
            if(a[i]>0){
                max*=a[i];
                min=Math.min(a[i]*min,1);
            }
            else if(a[i]==0)
            max=min=1;
            else{
                min+=max-(min=max);
                min*=a[i];
                max=Math.max(1,a[i]*max);

            }
            res=Math.max(max,res);
        }
        return res;
    }

    public static void main(String[]args){
        int a[]={6,-3,-10,5,9,8};
        int n=a.length;
        System.out.print(maxfactor(a,n));
    }
    
}

