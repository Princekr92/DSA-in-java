import java.util.Scanner;
import java.util.ArrayList;
public class ArrayList2 {
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        //how to take input from user 
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());

        }
        for(int i=0;i<5;i++){
            System.out.print(list.get(i));//paas index here,list{index}syntax will not work here
    }
    
}
}
