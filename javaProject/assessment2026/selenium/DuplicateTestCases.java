package assessment2026.selenium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateTestCases {

    static Set<String> dupcase(String[] s){

       Set<String> vis= new HashSet<>();
       Set<String> nVis = new HashSet<>();

       for(String a: s ){

           if(!vis.add(a)){
               nVis.add(a);


           }




       }



    return nVis;

    }

    static List missingTcIds(int [] a, int n ){

        boolean [] m = new boolean[n+1];
        for(int val: a){

            m[val]=true;



        }
       for(int i =0; i<m.length;i++){


           System.out.println("m["+i+"]"+m[i]);
       }


        List missingVal= new ArrayList<>();
       for(int i =1; i<m.length;i++){

           if(!m[i]){

               missingVal.add(i);


           }


       }

      return missingVal;


    }


    static int passPercentage(String [] input){
        int count=0;

        for(String s: input){

            if(s.equals("PASS")){

                count++;

            }

        }

        return (count*100)/input.length;
    }

   static boolean checkIfSUtieIsHealthy(String [] input, int val){

        if(passPercentage(input)>=val){

            return  true;

        }

     return false;

   }




    public static void main (String args []){

        String [] input = {"login","search","login","cart"};

       Set ans =  dupcase(input);
       System.out.println(ans);

       int [] a = {1,2,4,6};
       int n =6;
        List l= missingTcIds(a,n);
        System.out.println(l);

        String [] inputArray = {"PASS","FAIL","PASS","PASS","FAIL"};
       int percen=  passPercentage(inputArray);
        System.out.println(percen);

        boolean healthy=   checkIfSUtieIsHealthy(inputArray,50);
        System.out.println(healthy);



    }
}
