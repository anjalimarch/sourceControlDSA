package Revision;

public class StringBuildertest {

    public static void main (String args []){

        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
       // sb.charAt(0);
       // System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'p');
        System.out.println(sb);

        sb.insert(0, 'M');
        System.out.println(sb);
         sb.delete(1,3);
        System.out.println(sb);
         sb.append('T');
        System.out.println(sb);
    }


}
