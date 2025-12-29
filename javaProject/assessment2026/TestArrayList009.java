package assessment2026;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestArrayList009 {
    // Array List
    public static void main (String args []){


        //primitive and objects in arrays
        // array list object  - heap
        // add
        //get
        //delet / remove
        //iterate/ opertaions
        ArrayList <Integer> list = new ArrayList<Integer>();
        ArrayList <String > names = new ArrayList<String>();

        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 3);

        System.out.println(list);
        list.set(1,43);
        list.remove(2);
        System.out.println(list);
      //  list.size();
        System.out.println(list.size());


        for(int i= 0; i<list.size(); i++){


           // System.out.println(list.get(i));

            Collections.sort(list);
            System.out.println(list.get(i));
        }
    }


}
