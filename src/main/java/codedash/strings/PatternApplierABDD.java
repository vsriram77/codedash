package codedash.strings;

/**
 * String replace : every 'a' to 'dd' and delete every 'b' (epi7.2)
 */
public class PatternApplierABDD {

    public static String findAndReplaceABDD(String input) {
        int outLen = getFinalLengthABDD(input);
        int outIdx = outLen - 1;
        char[] buf = new char[outLen];
        for (int i = input.length() - 1; i >= 0; i--) {
            switch (input.charAt(i)) {
                case 'a':
                    buf[outIdx] = 'd';
                    outIdx--;
                    buf[outIdx] = 'd';
                    outIdx--;
                    break;
                case 'b':
                    break;
                default:
                    buf[outIdx] = input.charAt(i);
                    outIdx--;
            }
        }

        return new String(buf);

    }

    public static int getFinalLengthABDD(String input) {
        int len = 0;
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case 'a': len += 2;
                    break;
                case 'b':
                    break;
                default: len++;
            }
        }
        return len;
    }

}
