package codedash.simple;

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
    public static int find2(int[] in, int k) {

        int l = 0;
        int m = in.length - 1;
        int result = -1;
        while (l <= m) {
            int c = l + (m - l)/2;
            if (in[c] < k) {
                l = c + 1;
            } else if (in[c] > k) {
                m = c - 1;
            } else {
                result =  c;
                m = c - 1;
            }
        }
        return result;
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
