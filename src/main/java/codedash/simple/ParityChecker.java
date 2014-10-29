package codedash.simple;

/**
 * Check whether given number is even or odd parity.
 *
 * See http://sys.cs.rice.edu/course/comp314/10/p2/javabits.html for bit op ref
 */
public class ParityChecker {
    private static byte[] parityTable = new byte[16];

    static {
        parityTable[ 0b0000 ] = 0;
        parityTable[ 0b0001 ] = 1;
        parityTable[ 0b0010 ] = 1;
        parityTable[ 0b0011 ] = 0;
        parityTable[ 0b0100 ] = 1;
        parityTable[ 0b0101 ] = 0;
        parityTable[ 0b0110 ] = 0;
        parityTable[ 0b0111 ] = 1;
        parityTable[ 0b1000 ] = 1;
        parityTable[ 0b1001 ] = 0;
        parityTable[ 0b1010 ] = 0;
        parityTable[ 0b1011 ] = 1;
        parityTable[ 0b1100 ] = 0;
        parityTable[ 0b1101 ] = 1;
        parityTable[ 0b1110 ] = 1;
        parityTable[ 0b1111 ] = 0;
    }

    public static int checkParity(long value) {
        int longSize = 64;
        int count = longSize/4;

        int prevParity = 0;
        for (int i = 0; i < count; i++) {
            int curr = (int) value & 0B1111;
            int cp = parityTable[ curr ];
            prevParity = prevParity ^ cp;
            value = value >>> 4;
        }

        return prevParity;
    }

}
