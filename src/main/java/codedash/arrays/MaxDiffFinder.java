package codedash.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Max Diff Finder (variation of epi6.8)
 */
public class MaxDiffFinder {

    /**
     * Max altitude that needs to be climbed
     * @param in seq of altitude climbed
     * @return
     */
    public static int findLargestSum(int[] in) {
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < in.length; i++) {

            sum += in[i];
            sum = (sum < 0)? 0 : sum;
            maxSum = (sum > maxSum)? sum : maxSum;
        }
        return maxSum;
    }

    /**
     * Similar to above, but input is seq of absolute height coordinates
     * @param in seq of altitude climbed
     * @return
     */
    public static int findMaxDiff(int[] in) {
        int diff = 0;
        int maxDiff = 0;

        for (int i = 1; i < in.length; i++) {
            diff += (in[i] - in[i - 1]);

            diff = (diff < 0)? 0 : diff;
            maxDiff = (diff > maxDiff)? diff : maxDiff;
        }
        return maxDiff;
    }
}
