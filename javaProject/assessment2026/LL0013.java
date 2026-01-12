package assessment2026;

public  class LL0013 {


   public static void display(Node head){

        Node temp =head;
        while (temp!=null){

            System.out.println(temp.data);
            temp= temp.next;
        }

    }


    public static void displayr(Node head){


        if (head==null){

            return;
        }

            System.out.println(head.data);
            displayr(head.next);
        }

        public static int length(Node head){
            int count =0;
             while (head!=null){
                 count ++;
                 head=head.next;


             }



         return count;
        }


    public static class Node {

        int data;
        Node next;

        Node(int data) {

            this.data = data;
            this.next = null;

        }

    }


    public static void main(String args[]) {

        //

        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);
        //5->3->9->

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

       /* System.out.println(a.next.data);
        System.out.println(a.next.next);
        System.out.println(b);
        System.out.println(b.next);
        System.out.println(c);
        System.out.println(c.next);
        System.out.println(d);
        System.out.println(d.next);
        System.out.println(e);
        System.out.println(e.next);*/

        displayr(a);
        int len=  length(a);
        System.out.println("length linked list--"+len);
    }

}

