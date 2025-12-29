package assessment2026;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

        Set<Integer> keys= rollNum.keySet();
        for (int val : keys){

            System.out.println("values of key in hashmap"+val);

        }

        System.out.println("values in hashmap"+ rollNum.values());



        //iterate

        for(Map.Entry<Integer, String > e :rollNum.entrySet()){

            System.out.println("HashMaps--"+e+" ");

            System.out.println("HashMaps Values "+e.getValue()+" ");

            System.out.println("HashMaps Keys "+e.getKey()+" ");


        }



        rollNum.remove(1, "Mishra");
        System.out.println("after removal"+rollNum);
    }
}
