package codedash.strings;

/**
 * Check for palindrome with non-alphanumeric chars thrown in (epi7.3)
 */
public class LoosePalindromeChecker {

    public static boolean isPalindrome(String input) {
        // handle null, empty

        int left = forwardToAlphaNumeric(input, 0);
        if (left == -1)
            return true;
        int right = reverseToAlphaNumeric(input, input.length() - 1);

        while (left < right) {
            if (input.charAt(left) != input.charAt(right))
                return false;

            left = forwardToAlphaNumeric(input, left + 1);
            right = reverseToAlphaNumeric(input, right - 1);
        }

        return true;
    }

    public static int forwardToAlphaNumeric(String input, int startIndex) {
        while ( startIndex < input.length() && !Character.isLetterOrDigit(input.charAt(startIndex)))
        startIndex++;
        return (startIndex < input.length())? startIndex : -1;
    }


    public static int reverseToAlphaNumeric(String input, int startIndex) {
        while ( startIndex >= 0 && !Character.isLetterOrDigit(input.charAt(startIndex)))
        startIndex--;
        return (startIndex >= 0)? startIndex : -1;
    }

}
