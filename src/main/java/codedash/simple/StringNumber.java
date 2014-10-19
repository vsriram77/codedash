package codedash.simple;

/**
 * Store number as a string and convert string to number and viceversa
 * 10.05am
 */
public class StringNumber {

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
