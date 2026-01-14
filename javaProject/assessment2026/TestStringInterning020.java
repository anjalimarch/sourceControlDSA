package assessment2026;

public class TestStringInterning020 {


    public static void main (String args []){

        String s = "Hello";
        String x = "Hello";

        x="Mello"; //s?

        System.out.println(s);
        System.out.println(x);


    }


}
