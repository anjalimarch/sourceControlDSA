package assessment2026;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest012 {


    public static void main (String args []){

        HashMap<Integer, String> rollNum= new HashMap<Integer, String>();
        rollNum.put(1, "Anjali");
        rollNum.put(2, "pochu");
        rollNum.put(3, "piku");

        System.out.println(rollNum);
        rollNum.put(1, "Mishra");
        System.out.println(rollNum);
        rollNum.put(4, "India");
        rollNum.put(5, "Hyderabad");
        rollNum.put(6, "Nacharam");
        System.out.println(rollNum);

     //search

        if (rollNum.containsKey(5)){
            System.out.println(rollNum.get(5));


        }

        if (!rollNum.containsKey(8)){
            rollNum.put(8, "Biba");

        }
        System.out.println(rollNum);

        //iterate

        for(Map.Entry<Integer, String > e :rollNum.entrySet()){

            System.out.println("HashMaps--"+e+" ");

            System.out.println("HashMaps Values "+e.getValue()+" ");

            System.out.println("HashMaps Keys "+e.getKey()+" ");


        }
    }
}
