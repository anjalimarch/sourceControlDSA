package Revision;

import java.util.Arrays;

public class BubbleSortTest {

    public  static void main (String args []){


        int [] bubble={7,8,3,1,2};
        int i, j, temp ;

         i=0;
         j=1;

        for (int e =0; e<=bubble.length-1;e++){
           while(i<=bubble.length-2){
            if(bubble[i]>bubble[i+1]){

               temp =  bubble[i];
                bubble[i]=bubble[i+1];

                bubble[i+1]=temp;

            }
            i++;

           }




        }

        for(int k=0;k<bubble.length;k++){


            System.out.println(bubble[k]);
        }



    }
}
