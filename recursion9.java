
public class recursion9 {
    public static void main(String[] args) {
        // convert into binary or count how many one present
        int n=345;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
    }

     static int setBits(int n){
        int count=0;

        while(n>0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
}
