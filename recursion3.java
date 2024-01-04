public class recursion3 {
    // find the even or odd
    public static void main(String[] args){
       int n=54;
       System.out.println(isEven(n));
    }

    static boolean isEven(int n){
        return (n & 1)==0;
    }
}
