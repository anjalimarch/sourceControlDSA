package AlgoAndData;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import  java.util.Set;

public class IterateOverHashMaps {

public static void main (String args []){

    HashMap<Integer, String> dataMap= new HashMap<Integer,String >();
    dataMap.put(1,"Anjali");
    dataMap.put(2, "Mishra");
    dataMap.put(4,"Datacollect");
    dataMap.put(4,"Fuel");
//{1=Anjali, 2=Mishra, 4=Fuel}
    System.out.println(dataMap);

   if(!dataMap.containsKey(5)){
       System.out.println("checking : key is not  present ");

       dataMap.put(5,"Anjali");

       System.out.println(dataMap.get(5));

   }else {
       System.out.println("Key is present ");
       System.out.println(dataMap.get(5));


   }

 for(Map.Entry<Integer, String> e :dataMap.entrySet()){

     System.out.println("key values :"+e.getKey());
     System.out.println("Data Values: "+e.getValue());

    }

 Set<Integer> keys = dataMap.keySet();
 for(Integer key: keys){
     System.out.println(key+" "+dataMap.get(key));
 }

 System.out.println("values: "+dataMap.values());

   String [] a = new String [4];
    Scanner s = new Scanner(System.in);

   for(int i=0; i<a.length;i++){
       String data = s.next();
       a[i]=data;

   }
   for(String b: a){

       System.out.println("array value "+b);

   }


}

}
