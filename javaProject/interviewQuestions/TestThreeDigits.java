package interviewQuestions;

import java.util.ArrayList;

public class TestThreeDigits {

    public static void main(String[] args) {


        int[] a = {123, 2, 5, 555, 7888, 877, 989898, 111, 323, 545, 5665};
        ArrayList l=  arrayInsert(a);
        convertToArray(l);


    }


    public static ArrayList<Integer> arrayInsert(int[] a) {

        ArrayList<Integer> output = new ArrayList<Integer>();


        for (int i : a) {

            if (i > 99 && i < 1000) {


                System.out.println(i);

                output.add(i);

            }

        }


        System.out.println(output);

        return output;
//        Object[] ob= output.toArray();
//
//        for (Object val : ob)
//            System.out.print(val + " ");
//    }


    }


    public static void convertToArray(ArrayList output) {


        int arraySize = output.size();

        Object[] finalOP = new Object[arraySize];


        for (int j = 0; j < finalOP.length; j++) {


              finalOP[j] = output.get(j);


        }

        for (Object obj : finalOP)
            System.out.print(obj + " ");
        }



}












