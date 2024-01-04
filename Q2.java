import java.util.Scanner;
import java.util.Arrays;
public class Q2 {
    static void revArray(int a[]){
        int start=0,end=5;
        int e;
        while(start<=end){
        e=a[start];
        a[start]=a[end];
        a[end]=e;
        start++;
        end--;
    }
    for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
}
    public static void main(String[]args){
         int []a=new int[]{23,34,45,56,78,21};
        
        revArray(a);
    }
}

