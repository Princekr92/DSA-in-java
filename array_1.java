package java1;
import java.util.Scanner;

public class array_1{
    public static void main(String args[]){
        int n,m,p;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of element in array");
        n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n+1];
        System.out.print("Enter the values");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("enter the no of new value");
        m=sc.nextInt();
        System.out.print("enter new value to be inserted");
        p=sc.nextInt();
        for(int i=0;i<n;i++){

            if(i<m){
                b[i]=a[i];
            }
            else if(i==m){
                b[i]=p;
            }
            else{
                b[i]=a[i-1];
            }
            a[i]=sc.nextInt();
        }
        System.out.print("element are:");
        
        for(int i=0;i<n;i++){
            System.out.println(b[i]);
        }
    }
}