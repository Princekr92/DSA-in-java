import java.util.*;

public class ArrayList9 {
    // collections.sort()
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
         list.add(5);
          list.add(9);
           list.add(3);
            list.add(11);
            System.out.print(list);
            // ascending order sorting
            // Collections.sort(list);
            // System.out.println(list); 

            // descending order sorting
            Collections.sort(list,Collections.reverseOrder());
            System.out.println(list);

    }
}
