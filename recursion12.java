public class recursion12 {
    // find the factor
    public static void main(String[] args) {
        factors2(20);
    }

    static void factors2(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
