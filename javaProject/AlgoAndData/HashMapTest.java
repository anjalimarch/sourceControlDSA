package AlgoAndData;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main (String args []){

        HashMap<String,String> hmap = new HashMap<String,String>();
        hmap.put("name","Anjali");
        hmap.put("name","30");
        hmap.put("sex","NonBinary");
        hmap.put("occupation","Dev");
        hmap.put("level","Dev");

        for (String a: hmap.keySet()){


            System.out.println(a);

        }
       // for(Map.Entry<Integer, String> e :dataMap.entrySet()){
        for(Map.Entry<String,String> e: hmap.entrySet())
        {
          //  e.getKey();
            System.out.println(e.getValue()+"--"+e.getKey());
           // e.getValue();
        }

    }
}
  /*  Java HashMap contains only unique keys.
        Java HashMap may have one null key and multiple null values.
        Java HashMap is non synchronized.
        Java HashMap maintains no order.*/