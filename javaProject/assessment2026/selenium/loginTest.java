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


    public static void main (String args [] ){

        // login test both username & password must be non-empty

        String username = "admin";
        String password = "";


       boolean result =  validateLogin(username, password);
       System.out.println(result);




    }


}
