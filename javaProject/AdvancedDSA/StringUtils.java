package AdvancedDSA;



    public class StringUtils {

        public static String removeLeadingSlash(String input) {
            if (input != null && input.startsWith("/")) {
                return input.substring(1);
            }
            return input;
        }

        public static void main(String[] args) {
            String test1 = "/example/path";
            String test2 = "example/path";
            String test3 = "/"; // Edge case: single slash
            String test4 = ""; // Edge case: empty string
            String test5 = null; // Edge case: null string

            System.out.println("Original: " + test1 + " -> Modified: " + removeLeadingSlash(test1));
            System.out.println("Original: " + test2 + " -> Modified: " + removeLeadingSlash(test2));
            System.out.println("Original: " + test3 + " -> Modified: " + removeLeadingSlash(test3));
            System.out.println("Original: " + test4 + " -> Modified: " + removeLeadingSlash(test4));
            System.out.println("Original: " + test5 + " -> Modified: " + removeLeadingSlash(test5));
        }
    }


