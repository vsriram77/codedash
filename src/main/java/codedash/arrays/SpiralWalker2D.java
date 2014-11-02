package codedash.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Traverse/Print a 2D matrix in a spiral order (epi6.22)
 */
public class SpiralWalker2D {

    public static List<Integer> doSpiralWalk(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        int upMarker = 0;
        int downMarker = matrix.length - 1;
        int leftMarker = 0;
        int rightMarker = matrix.length - 1;

        for (;(upMarker <= downMarker) && (leftMarker <= rightMarker);) {
            // walk left
            for (int i = leftMarker; i <= rightMarker; i++) {
                result.add(matrix[upMarker][i]);
            }
            upMarker++;

            // walk down
            for (int i = upMarker; i <= downMarker; i++) {
                result.add(matrix[i][rightMarker]);
            }
            rightMarker--;

            // walk right
            for (int i = rightMarker; i >= leftMarker; i--) {
                result.add(matrix[downMarker][i]);
            }
            downMarker--;

            // walk up
            for (int i = downMarker; i >= upMarker; i--) {
                result.add(matrix[i][leftMarker]);
            }
            leftMarker++;
        }

        if (matrix.length % 2 == 1) {

        }

        return result;
    }
}