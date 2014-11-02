package codedash.arrays;

import com.google.common.base.Preconditions;

/**
 * Variant of BatteryEstimator Epi6.8.1
 */
public class LongestSubArrayOfEqualsFinder {

    public static int lengthOfLongestSubArray(int[] input) {
        Preconditions.checkNotNull(input);

        int prevMaxLen = 1;
        if (input.length < 2) {
            return input.length;
        }

        int prev = input[0];
        int currMaxLen = 1;
        for (int i = 1; i < input.length; i++) {
            if (input[i] == prev) {
                currMaxLen++;
            } else {
                prevMaxLen = Math.max(prevMaxLen, currMaxLen);
                currMaxLen = 1;
                prev = input[i];
            }
        }

        return Math.max(prevMaxLen, currMaxLen);
    }

}



