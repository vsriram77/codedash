package codedash.arrays;

import java.util.Random;

/**
 * sample offline data (epi6.16)
 */
public class InPlaceOfflineSampler {

    public static void doSampling(int[] input, int k) {
        Random randomGenerator = new Random();

        for (int i = 0; i < k; i++) {
            int r = randomGenerator.nextInt(input.length - i);
            r += i;
            swap(input, i, r);
        }
    }

    private static void swap(int[] input, int a, int b) {
        if (a == b) {
            return;
        }

        int temp = input[a];
        input[a] = input[b];
        input[b] = temp;
    }

}

