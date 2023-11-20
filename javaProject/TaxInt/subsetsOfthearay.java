package TaxInt;

import java.util.ArrayList;

public class subsetsOfthearay {


    public static void main(String arr []){
          int [] a= {34,56,78};


      ArrayList<Integer> temp= new ArrayList<Integer>();
     // ArrayList<ArrayList<Integer>> finalSets= new ArrayList<ArrayList<Integer>>();



        pass(a, a.length, 0, temp);

    }

    public static  void pass(int [] a, int n , int i, ArrayList temp){


         if(i==n){
            System.out.println(temp);



             return;
         }
          temp.add(a[i]);
         pass(a, n, i+1,temp);
        temp.remove(temp.size()-1);
         pass(a, n, i+1, temp);
    }
}
