package assessment2026;

public class StringBuilderTest022 {

    public static void main (String args []){


         StringBuilder sb = new StringBuilder("hello");
         sb.append("world");


         System.out.println(sb);
         sb.setCharAt(0,'m');
         System.out.println(sb);
         sb.insert(0, 'y');
        System.out.println(sb);
         sb.deleteCharAt(2);
        System.out.println(sb);

    }

}
