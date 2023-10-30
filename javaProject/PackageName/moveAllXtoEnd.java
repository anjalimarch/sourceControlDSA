package PackageName;

public class moveAllXtoEnd {


    public static void main (String args []){
       // String s = "axbcxxd";
        String s = "axbcxxdxxccxxbbx";
        testMoveAllXtoEnd(s.toCharArray(), 0, 'x');



    }

    public static void  testMoveAllXtoEnd( char [] a, int idx, char toMove){


        char temp ;

        if(idx==a.length-1){

            System.out.println(a);
            return;
        }
        if(a[idx]==toMove){
            int j= a.length-1;
            while(a[j]==toMove){






                    j=j-1;


               if(idx>=j)
               { System.out.println(a);
                   return;

               }





            }

            temp = a[j];
            a[j]= a[idx];
            a[idx]=temp;


        }

            testMoveAllXtoEnd(a,idx+1,toMove);

        }



    }


