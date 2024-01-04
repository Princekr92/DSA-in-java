import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String [] args){
        //syntax
        ArrayList<Integer> list = new ArrayList<>();
        list.add(679);
        list.add(640);
        list.add(675);
        list.add(645);
        list.add(623);
        list.add(652);
        list.add(654);
        list.add(656);
        list.add(679);
         
        // all element print
        System.out.println(list);
        // check element
        System.out.println(list.contains(654));
        //update
        list.set(0, 88);
        System.out.println(list);
        //element remove
        list.remove(2);
        System.out.println(list);

        System.out.println(list.get(4));
        }

        
    
    }
    

