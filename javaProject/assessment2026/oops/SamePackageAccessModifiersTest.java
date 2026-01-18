package assessment2026.oops;

import modifiersImplementationPackage.AnjaliPackageTest;

public class SamePackageAccessModifiersTest extends  C1 {


    void meth2() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        // System.out.println(a);

    }
}

     class UsingPackage2 {


        public static void main(String[] args) {


            SamePackageAccessModifiersTest c = new SamePackageAccessModifiersTest();



            c.meth2();
        }





}



