import java.util.Scanner;
public class Q14 {
    // Q best time to buy and sells stoke
    public static void main(String [] args){
       // Scanner sc=new Scanner(System.in);
       // int n=sc.nextInt();
        int a[]={3,5,7,2,6};
        int curr=Integer.MAX_VALUE,profit=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<curr){
            curr=a[i];
            }
            else if(a[i]-curr>profit){
            profit=a[i]-curr;
            }
        }
        System.out.println(profit);
    }
}
