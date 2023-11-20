package interviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayRepeatwithEntrySet {

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


      for(Map.Entry <Integer, Integer>mapWith :input.entrySet()){

      //System.out.println(mapWith.getKey()+"-"+mapWith.getValue());

      if(mapWith.getValue()==1){

        //  mapWith.getKey();
          System.out.println(mapWith.getKey());

      }

      }










}



      //     System.out.println(l.get(i));
      //  System.out.println(l);

        }











