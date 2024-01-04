import java.util.Scanner;
public class Q4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int b0=0,b1=0,b2=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                b0++;
            }
            else if(a[i]==1){
                b1++;
            }
            else{
                b2++;
            }
        }
        int k=0;
        for(int i=0;i<b0;i++) a[k++]=0;
        for(int i=0;i<b1;i++) a[k++]=1;
        for(int i=0;i<b2;i++) a[k++]=2;

        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
