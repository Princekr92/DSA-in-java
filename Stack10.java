import java.util.*;
public class Stack10 {
    // duplicate string check
    public static boolean isDuplicate(String str){
        Stack<Character>s=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            // closing
            if(ch==')'){
                int count=0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }
                else{
                    s.pop();
                }
            }
                else{
                    s.push(ch);
                }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="((a+b))";// true 
        String str2="(a-b)";// false
        System.out.println(isDuplicate(str2));
    }

}
