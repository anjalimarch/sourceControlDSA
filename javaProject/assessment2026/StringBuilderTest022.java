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

         sb.delete(2,4);

         System.out.println(sb);
         sb.reverse();
         System.out.println(sb);


         String newString= sb.substring(3);
         System.out.println(newString);
         System.out.println(sb);

         String newString1=newString.substring(1,3);
         System.out.println(newString1);


    }

}
