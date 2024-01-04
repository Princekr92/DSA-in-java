import java.util.*;
public class StringBuilderCreate {
    public static void main(String[] args) {
        // float t=342.5626f;
        // System.out.println(t);
        // System.out.println('a'+'b'); gives the value is boolean 195
        // System.out.println("a"+"b");   ab
        // System.out.println("a"+1);     b
        // System.out.println((char)('a'+2));  c
        // System.out.println("Prince" + new ArrayList<>());  prince[]
        // System.out.println( "Prince" + new Integer(45));   prince45
        // String ans=new ArrayList<>() +""+ new Integer(45);  []45
        // System.out.println(ans);

        // String series="";
        // for(int i=0;i<26;i++){
        //     char ch=(char)('a'+i);
        //     series=series+ch;
        // }
        // System.out.println(series);

        StringBuilder builder=new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+ i);
            builder.append(ch);
        }
        // second method for 0(logn)
        // while(n>0){
        //     n--;
        //     char ch=(char)('A'+n%26);
        //     ch.insert(0,ch);
        //     n/=26;
        // }
        // return builder.toString;
        
        System.out.println(builder.toString());
        System.out.println(builder.deleteCharAt(0));
        System.out.println(builder.reverse());

    }
}
 

