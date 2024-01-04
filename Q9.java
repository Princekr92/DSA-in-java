import java.util.Scanner;
public class Q9 {
    static void maxSubArray(int arr[]){
        // max sub array
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];
            if(currentSum>maxSum)
                currentSum=maxSum;
            
             if(currentSum<0)
                currentSum=0;
        }
            System.out.print(maxSum);
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            maxSubArray(arr);
        }
    }

