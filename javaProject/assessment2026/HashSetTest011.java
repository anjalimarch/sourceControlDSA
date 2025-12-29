package assessment2026;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest011 {

    public  static void main (String args []){

        HashSet<Integer> val = new HashSet<Integer>();
        val.add(1);
        val.add(1);
        val.add(12);
        val.add(32);
        val.add(45);
        val.add(54);
        val.add(65);

        //o(1) constant Data Structure

        for(int e: val){

            System.out.println(e);

        }

        if(val.contains(65)){


           System.out.println("set does contain value");

        }

        if (!val.contains(65)){
            System.out.println("set does not contain value");

        }

        System.out.println("size of set--"+val.size());
        Iterator it = val.iterator();


        while(it.hasNext()) {
            System.out.println("keep printing next values "+it.next());

        }


    }



}
