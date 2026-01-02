package assessment2026;

public class LL0013 {


    public static class Node {

        int data;
        Node next;
        Node (int data ){

             this.data = data;
             this.next= null;

        }






    }

    public void addFirst(String data){

    }

    public static void main (String args []){

        LL0013 ll = new LL0013();

        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node (7 );
        Node d= new Node(8);
        //5->3->9->

        a.next=b;
        System.out.println(a.next);
        System.out.println(b);
        System.out.println(b.next);
        System.out.println(c);


    }
}
