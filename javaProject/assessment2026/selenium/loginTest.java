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

        String [] failRes= {"Fail","Fail", "//Fail","True", "True"};

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




    }


}
