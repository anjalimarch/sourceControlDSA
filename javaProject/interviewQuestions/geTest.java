package interviewQuestions;

import java.util.Arrays;

public class geTest {
    public static void main(String args[]) {
        String s1 = "silent";
        String s2 = "listen";

        boolean result = validate(s1, s2);
        printBool(result);
    }

    public static boolean validate(String a, String b) {
        if (a.length() != b.length()) return false;

        char[] chars1 = a.toCharArray();
        char[] chars2 = b.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return manualEquals(chars1, chars2);
    }


    public static boolean manualEquals(char[] a, char[] b) {
        // 1. Check if they are the same object
        if (a == b) {
            return true;
        }

        // 2. Check for null or length mismatch
        if (a == null || b == null || a.length != b.length) {
            return false;
        }

        // 3. Compare each element
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false; // Exit immediately if any character differs
            }
        }

        return true; // All characters matched
    }

    public static void printBool(boolean flag) {
        if (flag) {
            System.out.println("Strings have same chars");
        } else {
            System.out.println("Strings do not have same chars");
        }
    }
}
