package assessment2026;

public class TestAllSubString019 {

    public static void main (String args []){

        String s = "abcd";
         /*String output = 'a'
                    'ab'
                    'abc'
                     'abcd'

                     'b'
                     'bc'
                     'bcd'

                      'c'
                      'cd'
                      'd'*/


        for (int i =0;i<=3; i++){

            for(int j=i+1; j<=4; j++){


                System.out.println(s.substring(i, j));


            }



        }









    }



}
