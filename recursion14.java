public class recursion14 {
    public static void main(String[] args) {
        //find factorial, addition , subtraction
        System.out.println(fact(5));
    }

    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
}
