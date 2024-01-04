import java.util.*;
public class Q6 {
    // static void Union(int a[],int b[],int n,int m){
    //     // find the union
    //      int i=0,j=0; 
    //      while(i<n & i<m)
    //         if(a[i]<b[j])
    //           System.out.print(a[i++]+" ");
    //         else if(a[i]>b[j])
    //           System.out.print(b[j++]+" ");
    //           else{
    //             System.out.print(b[j++]+" ");
    //             i++;
    //           }
    //          while(i<n){
    //           System.out.print(a[i++]);
    //         }
              static void Intersection(int a[],int b[],int n,int m){
                // find the union
                 int i=0,j=0; 
                 while(i<n & i<m){
                    if(a[i]<b[j])
                      i++;
                      
                    else if(a[i]>b[j])
                      j++;
                      
                      else{
                        System.out.print(b[j++]+" ");
                        i++;
                      
                      } 
                 }
                }
              
                 public static void main(String []args){
                    int a[]={1,3,5,6,7,8};
                    int b[]={1,2,3,5,6,7,8};
                    int n=a.length;
                    int m=b.length;
                   // Union(a,b,n,m);
                    System.out.println("intersection");
                    Intersection(a,b,n,m);
                 }
                }
            

