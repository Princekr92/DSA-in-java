public class Q13 {
    // marge two sorted arrays
    static void  marge(int M,int N,int a[],int b[]){
        int e;
        for(int i=0;i<M;i++){
            if(a[i]>b[0]){
                e=a[i];
                a[i]=b[0];
                b[0]=e;
                int j=0;
                while((j+1 < N) && (b[j] > b[j+1])){
                    e=b[j];
                    b[j]=b[j+1];
                    b[j+1]=e;
                    j++;
                }
            }
        }
    }
    public static void main(String[]args){
        int a[]={1,2,6,8};
        int b[]={3,5,7};
        int M=a.length;
        int N=b.length;
        marge(M,N,a,b);
        for(int i=0;i<M;i++)
            System.out.print(a[i]+" ");
        for(int j=0;j<N;j++)
        System.out.print(b[j]+" ");
        
    }
}
