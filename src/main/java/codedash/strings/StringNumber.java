package codedash.strings;

/**
 * Store number as a string and convert string to number and viceversa (epi7.1)
 *
 */
public class StringNumber {

    public static int atoi(String value) {

        int result = 0;
        int baseVal = 1;
        for (int i = value.length() - 1; i >= 0; i--) {
            char c = value.charAt(i);
            if (c == '-') {
                result = -result;
            } else {
                result += (value.charAt(i) - '0') * baseVal;
            }
            baseVal *= 10;
        }

        return result;
    }

    public static String itoa(int value) {
        StringBuilder sb = new StringBuilder();
        boolean negative = false;
        if (value < 0) {
            negative = true;
            value = -value;
        } else if (value == 0) {
            return "0";
        }

        while (value > 0) {
            int digit = value % 10;
            sb.append(digit);
            value = value / 10;
        }

        if (negative) {
            sb.append("-");
        }

        return sb.reverse().toString();
    }

    private String value;

    public StringNumber(String value) {
        if (value == null) {
            throw new RuntimeException("invalid input: null");
        }
        this.value = value.trim();
    }

    public StringNumber(int ival) {
        StringBuilder sb = new StringBuilder();

        boolean neg = (ival < 0)? true : false;
        ival = Math.abs(ival);
        while (ival > 0) {
            int rem = ival % 10;
            sb.append(rem);
            ival = (int) ival/10;
        }

        if (neg) {
            sb.append("-");
        }

        value = sb.reverse().toString();
        value = (value.equals(""))? "0" : value;
    }

    public int intValue() {
        if (value.equals("") || value.equals("0")) {
            return 0;
        }

        int result = 0;
        int beginIndex = (value.charAt(0) == '-')? 1 : 0;
        int pow = 1;
        for (int i = value.length() - 1; i >= beginIndex; i--) {
            char c = value.charAt(i);
            if (c < '0' || c > '9') {
                throw new RuntimeException("Bad input: " + value);
            }
            result += (c - '0') * pow;
            pow *= 10;
        }

        return (beginIndex == 0)? result : -result;
    }

    public String toString() {
        return value;
    }
}
