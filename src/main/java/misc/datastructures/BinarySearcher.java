package misc.datastructures;

/**
 * Binary search
 */
public class BinarySearcher {
    /**
     * binary search; then scan left - would approach O(N) if k is present widely in array
     */
    public static int find(int[] in, int k) {

        int l = 0;
        int m = in.length - 1;
        while (l <= m) {
            int c = l + (m - l)/2;
            if (in[c] < k) {
                l = c + 1;
            } else if (in[c] > k) {
                m = c - 1;
            } else {
                int i = c;
                for (; i>=0 && in[i] == k; i--) {
                    continue;
                }
                return i+1;
            }
        }
        return -1;
    }

    /**
     * full binary search impl: Cost O(log N)
     */
    public static int countOccurrences(int[] in, int k) {

        int left = 0;
        int right = in.length - 1;
        boolean done = false;
        int c = 0;
        while (!done) {
            c = left + (right - left)/2;
            if (in[c] < k) {
                left = c + 1;
            } else if (in[c] > k) {
                right = c - 1;
            } else {
                if (c == 0 || in[c - 1] != k) {
                    break;
                }
                right = c - 1;
            }
        }
        int firstIndex = (in[c] == k)? c : -1;

        if (firstIndex == -1) {
            return -1;
        }

        left = 0;
        right = in.length - 1;
        done = false;
        while (!done) {
            c = left + (right - left)/2;
            if (in[c] < k) {
                left = c + 1;
            } else if (in[c] > k) {
                right = c - 1;
            } else {
                if (c == (in.length - 1) || in[c + 1] != k) {
                    break;
                }
                left = c + 1;
            }
        }
        int lastIndex = (in[c] == k)? c : -1;

        return lastIndex - firstIndex + 1;
    }

    /**
     * Find first elem greater than k
     */
    public static int findFirstGreaterThan(int[] in, int k) {

        int l = 0;
        int m = in.length - 1;
        int result = -1;
        while (l <= m) {
            int c = l + (m - l)/2;
            if (in[c] <= k) {
                l = c + 1;
            } else if (in[c] > k) {
                m = c - 1;
            }
        }

        return ((l >= in.length)? -1 : l);
    }

}
