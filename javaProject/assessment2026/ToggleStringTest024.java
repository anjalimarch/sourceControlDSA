package assessment2026;

public class ToggleStringTest024 {

    // upper to lower and lower to upper

    // toggle all the characters  of the string i.e. to convert Upper case to lower case and vice verso.

    //i/p = Physics
    // o/p = pHYSICS

    public static void main (String args []){


        String str = "PhYSiCS";

       // StringBuilder sb = new StringBuilder(str);
      for(int i=0; i<str.length();i++){


          boolean flag = true;
          char ch =str.charAt(i); //A

          if(ch==' '){

              continue;

          }

          int asci = (int)ch; //65
          if(asci>=97){ //small

              flag=false;

          }
          if(flag==true){ //capital

              asci+=32;
              char dh = (char)asci; //a
              str=str.substring(0,i)+dh+str.substring(i+1);



          }else { //small

              asci -=32;
              char dh = (char)asci;
              str=str.substring(0,i)+dh+str.substring(i+1);


          }

      }
      System.out.println(str);


    }

}
