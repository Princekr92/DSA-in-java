public class recursion15 {
    public static void main(String[] args) {
        // sum of all digit no and also find all digit no of product
        System.out.println(pro(234));
    }
    // static int sum(int n){
    //     if(n==0){
    //         return 0;
    //     }
        //return (n%10)+sum(n/10);
        
         static int pro(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)*pro(n/10);
    }
}
