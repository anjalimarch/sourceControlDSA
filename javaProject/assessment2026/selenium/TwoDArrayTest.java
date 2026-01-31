package assessment2026.selenium;

public class TwoDArrayTest {



  static void  printArray (int [] [] m){

       for(int i=0; i<m.length; i++){//row

           for(int j=0; j<m[i].length;j++){//col

               System.out.println(  "  m["+i+"]["+j+"]--"+m[i][j]);


           }
       }


    }


/*
*
*
*
* | Test Case     | Chrome | Firefox | Edge |
| ------------- | ------ | ------- | ---- |
| Login Test    | PASS   | FAIL    | PASS |
| Checkout Test | PASS   | PASS    | FAIL |
*
* | Row | Col 0 | Col 1 | Col 2 |
| --- | ----- | ----- | ----- |
| 0   | 1     | 0     | 1     |
| 1   | 1     | 1     | 0     |

*
*
*
*
*
*
*/


    static int maxFaiuresAtWhicCase(int [][] m ){


        int max = -1 ;
        int rowIndex = 0;

        for(int i=0; i<m.length; i++){
            int countF= 0;

            for(int j=0; j<m[i].length; j++){



                if(m[i][j]==0){

                    countF++;

                }





            }



            //failure at row level

            if(countF>max) {
                   max = countF;
                   rowIndex=i;



            }

        }

        return rowIndex;


    }


    static int maxFaiures(int [] [] m ){



       for (int i =0; i<m.length; i++){

           for(int j=0; j<m[i].length; j++){






           }



       }

  return  -1;

    }


    static int maxFaiuresAtWhichbrowserLevel(int [][]m){

        int max =-1;
        int brw= 0;

        for (int j=0; j<m[0].length; j++){
               int countfail =0;

            for(int i=0; i<m.length; i++){

                System.out.println(  "  m["+i+"]["+j+"]--"+m[i][j]);

                if(m[i][j]==0){

                    countfail++;



                }



            }


            if(countfail>max){

                max=countfail;
                brw=j;



            }
        }

        return brw;





    }










    public static void main (String args [] ){


        int [] [] report = {


                {1,0,0},
                {1,1,0},
                {1,0,0},


        };


        int [] [] ok = {


                {1,0,1},
                {1,1}


        };


        System.out.println (report.length);// rows
        System.out.println(report[0].length);//cols
        System.out.println(report[1].length);//cols
      //  printArray(report);
       // printArray(ok);


        //count failures of the tests

        // fail ==0
        int count = maxFaiuresAtWhicCase(report);
        System.out.println("tc  -- "+count);
        int countbrowser = maxFaiuresAtWhichbrowserLevel(report);
        System.out.println("browser level  -- "+countbrowser);





    }
}
