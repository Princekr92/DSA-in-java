public class Q15 {
   static void findComm(int a[],int b[],int c[]){
    // find the common element
    int i=0,j=0,k=0;
    while(i<a.length && j<b.length && k<c.length){
        if(a[i]==b[j] && b[j]==c[k]){
            System.out.print(" " +a[i]);i++; j++; k++;
        }
        else if(a[i]<b[j])
            i++;
        
        else if(b[j]<c[k])
            j++;
        
        else
            k++;
    } 
    }
    public static void main(String []args){
        int a[]={10,23,56,80,92};
        int b[]={4,56,78,80,89};
        int c[]={12,20,56,10,80};
        findComm(a,b,c);
    }
   } 


