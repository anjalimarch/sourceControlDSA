package interviewQuestions;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayRepeat {

    //{1,2,2,3,5,6}
    //{1,3,5,6}

    public static void main (String args []){

        int [] a = {1,2,2,3,5,6};

        arrayUniqueVal(a);

    }

    public  static void arrayUniqueVal(int [] a){

        ArrayList l = new ArrayList<Integer>();

        HashMap <Integer, Integer> input = new HashMap<Integer, Integer>();

        for(int i: a){

            if(!input.containsKey(i)){

                input.put(i,1);
              //  l.add(i);






            }else{
                input.put(i,input.get(i)+1);




            }





        }

        //System.out.println(input);
//for (Map.Entry <Integer,Integer>data: input.entrySet() ){
//    data.getValue().toString();
//   if (data.getValue()==1){}
//
//    System.out.println(input.entrySet());
//        System.out.println(input.containsValue(2));
//        if(input.containsValue(1)){
//
//            System.out.println(input.keySet());
//
//        }
       // input.containsValue(2);
      //  System.out.println(input.values());
       for (int d: input.keySet()){

          int val= input.get(d);
      if(val==1){

          l.add(d);

       }}


        System.out.println( l );










}



      //     System.out.println(l.get(i));
      //  System.out.println(l);

        }











