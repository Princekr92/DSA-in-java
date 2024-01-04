import java.util.*;
public class Queue6 {
    // Q first non-repeating letter in a stream of characters
    // input ..... a  a  b c c x b
    // output......a -1  b b b b x

    // input     output
    // a           a
    // aa         -1
    // aab         b
    // aabc        b
    // aabcc       b
    // aabccx      b
    // aabccxb     x

    public static void printNonRepeating(String str){
        int freq[]=new int[26];
        Queue<Character>q=new LinkedList<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;

            while(!q.isEmpty() && freq[q.peek()-'a'] > 1){
                q.remove();
            }

            if(q.isEmpty()){
                System.out.println(-1+" ");
            }
            else{
                System.out.println(q.peek()+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String str="aabccxb";
        printNonRepeating(str);
    }
}
