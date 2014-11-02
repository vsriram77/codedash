package codedash.arrays;

import com.google.common.base.Preconditions;

/**
 * Dutch national flag problem (epi5.1)
 */
public class PivotedPartitioner {

    public static void partition(int[] input, int pivotIndex) {
        assert (pivotIndex >= 0 && pivotIndex < input.length);

        Preconditions.checkNotNull(input);

        int minIndex = 0;
        int maxIndex = input.length - 1;
        int cIndex = 0;
        int pivot = input[pivotIndex];

        while (cIndex < maxIndex) {
            if (input[cIndex] > pivot) {
                maxIndex = pushToEnd(input, pivot, cIndex, maxIndex);
            }

            while (input[cIndex] < pivot) {
                swap(input, cIndex, minIndex);
                cIndex++;
                minIndex++;
            }

            while (cIndex < maxIndex && input[cIndex] == pivot) {
                cIndex++;
            }
        }
    }

    private static int pushToEnd(int[] input, int pivot, int cIndex, int maxIndex) {
        while (input[maxIndex] > pivot && cIndex < maxIndex) {
            maxIndex--;
        }

        swap(input, cIndex, maxIndex);
        return maxIndex;
    }

    private static void swap(int[] input, int a, int b) {
        int tmp = input[a];
        input[a] = input[b];
        input[b] = tmp;
    }

    /*
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
    */
}
