package interviewQuestions;

public class checkTwoStrings {

    static String getString(char x)
    {

        // String class has a constructor
        // that allows us to specify size of
        // String as first parameter and character
        // to be filled in given size as second
        // parameter.
        String s = String.valueOf(x);
        return s;
    }

    // Function that returns true if
// the given Strings contain same
// characters in same order
    static boolean solve(String s1, String s2)
    {
        // Get the first character of both Strings
        String a = getString(s1.charAt(0)),
                b = getString(s2.charAt(0));

        // Now if there are adjacent similar character
        // remove that character from s1
        for (int i = 1; i < s1.length(); i++)
            if (s1.charAt(i) != s1.charAt(i - 1))
            {
                a += getString(s1.charAt(i));
            }

        // Now if there are adjacent similar character
        // remove that character from s2
        for (int i = 1; i < s2.length(); i++)
            if (s2.charAt(i) != s2.charAt(i - 1))
            {
                b += getString(s2.charAt(i));
            }

        // If both the Strings are equal
        // then return true
        if (a.equals(b))
            return true;

        return false;
    }

    // Driver code
    public static void main(String[] args)
    {
        String s1 = "earth", s2 = "htrae";

        if (solve(s1, s2))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}

