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
      // PLm : adding values in hashmap and printing
        System.out.println(rollNum);
        //PLM: replacing values in hashmap, adding and printing.
        rollNum.put(1, "Mishra");
        System.out.println(rollNum);
        rollNum.put(4, "India");
        rollNum.put(5, "Hyderabad");
        rollNum.put(6, "Nacharam");
        System.out.println(rollNum);

     //PLM:searching value in hashmap on the basis of key.

        if (rollNum.containsKey(5)){
            System.out.println(rollNum.get(5));


        }
  // PLM: if value is null at that key putting value on the same.
        if (!rollNum.containsKey(8)){
            rollNum.put(8, "Biba");

        }
        System.out.println(rollNum);
// PLM: Getting a key set of the values and printing that keyset.
        Set<Integer> keys= rollNum.keySet();
        for (int val : keys){

            System.out.println("values of key in hashmap"+val);

        }
      // PLM: Printing all the values in hashmap.
        System.out.println("values in hashmap"+ rollNum.values());



        //PLM : Entry set in Hashmap : iterate

        for(Map.Entry<Integer, String > e :rollNum.entrySet()){
          // each entry of hashmap key:value
            System.out.println("HashMaps--"+e+" ");
           // all the values in
            System.out.println("HashMaps Values "+e.getValue()+" ");
           // all the keys.
            System.out.println("HashMaps Keys "+e.getKey()+" ");


        }


 // remove the values from hashmap.
        rollNum.remove(1, "Mishra");
        System.out.println("after removal"+rollNum);
    }
}
