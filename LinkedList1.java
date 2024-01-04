import java.util.*;
import java.util.LinkedList;
public class LinkedList1 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        // step1-create new node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        // step2-newNode next=head
        newNode.next=head;// link

        // step3-head=newNode
        head=newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
    if(head==null){
        System.out.println("ll is empty");
        return;
    }
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp = temp.next;
    }
    System.out.println("null");


}// Q 1 add the data
    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return ;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;

        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

// Q 2 remove first element
    public int removeFirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
           int val=head.data;
           head=tail=null;
           size=0;
           return val;
        }
       int val=head.data;
       head=head.next;
       size--;
       return val;
    }

// Q 3 remove last element
    public int removeLast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
             int val=head.data;
             head=tail=null;
             size=0;
             return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }


// Q 4 search key via iteration
    public int itrSearch(int key){ // o(n)
        Node temp=head;
        int i=0;

        while(temp!=null){
            if(temp.data==key){ // key found
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }


// Q 5 search key for 0(n)
    public int helper(Node head,int key){ // 0(n)
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }

// Q 6 search key via recusion
    public int recSearch(int key){
        return helper(head,key);
    }

    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }


// Q 7 delete N th element 
    public void deleteNthFromEnd(int n){
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }

        if(n==sz){
            head=head.next; // remove first
            return ;
        }
        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }


// Q 8 find mid 
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow =slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    

// Q 9 check palidrome
    public boolean checkPalidrome(){
        if(head==null || head.next==null){
            return true;
        }
        Node midNode=findMid(head);

        Node prev=null;
        Node curr=midNode;
        Node  next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;

        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }


// Q 10 detecting cycle 
     public boolean isCycle(){
            Node slow=head;
            Node fast=head;

            while(fast!=null && fast.next!=null){
                slow=slow.next;   // +1
                fast=fast.next.next;  // +2
                if(slow==fast){
                    return true; // cycle exists
                }
            }
            return false;  // cycle doesnot exists
        }

// Q 11 remove cycle
     public static void removeCycle(){
        Node slow =head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        // find meeting point
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;
     }


// Q 12 merge sort
    //  private Node getMid(Node head){
    //        Node slow=head;
    //        Node fast=head.next;
    //        while(fast!=null && fast.next!=null){
    //         slow=slow.next;
    //         fast=fast.next.next;
    //        }
    //        return slow;
    //  }

    //  private Node merge(Node head1,Node head2){
    //     Node mergedLL=new Node(-1);
    //     Node temp=mergedLL;

    //     while(head1!=null && head2!=null){
    //         if(head1.data<=head2.data){
    //             temp.next=head1;
    //             head1=head1.next;
    //             temp=temp.next;
    //         }
    //         else{
    //             temp.next=head2;
    //             head2=head2.next;
    //             temp=temp.next;
    //         }
    //     }
    //     while(head!=null){
    //         temp.next=head1;
    //             head1=head1.next;
    //             temp=temp.next;
    //     }
    //     while(head2!=null){
    //         temp.next=head1;
    //             head1=head1.next;
    //             temp=temp.next;
    //     }
    //     return mergedLL.next;
    //  }
    //  public Node mergeSort(Node head){
    //     if(head==null || head.next ==null){
    //         return head;
    //     }
    //     // find mid
    //     Node mid=getMid();

    //     // left & right MS
    //     Node rightHead=mid.next;
    //     mid.next=null;
    //     Node newLeft=mergeSort(head);
    //     Node newRight=mergeSort(rightHead);

    //     // merge
    //     return merge(newLeft,newRight);
    //  }

// Q 13 zig zag 
     public void zigZag(){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;

        // reverse 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextL,nextR;

        // alt merge zig zag merge
        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }
     }
    
    public static void main(String args[]) {
        LinkedList1 ll = new LinkedList1();
        // Q 1
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(11);
        ll.addLast(18);
        ll.add(2,3);  
        ll.print();

        // Q 2
        ll.removeFirst();
        ll.print();

        // Q 3
        ll.removeLast();
        ll.print();

        // Q 4
        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(10));
        System.out.println(ll.recSearch(3));
         
        // Q 5
        ll.reverse();
        ll.print();

        // Q 6
        ll.deleteNthFromEnd(2);
        ll.print();

        // Q 7
        System.out.println(ll.checkPalidrome());


        // Q 8
        System.out.println(ll.size);

        // Q 10
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        // 1->2->3->1
        System.out.println(ll.isCycle());

        // Q 11
        removeCycle();
        System.out.println(ll.isCycle());

        // Q 12 
        // ll.head=ll.mergeSort(ll.head);
        // ll.print();

        // Q 13 
        ll.zigZag();
        ll.print();
         
    }
}
