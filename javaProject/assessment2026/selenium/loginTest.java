package assessment2026.selenium;

public class loginTest {




    // login test both username & password must be non-empty
 public static boolean validateLogin(String username, String password  ){

     if(username.length()>0 && password.length()>0){
                return true;

     }else{


         return false;
     }



 }


 public static int countFails(String [] responseOfTest, int count ){

     for(String res : responseOfTest){

         if(res== "Fail" ||res.equals("Fail")){

             count++;


         }


     }

     return count;


 }


  /*  static int countFails(String[] arr) {
        int count = 0;
        for (String s : arr)
            if (s.equals("Fail")) count++;
        return count;
    }*/

    //lock account after two consecutive failures
    static boolean isLocked (String [] resultSet){

       int countOfFail= 0;
        for(String res: resultSet){

            if(res.equals("Fail")){

                countOfFail++;

                if(countOfFail==3){

                    return true;

                }

                 }else {

                   countOfFail=0;


              }




        }


        return false;






    }

    // First failed login index
    static int firstFailedLogin (String [] a ){

        for(int i=0; i<a.length; i++){

            if(a[i]=="Fail"){


                return i;
            }

        }

        return -1;

    }

    //Email format validation

  /*  static boolean validateFormat(String email){


        if(email.contains("@") && email.contains("."))

        {

            return true;

        }


        return false;


    }*/

    //Email format validation
    static boolean validateFormat(String email){

        return email.contains("@") && email.contains(".");


    }


    //mandatory fields are filled
    static boolean allFields(String [] fields ){

        for(String s : fields ){

            if(s.isEmpty()){

                return false;



            }else {


                return true;
            }


        }



        return true;


    }


    static boolean  passwordStrength(String pass){

        if(pass.length()>=8) {
            return true;
        }



            return false;



    }

    //Count enabled buttons
    public static int countEnabledButtons(boolean [] buttons ){

        int count = 0 ;
        for(boolean b : buttons ){

            if(b){

                count ++;


            }


        }
        return count;



    }


    static int  detectDisabledButton(boolean [] bool ){
        int count =0;

        for(boolean val : bool){

            if(!val){

                count ++;
                return count ;
            }




        }

        return 1;



    }


    // maximum allowed time for selenium
    static int allowedTimeout(int [] t, int max ){
        int count =0;
        for(int time: t){

            if(time>max){


                count ++;



            }




        }



        return count;
    }

    // if after two consecuting failure retry needed how many retries should be here
    static int retryNeeded(String [] in){

        int retry =0;

        for(int i = 1; i<in.length; i++){

            if(in [i].equals("Fail")&& in[i-1].equals("Fail")){


                retry ++;

            }




        }



        return retry ;
    }



    static int longestStableRun(String [] run ){


        int curr =0;
        int max = 0;

        for (String a : run ){

            if(a.equals("PASS")){

                curr++;

              /*if(curr>max ) {


                  max = curr;
              }*/

                max = Math.max(max, curr);


            }else{

                curr =0 ; // resetting on a failure is very important

            }





        }

        return max;






    }



    static boolean flakyTestDetected(String [] run){

        for (int i=0; i<run.length-2; i++){

            if(run[i].equals("Pass")&&run[i+1].equals("Fail")&& run[i+2].equals("Pass")){

                return true;




            }




        }


        return false;
    }


    public static void main (String args [] ){

        // login test both username & password must be non-empty

        String username = "admin";
        String password = "";


       boolean result =  validateLogin(username, password);
       System.out.println(result);

       //count Failed login attempt


        String[] resultSet = {"Pass","Fail", "Fail", "Pass", "Fail"};

        int iter= countFails(resultSet, 0);
       // int iter= countFails(resultSet);

        System.out.println(iter);

        //lock account after two consecutive failures

        String [] failRes= {"Fail","Fail", "Fail","True", "True"};

         boolean res =   isLocked(failRes);

          System.out.println("is locked "+res);

        // First failed login index

        String [] resultSetFirst = {"Pass", "Pass", "Fail", "Pass"};

       int resultOfLogin =  firstFailedLogin(resultSetFirst);

       System.out.println(resultOfLogin);

       //Email format validation

        String email = "test@gmail.com";
       boolean format =  validateFormat(email);

       System.out.println("format"+format );

       //mandatory fields are filled
        String [] fields = {"name","email","password",""};
        boolean resISEmpty =  allFields(fields);

        System.out.println("isEmpty"+resISEmpty);

       // password Strength

        String lenPass = "Test@123";

       boolean checkLen=  passwordStrength(lenPass);
       System.out.println("checkLen--"+checkLen);

       //Count enabled buttons

       boolean [] enabledButtons = {true, false, true, true};

       int buttons = countEnabledButtons(enabledButtons);
       System.out.println("buttons -- "+buttons);

      //Detect disabled submit button

        boolean [] bool = {true, true,false};
       int  detect =  detectDisabledButton(bool);
       System.out.println("detect -- "+detect);

  // maximum allowed time for selenium

        int [] t = {5,12,20,7};

        allowedTimeout(t, 10);

        // if after two consecuting failure retry needed how many retries should be here
        String [] input  = {"Fail", "Fail","Pass"}; // needed retry 1
        String [] inputUpadted   = {"Fail", "Fail","Pass","Fail", "Fail"};// needed retry 2
        String [] inputOne = {"Fail", "Fail","Fail"};//2


       int outcome =  retryNeeded(input);

       System.out.println("retry needed :"+outcome);
        int outcome1 =  retryNeeded(inputUpadted);

        System.out.println("retry needed :"+outcome1);
        int outcome2 =  retryNeeded(inputOne);

        System.out.println("retry needed :"+outcome2);


        //give the count of longest stable run :

        String [] run = {"PASS","PASS","FAIL","PASS","PASS","PASS"};

       int count =  longestStableRun(run);

       System.out.println("longestStableRun--"+count );

       //flaky tests in selenium

        String [] flaky = {"Pass", "Fail", "Pass"};
        boolean resultFlaky = flakyTestDetected(flaky);
        System.out.println("resultFlaky--"+resultFlaky );


        String [] flaky1 = {"Fail","Pass", "Fail", "Pass","Fail"};
        boolean resultFlaky1 = flakyTestDetected(flaky1);
        System.out.println("resultFlaky1--"+resultFlaky1 );
    }
    }



