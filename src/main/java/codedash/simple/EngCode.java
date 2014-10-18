package codedash.simple;

/**
 * Base26 number conversion
 *
 */
public class EngCode {
    public static long longValue(String engCode) {
        if (! isEngCode(engCode)) {
            throw new RuntimeException("Bad engCode (must be [a-zA-Z]): " + engCode);
        }

        engCode = engCode.toUpperCase();
        int numDigits = engCode.length();
        int i = 1;
        long result = 0;
        for (char c : engCode.toCharArray()) {
            int ival = c - 'A';
            System.out.println("c="+c + " ival="+ival);
            result += (long) Math.pow(26, numDigits-i) + ival;
            i++;
        }
        return result;
    }

    public static boolean isEngCode(String token) {
        for (char c : token.toCharArray()) {
            boolean small = (c >= 'a' && c <= 'z');
            boolean caps = (c >= 'A' && c <= 'Z');

            if (! small && ! caps) {
                return false;
            }
        }
        return true;
    }
}
