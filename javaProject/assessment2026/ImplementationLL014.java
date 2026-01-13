package assessment2026;

import java.util.LinkedList;

public class ImplementationLL014 {


    public static class Node{

         int data;
         Node next;
         Node(int data){

             this.data=data;


         }


    }

   public static class LinkedList{

      Node head = null;
      Node tail =null;
      int size =0;

      void insertAtEnd( int val){

          Node temp = new Node(val);

          if(head==null){

              head = temp;


          }else{

                tail.next= temp;




          }

          tail = temp;
          size++;


      }

      void insertAtBeggining(int val){

          Node temp = new Node(val);

          if(head==null){

              head= tail = temp;

          }else{


              temp.next=head;
              head = temp;
          }

        size++;
      }

      void display(){
          Node temp = head;

          while(temp!=null){

              System.out.println(temp.data+" ");
              temp = temp.next;


          }


      }

      int size(){

          Node temp = head;
          int count = 0;
          while(temp!=null){
              count++;
              temp = temp.next;


          }
          return count;

      }

      void insertAT(int idx, int val){
         Node t = new Node (val);
         Node temp = head;
         if(idx==size()){
            insertAtEnd(val);
            return;


         } else if (idx==0) {
             insertAtBeggining(val);
             return;
         }

          for(int i=1; i<=idx-1;i++) {

          temp = temp.next;
          size++;

      }
         t.next=temp.next;
         temp.next=t;

      }

      int getAT(int idx){



          Node temp=head;

         for(int i=1; i<=idx; i++) {
             temp = temp.next;
         }

      return temp.data;
      }


    void   deleteAtIndexMethod(int idx ){

          Node temp = head;

           for(int i=1; i<=idx-1; i++){

               temp = temp.next;

           }
        temp.next = temp.next.next;
        size--;
      }


   }

    public static void main(String args []){

        LinkedList ll = new LinkedList();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);

        ll.insertAtBeggining(6);
        ll.insertAtBeggining(7);
        ll.insertAT(2,14);
        ll.insertAT(3,15);

      //  int sizeOfLL= ll.size();
      // System.out.println(sizeOfLL);

        ll.deleteAtIndexMethod(2);
        ll.display();
       int valueOfNode=  ll.getAT(3);
        System.out.println("Value of Node -- "+"  "+valueOfNode);



    }





}
