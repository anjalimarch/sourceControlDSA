package Recursion_2025;

public class LLeniarSearch
{
    public static  void main (String args []) {


        int[] a = {50, 10, 33, 40, 26};

        linearSearch(a, 99);

    }



        public static  int linearSearch(int [] a, int key){
            for(int i=0 ; i<a.length; i++){


                if(a[i]==key ){


                    return i;
                }



            }



            return -1;


        }

}







