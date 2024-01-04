import java.util.*;
public class Q3 {
    // find the kth smallest amd lth largest
    static void kthsmallest(Integer a[],int k){
        Arrays.sort(a);
        System.out.println(a[k-1]);
    }
    static void kthlargest(Integer a[],int l){
        Arrays.sort(a,Collections.reverseOrder());
        System.out.println(a[l-1]);
    }
    public static void main(String[]args){
        Integer a[]={34,5,32,45,12};
        int k=3;
        int l=1;
        kthsmallest(a,k);
        kthlargest(a,l);
    }
    
}
