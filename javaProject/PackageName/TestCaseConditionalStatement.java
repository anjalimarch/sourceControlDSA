package PackageName;

import java.util.Scanner;

public class TestCaseConditionalStatement {

    public static void main(String args []){


        int caseNum;
        System.out.println("going to conditional statements");
        Scanner sc = new Scanner(System.in);
        caseNum=sc.nextInt();


        switch(caseNum){

            case 1 : System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjoure");
            break;
            default: System.out.println("Invalid button");






        }


    }
}
