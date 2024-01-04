import java.util.*;
public class Stack11 {
    // Max Area in histogram

    public static void maxArea(int arr[]){
        int maxArea=0;
        int s1[]=new int[arr.length];
        int s2[]=new int[arr.length];

        // next smaller right
        Stack<Integer>s=new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&& arr[s.peek()]>=arr[i] ){
                s.pop();
            }
            if(s.isEmpty()){
                s1[i]=arr.length;
            }
            else{
                s1[i]=s.peek();
            }
            s.push(i);
        }
         
        // next smaller left
        s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty()&& arr[s.peek()]>=arr[i] ){
                s.pop();
            }
            if(s.isEmpty()){
                s2[i]=-1;
            }
            else{
                s2[i]=s.peek();
            }
            s.push(i);
        }

        // current area width=j-i-1=s1[i]-s2[i]-1;
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=s1[i]-s2[i]-1;
            int currArea=height*width;
            maxArea=Math.max(currArea, maxArea);
        }
        System.out.println("max area in histogram = " + maxArea);
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};// height in histogram
        maxArea(arr);
    }
}
