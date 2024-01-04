public class recursion5 {
    public static void main(String[] args) {
        // magic no
        // n=1  0 0 1  --->5=5
        // n=2  0 1 0  --->5*5+ 0=25
        // n=3  0 1 1  --->5*5 + 5=30
        // n=4  1 0 0  --->5*5*5+0+0=125
        int n=7;

        int ans=0;
        int base=5;
        while(n>0){
            int last=n&1;
            n=n>>1;
            ans+=last * base;
            base=base*5;
        }
        System.out.println(ans);
    }

}
