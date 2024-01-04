import java.util.*;
public class Q5 {
    static void rearrange(int[]a){
        // rearrange the array
        int[]t=new int[a.length];
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>=0)
            t[j++]=a[i];
            if(j==a.length || j==0)
            return;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]<0)
            t[j++]=a[i];
        }
         for(int i=0;i<a.length;i++){
            a[i]=t[i];
         }
        }
        public static void main(String []args){
            int a[]={1,-23,8,-3,0,-5};
            rearrange(a);
            for(int i=0;i<a.length;i++)
                System.out.print(a[i]+" ");
            
     }
}
