package PackageName;

public class subStringTestApp {

    public static void main(String args[]) {

        String s = "ABC";
        int fi = 0;
        perm(s.toCharArray(), fi);


    }


    public static void perm(char[] a, int fi) {

        if (fi == a.length - 1) {
           for(int k =0; k<a.length;k++){
               System.out.print(a[k]);

           }

            System.out.println(" ");

            return;


        }


        for (int i = fi; i < a.length; i++) {
            char temp = a[i];
            a[i] = a[fi];
            a[fi] = temp;
            perm(a, fi + 1);

            temp = a[i];
            a[i] = a[fi];
            a[fi] = temp;
        }


    }
}
