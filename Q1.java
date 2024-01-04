import java.util.Scanner;
import java.util.Arrays;

public class Q1 {
    //  Q1 find the value of min and max in array
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    System.out.println("minimum value is " + arr[0]);
    System.out.println("maximum value is " + arr[n-1]);
}
}
