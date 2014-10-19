package codedash.simple;

/**
 * Dutch national flag problem
 */
public class PivotedPartitioner {

    public static void partition(int[] input, int pivotIndex) {
        // FIXME: check pivotIndex for index bounds

        int pivot = input[pivotIndex];
        int li = 0;
        int ci = 0;
        int mi = input.length - 1;
        while (ci < mi) {
            if (input[ci] > pivot) {
                mi = swapLarger(input, ci, mi, input[ci], pivot);
            }

            if (input[ci] < pivot) {
                int temp = input[li];
                input[li] = input[ci];
                input[ci] = temp;
                li++;
            }

            ci++;
        }
    }

    public static int swapLarger(int[] input, int ci, int mi, int value, int pivot) {
        while (input[mi] > pivot && mi > ci) {
            mi--;
        }
        if (mi == ci) {
            return mi;
        }


        int temp = input[mi];
        input[mi] = value;
        input[ci] = temp;

        return mi;
    }
}
