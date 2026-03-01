package assessment2026.Recursion;

public class RecursionTest {


   static  void printFibo(int n, int a, int b  ){
       if(n==0){

           return;


       }

       int c = a+b;

       System.out.println(c);
       printFibo(n-1, b, c );
   }

   static  int printXpowerN(int x, int n ){

       if(n==0){ //base case 1

           return 1;

       }


       if(x==0){ //base case 2

           return 0;

       }


       int xPow1= printXpowerN( x,  n-1 );

       int xPow= x*xPow1;

       return xPow;



   }


    static  int prinCalPower(int x, int n ){

        if(n==0){ //base case 1

            return 1;

        }


        if(x==0){ //base case 2

            return 0;

        }

        if(n%2==0) {

            return prinCalPower(x, n / 2) * prinCalPower(x, n / 2);

        }else{

            return prinCalPower(x, n / 2) * prinCalPower(x, n / 2) *x;


        }






    }

    static void towerOfHanoi(int n , String src , String helper, String dest ){

       if(n==1){

           System.out.println("Transfer disk"+n+"from"+ src+" "+dest);

           return;


       }


        towerOfHanoi( n-1 , src , dest, helper);

        System.out.println("Transfer disk"+n+"from"+ src+" "+dest);

        towerOfHanoi( n-1 , helper, src, dest);


    }

    static void  reverseString(String s , String newS, int n ){

       if(n==0){
           newS=   newS+ s.charAt(n);

           System.out.println(newS);
           return;

       }


       ;

        reverseString( s , newS=   newS+ s.charAt(n),  n-1 );




    }

    public static int   first = -1;
    public static int    last =-1;
    public static void occurOfFirstAndLast(String s, char element,  int idx ) {

        if(idx==s.length()){



            System.out.println(first+" "+last);

            return;


        }

     char  currChar= s.charAt(idx);

     if(currChar==element){


         if(first==-1){


             first= idx;
         }
         else  {

             last = idx;
         }

     }

     occurOfFirstAndLast(s, element,idx+1);


    }


    public static boolean sortedAndStrinctlyInc (int [] a, int idx ){

        if(idx == a.length-1){



            return true;


        }



        if(a[idx]<a[idx+1]){

            return sortedAndStrinctlyInc(a, idx+1);



        }else{

            return false;

        }






    }


    public static void  moveAllToEnd(String s, int idx, String newS, int count){


        if(idx==s.length()){
            for(int i =0; i<count; i++){

                 newS= newS+'x';


            }
            System.out.println(newS);
            return;

        }





        char val = s.charAt(idx);


        if(val=='x'){
         count= count+1;

           moveAllToEnd(s, idx+1, newS, count);


        } else {

            moveAllToEnd(s, idx+1, newS+val, count);

        }





    }



    public static  boolean [] m  = new boolean[26] ;


    public static void removeDuplicatFromString(String s, String newS, int idx  ){

        if(idx==s.length())
        {


            System.out.println(newS);

            return ;
        }

        char currChar= s.charAt(idx);

     if(!m[currChar-'a'])   {

         m[s.charAt(idx)-'a']=true;

         removeDuplicatFromString(s, newS+s.charAt(idx), idx+1);




     }else{

         removeDuplicatFromString(s, newS, idx+1);


     }








    }


    public static void  printAllSub(String s, String newS, int idx ){


        if(s.length()==idx){

            System.out.println(newS);
            return;

        }
        char currChar = s.charAt(idx);

        printAllSub(s, newS+currChar, idx+1);
        printAllSub(s, newS, idx+1);


    }




    public static void main (String args [] ){
        RecursionTest r = new RecursionTest();
        int a=0; int b=1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printFibo(n-2, a,b);
        int ans=     printXpowerN( 2,5);
        System.out.println(ans);

        int updans = prinCalPower(2,6);
        System.out.println(updans);

        towerOfHanoi(3, "A", "B", "C");

        String s= "abcde";

        reverseString(s,  " ", s.length()-1 );

        String s1= "abaacdaefaah"; // occur of a/ from last and first
        occurOfFirstAndLast("rudranshtaa" , 'a', 0);//o(n)
        //checkIf Array is sorted strictly incereasing

        int [] arr = {1,2,3,4,5,6};



        boolean res= sortedAndStrinctlyInc(arr, 0);
        System.out.println(res);
        //move all x of the string to end
        String ss= "axnxjxaxlxix";

       moveAllToEnd(ss, 0, " ",0); //o(n+count)

      String s2= "abbccda";
       removeDuplicatFromString(s2, " ", 0 );

       String s3= "abc";

      printAllSub(s3, " ", 0);



    }


}
