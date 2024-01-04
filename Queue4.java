import java.util.*;
public class Queue4 {
    // java Collection framwork  0(1)
    public static void main(String[] args) {
        //Queue<Integer> q=new LinkedList<>();//  you can use both statementArrayDeque
        Queue<Integer> q=new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
