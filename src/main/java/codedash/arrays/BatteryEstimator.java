package codedash.arrays;

import com.google.common.base.Preconditions;

/**
 * Minimum Battery Capacity required as robot goes uphill and downhill (epi6.8)
 */
public class BatteryEstimator {

    public static int estimateCapacityRequired(int[] points) {
        Preconditions.checkNotNull(points);

        if (points.length < 2) {
            return 0;
        }

        int pivotIdx = 0;
        int capacity = 0;
        for (int i = 1; i < points.length; i++) {
            int delta = points[i] - points[pivotIdx];
            capacity = Math.max(delta, capacity);
            pivotIdx = (delta < 0)? i : pivotIdx;
        }

        return capacity;
    }
}
